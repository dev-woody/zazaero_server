package com.zazaero.service;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.dto.indCfg.PutMemInfoDTO;
import com.zazaero.data.dto.indCfg.PutPayBankDTO;
import com.zazaero.data.dto.indCfg.PutProvisionDTO;
import com.zazaero.data.entity.indCfg.IndCfgEntity;
import com.zazaero.data.mapper.IndCfgMapper.PopupRegisterMapper;
import com.zazaero.data.repository.IndCfgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class IndCfgService {

    private IndCfgRepository indCfgRepository;
    private PopupRegisterMapper popupRegisterMapper;

    @Autowired
    public IndCfgService(IndCfgRepository indCfgRepository, PopupRegisterMapper popupRegisterMapper) {
        this.indCfgRepository = indCfgRepository;
        this.popupRegisterMapper = popupRegisterMapper;
    }

    public IndCfgEntity getProvisionAndDefaultProvision(String cfgPart1, String cfgPart2) {
        return indCfgRepository.findByCfgPart1AndCfgPart2(cfgPart1, cfgPart2);
    }

    public IndCfgEntity updateIndCfg(PutProvisionDTO dto) {
        IndCfgEntity entity = indCfgRepository.findByCfgPart1AndCfgPart2(dto.getCfg_part1(), dto.getCfg_part2());
        if (dto.getCfg_txt_val1() != null) {
            entity.setCfgTxtVal1(dto.getCfg_txt_val1());
        }
//            entity.setMod_date(new Date());
//            entity.setMod_time(new Time(System.currentTimeMillis()));
            return indCfgRepository.save(entity);
        }

    public IndCfgEntity updatePayBank(PutPayBankDTO dto) {
        IndCfgEntity entity = indCfgRepository.findById(dto.getInd_cfg_uid())
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        if (dto.getCfg_val1() != null) {
            entity.setCfgVal1(dto.getCfg_val1());
        }
        if (dto.getCfg_val2() != null) {
            entity.setCfgVal2(dto.getCfg_val2());
        }
        if (dto.getCfg_val3() != null) {
            entity.setCfgVal3(dto.getCfg_val3());
        }
//        entity.setMod_date(new Date());
//        entity.setMod_time(new Time(System.currentTimeMillis()));

        return indCfgRepository.save(entity);
    }

    public IndCfgEntity updateeMemInfo(PutMemInfoDTO dto) {
        IndCfgEntity entity = indCfgRepository.findById(dto.getInd_cfg_uid())
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        if (dto.getCfg_val1() != null) {
            entity.setCfgVal1(dto.getCfg_val1());
        }
//        entity.setMod_date(new Date());
//        entity.setMod_time(new Time(System.currentTimeMillis()));
        return indCfgRepository.save(entity);
    }

    public IndCfgEntity changeUseIndCfg(Integer id) {
        IndCfgEntity entity = indCfgRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        if (Objects.equals(entity.getIndCfgUseFlag(), "Y")) {
            entity.setIndCfgUseFlag("N");
        } else entity.setIndCfgUseFlag("Y");

        return indCfgRepository.save(entity);
    }

    public IndCfgEntity postPopup(PostPopupDTO dto) {
        return indCfgRepository.save(popupRegisterMapper.toEntity(dto));
    }

}
