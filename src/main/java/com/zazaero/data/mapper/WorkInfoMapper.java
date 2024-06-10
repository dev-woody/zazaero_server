package com.zazaero.data.mapper;

import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.entity.work.WorkInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

public interface WorkInfoMapper {
    @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface WorkInfoPostMapper extends GenericMapper<PostWorkInfoDTO, WorkInfoEntity> {
    }
}
