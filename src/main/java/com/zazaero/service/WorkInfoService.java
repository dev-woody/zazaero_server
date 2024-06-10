package com.zazaero.service;

import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.entity.work.WorkInfoEntity;
import com.zazaero.data.mapper.WorkInfoMapper.WorkInfoPostMapper;
import com.zazaero.data.repository.WorkInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkInfoService {

    private final WorkInfoRepository workInfoRepository;
    private final WorkInfoPostMapper workInfoMapper;

    @Autowired
    public WorkInfoService(WorkInfoRepository workInfoRepository, WorkInfoPostMapper workInfoMapper) {
        this.workInfoRepository = workInfoRepository;
        this.workInfoMapper = workInfoMapper;
    }

    public List<WorkInfoEntity> getAllWorkInfo() {
        return workInfoRepository.findAll();
    }

    public Optional<WorkInfoEntity> getWorkInfoById(Integer workUid) {
        return workInfoRepository.findById(workUid);
    }

    public WorkInfoEntity save(PostWorkInfoDTO dto) {
        return workInfoRepository.save(workInfoMapper.toEntity(dto));
    }

//    public WorkInfoEntity updateWorkInfo(Integer workUid, PostWorkInfoDTO dto) {
//        Optional<WorkInfoEntity> optionalWorkInfo = workInfoRepository.findById(workUid);
//        if (optionalWorkInfo.isPresent()) {
//            WorkInfoEntity workInfo = optionalWorkInfo.get();
//            workInfo.setWorkName(dto.getWorkName());
//            workInfo.setWorkSdate(dto.getWorkSdate());
//            workInfo.setWorkEdate(dto.getWorkEdate());
//            return workInfoRepository.save(workInfo);
//        } else {
//            throw new RuntimeException("WorkInfo not found with id " + workUid);
//        }
//    }
}
