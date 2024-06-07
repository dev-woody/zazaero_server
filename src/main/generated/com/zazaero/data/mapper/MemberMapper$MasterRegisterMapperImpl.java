package com.zazaero.data.mapper;

import com.zazaero.data.dto.member.PostMemberDTO;
import com.zazaero.data.entity.member.MemberEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-05T16:10:56+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MemberMapper$MasterRegisterMapperImpl implements MemberMapper.MasterRegisterMapper {

    @Override
    public PostMemberDTO toDto(MemberEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PostMemberDTO.PostMemberDTOBuilder postMemberDTO = PostMemberDTO.builder();

        postMemberDTO.mem_nickname( arg0.getMem_nickname() );
        postMemberDTO.memId( arg0.getMemId() );
        postMemberDTO.password( arg0.getPassword() );
        postMemberDTO.mem_name( arg0.getMem_name() );
        postMemberDTO.hire_type( arg0.getHire_type() );
        postMemberDTO.hire_status( arg0.getHire_status() );
        postMemberDTO.team_uid( arg0.getTeam_uid() );
        postMemberDTO.mem_rank_uid( arg0.getMem_rank_uid() );
        postMemberDTO.mem_mobile( arg0.getMem_mobile() );
        postMemberDTO.mem_phone( arg0.getMem_phone() );
        postMemberDTO.mem_email( arg0.getMem_email() );
        postMemberDTO.zonecode( arg0.getZonecode() );
        postMemberDTO.addr1( arg0.getAddr1() );
        postMemberDTO.addr2( arg0.getAddr2() );
        postMemberDTO.memo( arg0.getMemo() );

        return postMemberDTO.build();
    }

    @Override
    public MemberEntity toEntity(PostMemberDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder<?, ?> memberEntity = MemberEntity.builder();

        memberEntity.memId( arg0.getMemId() );
        memberEntity.password( arg0.getPassword() );
        memberEntity.mem_name( arg0.getMem_name() );
        memberEntity.mem_nickname( arg0.getMem_nickname() );
        memberEntity.mem_mobile( arg0.getMem_mobile() );
        memberEntity.mem_phone( arg0.getMem_phone() );
        memberEntity.mem_email( arg0.getMem_email() );
        memberEntity.zonecode( arg0.getZonecode() );
        memberEntity.addr1( arg0.getAddr1() );
        memberEntity.addr2( arg0.getAddr2() );
        memberEntity.memo( arg0.getMemo() );
        memberEntity.team_uid( arg0.getTeam_uid() );
        memberEntity.mem_rank_uid( arg0.getMem_rank_uid() );
        memberEntity.hire_status( arg0.getHire_status() );
        memberEntity.hire_type( arg0.getHire_type() );

        return memberEntity.build();
    }

    @Override
    public void updateFromDto(PostMemberDTO arg0, MemberEntity arg1) {
        if ( arg0 == null ) {
            return;
        }
    }
}
