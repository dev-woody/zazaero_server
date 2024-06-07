package com.zazaero.data.mapper;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.entity.entity.IndCfgEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

public interface IndCfgMapper {

    @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface PopupRegisterMapper extends GenericMapper<PostPopupDTO, IndCfgEntity> {
    }
}
