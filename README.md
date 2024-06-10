# 백엔드 작성 규칙

## 개요

이 문서는 백엔드 개발 시 준수해야 할 규칙을 정의합니다. 이 규칙은 일관성 있는 코드 작성과 유지 보수를 용이하게 하기 위해 마련되었습니다.

## 엔티티(Entity)

### 엔티티 기본 구조

- 엔티티 클래스는 `@Entity`, `@Table` 어노테이션을 사용하여 정의합니다.
- `@DynamicInsert`, `@DynamicUpdate` 어노테이션을 사용하여 동적 인서트 및 업데이트를 활성화합니다.
- 엔티티 클래스는 `DefaultBaseEntity`, `ModifyBaseEntity`, `DeleteBaseEntity` 등을 상속받아 공통 필드를 정의합니다.
- `@AttributeOverrides` 어노테이션을 사용하여 기본 엔티티 클래스의 필드 이름을 재정의합니다.

### 예시

```java
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Builder
@Table(name = "work_info")
@AttributeOverrides({
        @AttributeOverride(name = "uid", column = @Column(name = "work_uid")),
        @AttributeOverride(name = "modMemUid", column = @Column(name = "mod_mem_uid")),
        @AttributeOverride(name = "modDate", column = @Column(name = "mod_date")),
        @AttributeOverride(name = "modTime", column = @Column(name = "mod_time")),
        @AttributeOverride(name = "regMemUid", column = @Column(name = "reg_mem_uid")),
        @AttributeOverride(name = "regDate", column = @Column(name = "reg_date")),
        @AttributeOverride(name = "regTime", column = @Column(name = "reg_time"))
})
public class WorkInfoEntity extends ModifyBaseEntity {
    @Column(name = "work_name", nullable = false, length = 200)
    private String workName;

    @Column(name = "work_sdate", nullable = false)
    private Date workSdate;

    @Column(name = "work_edate", nullable = false)
    private Date workEdate;

    @PrePersist
    public void prePersist() {
        super.prePersist();
        if (this.regMemUid == null) {
            this.regMemUid = 0;
        }
    }

    @Builder
    public WorkInfoEntity(Integer regMemUid, String workName, Date workSdate, Date workEdate) {
        super();
        this.regMemUid = regMemUid;
        this.workName = workName;
        this.workSdate = workSdate;
        this.workEdate = workEdate;
    }
}
```

## DTO (Data Transfer Object)

### DTO 기본 구조
- DTO 클래스는 `@Data`, `@NoArgsConstructor`, `@AllArgsConstructor` 어노테이션을 사용하여 정의합니다.
- 필드 이름은 카멜 케이스를 사용합니다.

### 예시
```java
package com.zazaero.data.dto.work;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostWorkInfoDTO {
    private Integer regMemUid;
    private String workName;
    private Date workSdate;
    private Date workEdate;
}
```

## 서비스(Service)

### 서비스 기본 구조

- 서비스 클래스는 `@Service` 어노테이션을 사용하여 정의합니다.
- 서비스 클래스는 비즈니스 로직을 처리하며, 엔티티를 생성, 조회, 수정, 삭제하는 메서드를 포함합니다.

### 예시
```java
package com.zazaero.service;

import com.zazaero.data.entity.WorkInfoEntity;
import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.repository.WorkInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkInfoService {

    private final WorkInfoRepository workInfoRepository;

    @Autowired
    public WorkInfoService(WorkInfoRepository workInfoRepository) {
        this.workInfoRepository = workInfoRepository;
    }

    public List<WorkInfoEntity> getAllWorkInfo() {
        return workInfoRepository.findAll();
    }

    public Optional<WorkInfoEntity> getWorkInfoById(Integer workUid) {
        return workInfoRepository.findById(workUid);
    }

    public WorkInfoEntity createWorkInfo(PostWorkInfoDTO dto) {
        WorkInfoEntity workInfo = WorkInfoEntity.builder()
                .workName(dto.getWorkName())
                .workSdate(dto.getWorkSdate())
                .workEdate(dto.getWorkEdate())
                .regMemUid(dto.getRegMemUid())
                .build();
        return workInfoRepository.save(workInfo);
    }

    public WorkInfoEntity updateWorkInfo(Integer workUid, PostWorkInfoDTO dto) {
        Optional<WorkInfoEntity> optionalWorkInfo = workInfoRepository.findById(workUid);
        if (optionalWorkInfo.isPresent()) {
            WorkInfoEntity workInfo = optionalWorkInfo.get();
            workInfo.setWorkName(dto.getWorkName());
            workInfo.setWorkSdate(dto.getWorkSdate());
            workInfo.setWorkEdate(dto.getWorkEdate());
            return workInfoRepository.save(workInfo);
        } else {
            throw new RuntimeException("WorkInfo not found with id " + workUid);
        }
    }
}
```

## 컨트롤러(Controller)

### 컨트롤러 기본 구조

- 컨트롤러 클래스는 `@RestController`와 `@RequestMapping` 어노테이션을 사용하여 정의합니다.
- CRUD 기능을 제공하는 엔드포인트를 정의합니다.

### 예시

```java
package com.zazaero.controller;

import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.entity.WorkInfoEntity;
import com.zazaero.service.WorkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/work-info")
public class WorkInfoController {

    private final WorkInfoService workInfoService;

    @Autowired
    public WorkInfoController(WorkInfoService workInfoService) {
        this.workInfoService = workInfoService;
    }

    // 전체 조회
    @GetMapping
    public List<WorkInfoEntity> getAllWorkInfo() {
        return workInfoService.getAllWorkInfo();
    }

    // work_uid로 조회
    @GetMapping("/{workUid}")
    public Optional<WorkInfoEntity> getWorkInfoById(@PathVariable Integer workUid) {
        return workInfoService.getWorkInfoById(workUid);
    }

    // 생성
    @PostMapping
    public WorkInfoEntity createWorkInfo(@RequestBody PostWorkInfoDTO dto) {
        return workInfoService.createWorkInfo(dto);
    }

    // 수정
    @PutMapping("/{workUid}")
    public WorkInfoEntity updateWorkInfo(@PathVariable Integer workUid, @RequestBody PostWorkInfoDTO dto) {
        return workInfoService.updateWorkInfo(workUid, dto);
    }
}
```

## 예시 JSON 데이터
### 생성 요청 JSON 예시
```json
{
  "regMemUid": 1,
  "workName": "Project Planning",
  "workSdate": "2024-06-07",
  "workEdate": "2024-06-30"
}
```

### 수정 요청 JSON 예시
```json
{
  "regMemUid": 1,
  "workName": "Updated Project Planning",
  "workSdate": "2024-07-01",
  "workEdate": "2024-07-15"
}
```

## 기타 규칙

- **카멜 케이스 사용**: 모든 필드 이름은 카멜 케이스를 사용합니다.
- **JSON 필드 일치**: JSON 요청 바디와 DTO 클래스의 필드 이름이 일치하도록 합니다.
- **빌더 패턴 사용**: 엔티티 클래스는 가능한 한 `@Builder` 어노테이션을 사용하여 빌더 패턴을 지원합니다.
- **기본값 설정**: `@PrePersist` 메서드를 사용하여 엔티티가 저장되기 전에 기본값을 설정합니다.
- **기본 생성자 및 접근자**: 모든 DTO 및 엔티티 클래스에는 기본 생성자, 접근자(getters), 설정자(setters)를 정의합니다.
- **서비스 및 컨트롤러**: 서비스 클래스는 비즈니스 로직을 처리하며, 컨트롤러 클래스는 CRUD 기능을 제공하는 엔드포인트를 정의합니다.
- **필드 검증**: 엔티티 클래스의 필드에는 `@Column(nullable = false)`와 같은 검증 어노테이션을 사용하여 데이터 무결성을 보장합니다.
- **DTO 변환**: 서비스 클래스에서 DTO를 엔티티로 변환하거나 그 반대로 변환하는 로직을 포함합니다.
