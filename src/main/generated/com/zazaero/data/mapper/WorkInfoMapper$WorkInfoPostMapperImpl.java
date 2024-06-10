package com.zazaero.data.mapper;

import com.zazaero.data.dto.work.PostWorkInfoDTO;
import com.zazaero.data.entity.work.WorkInfoEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T17:12:05+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class WorkInfoMapper$WorkInfoPostMapperImpl implements WorkInfoMapper.WorkInfoPostMapper {

    @Override
    public PostWorkInfoDTO toDto(WorkInfoEntity e) {
        if ( e == null ) {
            return null;
        }

        PostWorkInfoDTO postWorkInfoDTO = new PostWorkInfoDTO();

        postWorkInfoDTO.setWorkName( e.getWorkName() );
        postWorkInfoDTO.setWorkSdate( e.getWorkSdate() );
        postWorkInfoDTO.setWorkEdate( e.getWorkEdate() );

        return postWorkInfoDTO;
    }

    @Override
    public WorkInfoEntity toEntity(PostWorkInfoDTO d) {
        if ( d == null ) {
            return null;
        }

        WorkInfoEntity.WorkInfoEntityBuilder<?, ?> workInfoEntity = WorkInfoEntity.builder();

        workInfoEntity.workName( d.getWorkName() );
        workInfoEntity.workSdate( d.getWorkSdate() );
        workInfoEntity.workEdate( d.getWorkEdate() );

        return workInfoEntity.build();
    }

    @Override
    public void updateFromDto(PostWorkInfoDTO dto, WorkInfoEntity entity) {
        if ( dto == null ) {
            return;
        }
    }
}
