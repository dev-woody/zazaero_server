package com.zazaero.data.mapper;

import com.zazaero.data.dto.PostMemberDTO;
import com.zazaero.data.entity.entity.MemberEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:05:15+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MemberMapper$MasterRegisterMapperImpl implements MemberMapper.MasterRegisterMapper {

    @Override
    public PostMemberDTO toDto(MemberEntity e) {
        if ( e == null ) {
            return null;
        }

        PostMemberDTO postMemberDTO = new PostMemberDTO();

        postMemberDTO.setMem_nickname( e.getMem_nickname() );
        postMemberDTO.setPassword( e.getPassword() );
        postMemberDTO.setMem_name( e.getMem_name() );
        postMemberDTO.setHire_type( e.getHire_type() );
        postMemberDTO.setHire_status( e.getHire_status() );
        postMemberDTO.setTeam_uid( e.getTeam_uid() );
        postMemberDTO.setMem_rank_uid( e.getMem_rank_uid() );
        postMemberDTO.setMem_mobile( e.getMem_mobile() );
        postMemberDTO.setMem_phone( e.getMem_phone() );
        postMemberDTO.setMem_email( e.getMem_email() );
        postMemberDTO.setZonecode( e.getZonecode() );
        postMemberDTO.setAddr1( e.getAddr1() );
        postMemberDTO.setAddr2( e.getAddr2() );
        postMemberDTO.setMemo( e.getMemo() );

        return postMemberDTO;
    }

    @Override
    public MemberEntity toEntity(PostMemberDTO d) {
        if ( d == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder memberEntity = MemberEntity.builder();

        memberEntity.id( d.getId() );
        memberEntity.password( d.getPassword() );
        memberEntity.mem_name( d.getMem_name() );
        memberEntity.hire_type( d.getHire_type() );
        memberEntity.mem_type( d.getMem_type() );
        memberEntity.hire_status( d.getHire_status() );
        memberEntity.team_uid( d.getTeam_uid() );
        memberEntity.mem_rank_uid( d.getMem_rank_uid() );
        memberEntity.mem_mobile( d.getMem_mobile() );
        memberEntity.mem_phone( d.getMem_phone() );
        memberEntity.mem_email( d.getMem_email() );
        memberEntity.zonecode( d.getZonecode() );
        memberEntity.addr1( d.getAddr1() );
        memberEntity.addr2( d.getAddr2() );
        memberEntity.memo( d.getMemo() );

        return memberEntity.build();
    }

    @Override
    public void updateFromDto(PostMemberDTO dto, MemberEntity entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getPassword() != null ) {
            entity.setPassword( dto.getPassword() );
        }
        if ( dto.getMem_name() != null ) {
            entity.setMem_name( dto.getMem_name() );
        }
        if ( dto.getMem_nickname() != null ) {
            entity.setMem_nickname( dto.getMem_nickname() );
        }
        if ( dto.getMem_mobile() != null ) {
            entity.setMem_mobile( dto.getMem_mobile() );
        }
        if ( dto.getMem_phone() != null ) {
            entity.setMem_phone( dto.getMem_phone() );
        }
        if ( dto.getMem_email() != null ) {
            entity.setMem_email( dto.getMem_email() );
        }
        if ( dto.getZonecode() != null ) {
            entity.setZonecode( dto.getZonecode() );
        }
        if ( dto.getAddr1() != null ) {
            entity.setAddr1( dto.getAddr1() );
        }
        if ( dto.getAddr2() != null ) {
            entity.setAddr2( dto.getAddr2() );
        }
        if ( dto.getMemo() != null ) {
            entity.setMemo( dto.getMemo() );
        }
        if ( dto.getTeam_uid() != null ) {
            entity.setTeam_uid( dto.getTeam_uid() );
        }
        if ( dto.getMem_rank_uid() != null ) {
            entity.setMem_rank_uid( dto.getMem_rank_uid() );
        }
        if ( dto.getHire_status() != null ) {
            entity.setHire_status( dto.getHire_status() );
        }
        if ( dto.getHire_type() != null ) {
            entity.setHire_type( dto.getHire_type() );
        }
    }
}
