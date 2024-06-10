package com.zazaero.data.repository;

import com.zazaero.data.entity.indCfg.IndCfgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndCfgRepository extends JpaRepository<IndCfgEntity, Integer> {
    IndCfgEntity findByCfgPart1AndCfgPart2(String cfgPart1, String cfgPart2);
}