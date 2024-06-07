package com.zazaero.data.repository;

import com.zazaero.data.entity.member.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByMemId(String memId);

    List<MemberEntity> findByMemType(String memType);
}
