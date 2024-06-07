package com.zazaero.data.dto.indCfg;

import lombok.Data;

import java.util.Date;

@Data
public class PostPopupDTO {

    private Date cfg_date_val1;
    private Date cfg_date_val2;
    private String ind_cfg_use_flag;
    private String cfg_val1;
    private String cfg_val2;
    private String cfg_txt_val1;
    private Long reg_mem_uid;

}
