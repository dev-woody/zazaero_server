package com.zazaero.data.repository;

import com.zazaero.data.entity.entity.ComInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComInfoRepository extends JpaRepository<ComInfoEntity, Long> {

}
