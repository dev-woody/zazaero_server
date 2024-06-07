package com.zazaero.data.mapper;

import com.zazaero.data.dto.member.PostMemberDTO;
import com.zazaero.data.entity.member.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

public interface MemberMapper {

    @Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
    public interface MasterRegisterMapper extends GenericMapper<PostMemberDTO, MemberEntity> {
    }
}
