package com.zazaero.controller;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.dto.indCfg.PutMemInfoDTO;
import com.zazaero.data.dto.indCfg.PutPayBankDTO;
import com.zazaero.data.dto.indCfg.PutProvisionDTO;
import com.zazaero.data.entity.entity.IndCfgEntity;
import com.zazaero.service.IndCfgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ind_cfg")
public class IndCfgController {

    @Autowired
    private IndCfgService indCfgService;

    @GetMapping("/provision")
    public IndCfgEntity getProvisionAndDefaultProvision(
            @RequestParam("cfg-part1") String cfg1,
            @RequestParam("cfg-part2") String cfg2) {
        return indCfgService.getProvisionAndDefaultProvision(cfg1, cfg2);
    }

    @PutMapping("/provision")
    public IndCfgEntity updateIndCfg(
            @RequestBody PutProvisionDTO dto) {
        return indCfgService.updateIndCfg(dto);
    }

    @PutMapping("/pay_bank")
    public IndCfgEntity updatePayBank(
            @RequestBody PutPayBankDTO dto) {
        return indCfgService.updatePayBank(dto);
    }

    @PutMapping("/change_use")
    public IndCfgEntity changeUse(
            @RequestParam("uid") Long id) {
        return indCfgService.changeUseIndCfg(id);
    }

    @PutMapping("/mem_info")
    public IndCfgEntity updateMemInfo(
            @RequestBody PutMemInfoDTO dto) {
        return indCfgService.updateeMemInfo(dto);
    }

    @PostMapping("/popup")
    public IndCfgEntity postPopup(
            @RequestBody PostPopupDTO dto) {
        return indCfgService.postPopup(dto);
    }

}
