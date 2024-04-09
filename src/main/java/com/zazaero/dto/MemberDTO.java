package com.zazaero.dto;

import com.zazaero.entity.MemberEntity;
import com.zazaero.util.enumcode.commCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {

    private Long mem_uid;
    private Date reg_date;
    private Time reg_time;
    private Integer reg_mem_uid;
    private String reg_mem_machine;
    private String reg_mem_os;
    private Long com_uid;
    private String com_fax;
    private String biz_cate;
    private String biz_item;
    private String mem_ok_status;
    private Integer sale_code_uid;
    private String tax_calc_email;
    private commCode.MemCode mem_type;
    private String mem_id;
    private String com_name;
    private String com_name2;
    private String com_biz_no;
    private String com_biz_name;
    private String ceo_name;
    private String ENC_mem_pw;
    private String ENC_app_login_key;
    private Integer Z_app_device_id;
    private String device_id;
    private String app_device_os;
    private String push_id;
    private Date push_key_datetime;
    private Date push_id_dt;
    private Date pw_mod_date;
    private Time pw_mod_time;
    private String mem_name;
    private String mem_nickname;
    private String mem_mobile;
    private String mem_phone;
    private String mem_email;
    private String zipcode;
    private String zonecode;
    private String addr1;
    private String addr2;
    private String road_address;
    private String memo;
    private Date work_sdate;
    private Date work_edate;
    private Integer team_uid;
    private Integer team_rank_uid;
    private String mem_no;
    private String pay_bank_code;
    private String pay_bank_owner;
    private Integer last_mem_log_uid;
    private Date last_mem_log_date;
    private Time last_mem_log_time;
    private String hire_status;
    private String hire_tpye;
    private String mem_use_flag;
    private commCode.YNCode license_flag;
    private commCode.YNCode sub_broker_flag;
    private String auto_buyer_uid;
    private String mem_prev;
    private Date mod_date;
    private Time mod_time;
    private Integer mod_mem_uid;
    private String my_memo;
    private Integer last_mgr_assign_index;
    private Integer last_building_assign_index;
    private Set<commCode.SnsCode> connected_sns;
    private String team_name;
    private String rank_name;
    private Integer customer_uid;
    private String find_certi_no;
    private Date find_certi_dt;
    private String sns_prev;
    private String recome_meme_id;
    private Integer mem_out_reason_uid;
    private String mem_out_reason_memo;
    private Date mem_out_time;
    private Integer mem_out_mem_uid;
    private Integer mem_point;
    private String sns_type;
    private String sns_id;
    private Date provision_agree_date;
    private String provision_agree_type;
    private Integer mem_day_chk_cnt;
    private Integer cnt_login;
    private Integer client_level_uid;
    private String mrg_sms_recv;
    private String mem_mobile_hide;
    private String chk_email_sms;
    private String AT_app_test;
    private String AT_app_debug;
    private String push_ad_flag;
    private String mem_out_flag;

    private String memberEmail;
    private String memberPassword;
    private String memberName;

    //lombok 어노테이션으로 getter,setter,생성자,toString 메서드 생략 가능

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMem_uid(memberEntity.getMem_uid());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberName(memberEntity.getMemberName());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());

        return memberDTO;
    }
}
