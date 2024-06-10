package com.zazaero.data.mapper;

import com.zazaero.data.dto.indCfg.PostSchInfoDTO;
import com.zazaero.data.entity.indCfg.SchInfoEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T17:12:05+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SchInfoMapper$SchInfoPostMapperImpl implements SchInfoMapper.SchInfoPostMapper {

    @Override
    public PostSchInfoDTO toDto(SchInfoEntity e) {
        if ( e == null ) {
            return null;
        }

        PostSchInfoDTO postSchInfoDTO = new PostSchInfoDTO();

        postSchInfoDTO.setRegMemUid( e.getRegMemUid() );
        postSchInfoDTO.setSelMemUid( e.getSelMemUid() );
        postSchInfoDTO.setSchTypeUid( e.getSchTypeUid() );
        postSchInfoDTO.setSchSmsUid( e.getSchSmsUid() );
        postSchInfoDTO.setSchDate( e.getSchDate() );
        postSchInfoDTO.setSchTime( e.getSchTime() );
        postSchInfoDTO.setSchEndDate( e.getSchEndDate() );
        postSchInfoDTO.setSchEndTime( e.getSchEndTime() );
        postSchInfoDTO.setSchTitle( e.getSchTitle() );
        postSchInfoDTO.setSchMemo( e.getSchMemo() );
        postSchInfoDTO.setClientUid( e.getClientUid() );

        return postSchInfoDTO;
    }

    @Override
    public SchInfoEntity toEntity(PostSchInfoDTO d) {
        if ( d == null ) {
            return null;
        }

        SchInfoEntity.SchInfoEntityBuilder<?, ?> schInfoEntity = SchInfoEntity.builder();

        schInfoEntity.regMemUid( d.getRegMemUid() );
        schInfoEntity.selMemUid( d.getSelMemUid() );
        schInfoEntity.schTypeUid( d.getSchTypeUid() );
        schInfoEntity.schSmsUid( d.getSchSmsUid() );
        schInfoEntity.schDate( d.getSchDate() );
        schInfoEntity.schTime( d.getSchTime() );
        schInfoEntity.schEndDate( d.getSchEndDate() );
        schInfoEntity.schEndTime( d.getSchEndTime() );
        schInfoEntity.schTitle( d.getSchTitle() );
        schInfoEntity.schMemo( d.getSchMemo() );
        schInfoEntity.clientUid( d.getClientUid() );

        return schInfoEntity.build();
    }

    @Override
    public void updateFromDto(PostSchInfoDTO dto, SchInfoEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getRegMemUid() != null ) {
            entity.setRegMemUid( dto.getRegMemUid() );
        }
        if ( dto.getSelMemUid() != null ) {
            entity.setSelMemUid( dto.getSelMemUid() );
        }
        if ( dto.getSchTypeUid() != null ) {
            entity.setSchTypeUid( dto.getSchTypeUid() );
        }
        if ( dto.getSchSmsUid() != null ) {
            entity.setSchSmsUid( dto.getSchSmsUid() );
        }
        if ( dto.getSchDate() != null ) {
            entity.setSchDate( dto.getSchDate() );
        }
        if ( dto.getSchTime() != null ) {
            entity.setSchTime( dto.getSchTime() );
        }
        if ( dto.getSchEndDate() != null ) {
            entity.setSchEndDate( dto.getSchEndDate() );
        }
        if ( dto.getSchEndTime() != null ) {
            entity.setSchEndTime( dto.getSchEndTime() );
        }
        if ( dto.getSchTitle() != null ) {
            entity.setSchTitle( dto.getSchTitle() );
        }
        if ( dto.getSchMemo() != null ) {
            entity.setSchMemo( dto.getSchMemo() );
        }
        if ( dto.getClientUid() != null ) {
            entity.setClientUid( dto.getClientUid() );
        }
    }
}
