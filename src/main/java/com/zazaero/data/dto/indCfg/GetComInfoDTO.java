package com.zazaero.data.dto.indCfg;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class GetComInfoDTO {
    private Long id;
    private Date reg_date;
    private Time reg_time;
    private Integer reg_mem_uid;
    private String com_name;
    private String com_type;
    private String biz_no;
    private String ceo_name;
    private String com_phone;
    private String com_mobile;
    private String com_fax;
    private String com_email;
    private String sale_refer_no;
    private String info_mgr_name;
    private String info_mgr_email;
    private String biz_type;
    private String biz_item;
    private String tax_calc_email;
    private String zonecode;
    private String postcode;
    private Integer post1;
    private Integer post2;
    private String addr1;
    private String addr2;
    private Integer ct_mem_uid;
    private String com_use_flag;
    private Integer price_SMS;
    private Integer price_LMS;
    private Integer price_MMS;
    private String com_status;
    private Integer last_work_counsel_log_uid;
    private String com_memo;
    private String biz_cate;
    private String biz_code;
    private Date biz_sdate;
    private String callcenter_open_time;
    private String parcel_fee_type;
    private String delivery_type;
}
