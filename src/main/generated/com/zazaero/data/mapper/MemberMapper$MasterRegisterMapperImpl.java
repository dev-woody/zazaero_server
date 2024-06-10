package com.zazaero.data.mapper;

import com.zazaero.data.dto.member.PostMemberDTO;
import com.zazaero.data.entity.member.MemberEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T17:12:05+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MemberMapper$MasterRegisterMapperImpl implements MemberMapper.MasterRegisterMapper {

    @Override
    public PostMemberDTO toDto(MemberEntity e) {
        if ( e == null ) {
            return null;
        }

        PostMemberDTO.PostMemberDTOBuilder postMemberDTO = PostMemberDTO.builder();

        postMemberDTO.mem_nickname( e.getMem_nickname() );
        postMemberDTO.memId( e.getMemId() );
        postMemberDTO.password( e.getPassword() );
        postMemberDTO.mem_name( e.getMem_name() );
        postMemberDTO.hire_type( e.getHire_type() );
        postMemberDTO.memType( e.getMemType() );
        postMemberDTO.hire_status( e.getHire_status() );
        postMemberDTO.team_uid( e.getTeam_uid() );
        postMemberDTO.mem_rank_uid( e.getMem_rank_uid() );
        postMemberDTO.mem_mobile( e.getMem_mobile() );
        postMemberDTO.mem_phone( e.getMem_phone() );
        postMemberDTO.mem_email( e.getMem_email() );
        postMemberDTO.zonecode( e.getZonecode() );
        postMemberDTO.addr1( e.getAddr1() );
        postMemberDTO.addr2( e.getAddr2() );
        postMemberDTO.memo( e.getMemo() );
        postMemberDTO.com_uid( e.getCom_uid() );

        return postMemberDTO.build();
    }

    @Override
    public MemberEntity toEntity(PostMemberDTO d) {
        if ( d == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder<?, ?> memberEntity = MemberEntity.builder();

        memberEntity.com_uid( d.getCom_uid() );
        memberEntity.memType( d.getMemType() );
        memberEntity.memId( d.getMemId() );
        memberEntity.password( d.getPassword() );
        memberEntity.mem_name( d.getMem_name() );
        memberEntity.mem_nickname( d.getMem_nickname() );
        memberEntity.mem_mobile( d.getMem_mobile() );
        memberEntity.mem_phone( d.getMem_phone() );
        memberEntity.mem_email( d.getMem_email() );
        memberEntity.zonecode( d.getZonecode() );
        memberEntity.addr1( d.getAddr1() );
        memberEntity.addr2( d.getAddr2() );
        memberEntity.memo( d.getMemo() );
        memberEntity.team_uid( d.getTeam_uid() );
        memberEntity.mem_rank_uid( d.getMem_rank_uid() );
        memberEntity.hire_status( d.getHire_status() );
        memberEntity.hire_type( d.getHire_type() );

        return memberEntity.build();
    }

    @Override
    public void updateFromDto(PostMemberDTO dto, MemberEntity entity) {
        if ( dto == null ) {
            return;
        }
    }
}
