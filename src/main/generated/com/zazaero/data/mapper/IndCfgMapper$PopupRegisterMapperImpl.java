package com.zazaero.data.mapper;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.entity.indCfg.IndCfgEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T17:12:05+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class IndCfgMapper$PopupRegisterMapperImpl implements IndCfgMapper.PopupRegisterMapper {

    @Override
    public PostPopupDTO toDto(IndCfgEntity e) {
        if ( e == null ) {
            return null;
        }

        PostPopupDTO postPopupDTO = new PostPopupDTO();

        postPopupDTO.setCfgDateVal1( e.getCfgDateVal1() );
        postPopupDTO.setCfgDateVal2( e.getCfgDateVal2() );
        postPopupDTO.setIndCfgUseFlag( e.getIndCfgUseFlag() );
        postPopupDTO.setCfgVal1( e.getCfgVal1() );
        postPopupDTO.setCfgVal2( e.getCfgVal2() );
        postPopupDTO.setCfgTxtVal1( e.getCfgTxtVal1() );
        postPopupDTO.setRegMemUid( e.getRegMemUid() );

        return postPopupDTO;
    }

    @Override
    public IndCfgEntity toEntity(PostPopupDTO d) {
        if ( d == null ) {
            return null;
        }

        IndCfgEntity.IndCfgEntityBuilder<?, ?> indCfgEntity = IndCfgEntity.builder();

        indCfgEntity.cfgVal1( d.getCfgVal1() );
        indCfgEntity.cfgVal2( d.getCfgVal2() );
        indCfgEntity.cfgTxtVal1( d.getCfgTxtVal1() );
        indCfgEntity.cfgDateVal1( d.getCfgDateVal1() );
        indCfgEntity.cfgDateVal2( d.getCfgDateVal2() );
        indCfgEntity.indCfgUseFlag( d.getIndCfgUseFlag() );
        indCfgEntity.regMemUid( d.getRegMemUid() );

        return indCfgEntity.build();
    }

    @Override
    public void updateFromDto(PostPopupDTO dto, IndCfgEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getCfgVal1() != null ) {
            entity.setCfgVal1( dto.getCfgVal1() );
        }
        if ( dto.getCfgVal2() != null ) {
            entity.setCfgVal2( dto.getCfgVal2() );
        }
        if ( dto.getCfgTxtVal1() != null ) {
            entity.setCfgTxtVal1( dto.getCfgTxtVal1() );
        }
        if ( dto.getCfgDateVal1() != null ) {
            entity.setCfgDateVal1( dto.getCfgDateVal1() );
        }
        if ( dto.getCfgDateVal2() != null ) {
            entity.setCfgDateVal2( dto.getCfgDateVal2() );
        }
        if ( dto.getIndCfgUseFlag() != null ) {
            entity.setIndCfgUseFlag( dto.getIndCfgUseFlag() );
        }
        if ( dto.getRegMemUid() != null ) {
            entity.setRegMemUid( dto.getRegMemUid() );
        }
    }
}
