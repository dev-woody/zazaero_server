package com.zazaero.data.repository;

import com.zazaero.data.entity.work.WorkInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkInfoRepository extends JpaRepository<WorkInfoEntity, Integer> {
    // 필요에 따라 커스텀 쿼리 메서드를 추가할 수 있습니다.
}
