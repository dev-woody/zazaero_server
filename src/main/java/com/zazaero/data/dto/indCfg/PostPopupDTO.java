package com.zazaero.data.dto.indCfg;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
public class PostPopupDTO {

    @NotBlank
    private Date cfgDateVal1;
    @NotBlank
    private Date cfgDateVal2;
    @NotBlank
    private String indCfgUseFlag;
    @NotBlank
    private String cfgVal1;
    @NotBlank
    private String cfgVal2;
    @NotBlank
    private String cfgTxtVal1;
    @NotBlank
    private Integer regMemUid;

}
