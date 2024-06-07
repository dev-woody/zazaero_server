package com.zazaero.data.mapper;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.entity.entity.IndCfgEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-05T16:10:56+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class IndCfgMapper$PopupRegisterMapperImpl implements IndCfgMapper.PopupRegisterMapper {

    @Override
    public PostPopupDTO toDto(IndCfgEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PostPopupDTO postPopupDTO = new PostPopupDTO();

        postPopupDTO.setCfg_date_val1( arg0.getCfg_date_val1() );
        postPopupDTO.setCfg_date_val2( arg0.getCfg_date_val2() );
        postPopupDTO.setInd_cfg_use_flag( arg0.getInd_cfg_use_flag() );
        postPopupDTO.setCfg_val1( arg0.getCfg_val1() );
        postPopupDTO.setCfg_val2( arg0.getCfg_val2() );
        postPopupDTO.setCfg_txt_val1( arg0.getCfg_txt_val1() );

        return postPopupDTO;
    }

    @Override
    public IndCfgEntity toEntity(PostPopupDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        IndCfgEntity.IndCfgEntityBuilder indCfgEntity = IndCfgEntity.builder();

        indCfgEntity.cfg_val1( arg0.getCfg_val1() );
        indCfgEntity.cfg_val2( arg0.getCfg_val2() );
        indCfgEntity.cfg_txt_val1( arg0.getCfg_txt_val1() );
        indCfgEntity.cfg_date_val1( arg0.getCfg_date_val1() );
        indCfgEntity.cfg_date_val2( arg0.getCfg_date_val2() );
        indCfgEntity.ind_cfg_use_flag( arg0.getInd_cfg_use_flag() );

        return indCfgEntity.build();
    }

    @Override
    public void updateFromDto(PostPopupDTO arg0, IndCfgEntity arg1) {
        if ( arg0 == null ) {
            return;
        }

        if ( arg0.getCfg_val1() != null ) {
            arg1.setCfg_val1( arg0.getCfg_val1() );
        }
        if ( arg0.getCfg_val2() != null ) {
            arg1.setCfg_val2( arg0.getCfg_val2() );
        }
        if ( arg0.getCfg_txt_val1() != null ) {
            arg1.setCfg_txt_val1( arg0.getCfg_txt_val1() );
        }
        if ( arg0.getCfg_date_val1() != null ) {
            arg1.setCfg_date_val1( arg0.getCfg_date_val1() );
        }
        if ( arg0.getCfg_date_val2() != null ) {
            arg1.setCfg_date_val2( arg0.getCfg_date_val2() );
        }
        if ( arg0.getInd_cfg_use_flag() != null ) {
            arg1.setInd_cfg_use_flag( arg0.getInd_cfg_use_flag() );
        }
    }
}
