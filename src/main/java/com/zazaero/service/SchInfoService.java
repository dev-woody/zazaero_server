package com.zazaero.service;

import com.zazaero.data.dto.indCfg.PostSchInfoDTO;
import com.zazaero.data.entity.indCfg.SchInfoEntity;
import com.zazaero.data.mapper.SchInfoMapper.SchInfoPostMapper;
import com.zazaero.data.repository.SchInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchInfoService {

    private final SchInfoRepository schInfoRepository;
    private final SchInfoPostMapper schInfoMapper;

    @Autowired
    public SchInfoService(SchInfoRepository schInfoRepository, SchInfoPostMapper schInfoMapper) {
        this.schInfoRepository = schInfoRepository;
        this.schInfoMapper = schInfoMapper;
    }

    public SchInfoEntity save(PostSchInfoDTO dto) {
        return schInfoRepository.save(schInfoMapper.toEntity(dto));
    }
}
