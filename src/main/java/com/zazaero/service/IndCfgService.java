package com.zazaero.service;

import com.zazaero.data.dto.PutPayBankDTO;
import com.zazaero.data.dto.PutProvisionDTO;
import com.zazaero.data.entity.entity.IndCfgEntity;
import com.zazaero.data.repository.IndCfgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Service
public class IndCfgService {

    @Autowired
    private IndCfgRepository indCfgRepository;

    public IndCfgEntity getProvisionAndDefaultProvision(String cfgPart1, String cfgPart2) {
        return indCfgRepository.findByCfgPart1AndCfgPart2(cfgPart1, cfgPart2);
    }

    public IndCfgEntity updateIndCfg(PutProvisionDTO dto) {
        IndCfgEntity entity = indCfgRepository.findByCfgPart1AndCfgPart2(dto.getCfg_part1(), dto.getCfg_part2());
        if (dto.getCfg_txt_val1() != null) {
            entity.setCfg_txt_val1(dto.getCfg_txt_val1());
        }
            entity.setMod_date(new Date());
            entity.setMod_time(new Time(System.currentTimeMillis()));
            return indCfgRepository.save(entity);
        }

    public IndCfgEntity updatePayBank(PutPayBankDTO dto) {
        IndCfgEntity entity = indCfgRepository.findById(dto.getInd_cfg_uid())
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        if (dto.getCfg_val1() != null) {
            entity.setCfg_val1(dto.getCfg_val1());
        }
        if (dto.getCfg_val2() != null) {
            entity.setCfg_val2(dto.getCfg_val2());
        }
        if (dto.getCfg_val3() != null) {
            entity.setCfg_val3(dto.getCfg_val3());
        }
        entity.setMod_date(new Date());
        entity.setMod_time(new Time(System.currentTimeMillis()));

        return indCfgRepository.save(entity);
    }

    public IndCfgEntity changeUseIndCfg(Long id) {
        IndCfgEntity entity = indCfgRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        if (Objects.equals(entity.getInd_cfg_use_flag(), "Y")) {
            entity.setInd_cfg_use_flag("N");
        } else entity.setInd_cfg_use_flag("Y");

        return indCfgRepository.save(entity);
    }

}
