package com.zazaero.controller;


import com.zazaero.data.dto.indCfg.PostSchInfoDTO;
import com.zazaero.data.entity.indCfg.SchInfoEntity;
import com.zazaero.service.SchInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sch_info")
public class SchInfoController {

    private final SchInfoService schInfoService;

    @Autowired
    public SchInfoController(SchInfoService schInfoService) {
        this.schInfoService = schInfoService;
    }

    @PostMapping
    public SchInfoEntity createSchInfo(@RequestBody PostSchInfoDTO dto) {
        return schInfoService.save(dto);
    }
}
