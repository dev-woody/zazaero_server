package com.zazaero.controller;

import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.entity.work.WorkInfoEntity;
import com.zazaero.service.WorkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/work-info")
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
        return workInfoService.save(dto);
    }

    // 수정
//    @PutMapping("/{workUid}")
//    public WorkInfoEntity updateWorkInfo(@PathVariable Integer workUid, @RequestBody PostWorkInfoDTO dto) {
//        return workInfoService.updateWorkInfo(workUid, dto);
//    }
}
