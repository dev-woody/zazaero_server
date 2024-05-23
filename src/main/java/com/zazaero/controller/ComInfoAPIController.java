package com.zazaero.controller;

import com.zazaero.data.dto.GetComInfoDTO;
import com.zazaero.data.dto.PutComInfoDTO;
import com.zazaero.data.entity.entity.ComInfoEntity;
import com.zazaero.service.ComInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/com_info")
public class ComInfoAPIController {

    private final ComInfoService comInfoService;

    @Autowired
    public ComInfoAPIController(ComInfoService comInfoService) {
        this.comInfoService = comInfoService;
    }

    @PutMapping("/{id}")
    public ComInfoEntity updateComInfo(@PathVariable("id") Long id, @RequestBody PutComInfoDTO putComInfoDTO) {
        return comInfoService.updateComInfo(id, putComInfoDTO);

    }

    @GetMapping("/{id}")
    public GetComInfoDTO getComInfo(@PathVariable("id") Long id) {
        return comInfoService.getComInfoById(id);
    }
}
