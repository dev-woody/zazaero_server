package com.zazaero.data.mapper;

import com.zazaero.data.dto.indCfg.PostSchInfoDTO;
import com.zazaero.data.entity.indCfg.SchInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

public interface SchInfoMapper {

    @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface SchInfoPostMapper extends GenericMapper<PostSchInfoDTO, SchInfoEntity> {
    }
}
