package com.zazaero.data.dto.member;

//import com.zazaero.entity.MemberEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
public class MemberDTO {

    private Long mem_uid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date reg_date;
    private Time reg_time;
    private Integer reg_mem_uid;
    private String reg_mem_machine;
    private String reg_mem_os;
    private BigInteger com_uid;
    private String com_fax;
    private String biz_cate;
    private String biz_item;
    private String mem_ok_status;
    private Integer sale_code_uid;
    private String tax_calc_email;
    private String memType;
    private String memId;
    private String com_name;
    private String com_name2;
    private String com_biz_no;
    private String com_biz_name;
    private String ceo_name;
    private String password;
    private String ENC_app_login_key;
    private Integer Z_app_device_uid;
    private String device_id;
    private String app_device_os;
    private String push_id;
    private LocalDateTime push_key_datetime;
    private LocalDateTime push_id_dt;
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
    private Integer mem_rank_uid;
    private String mem_no;
    private String pay_bank_code;
    private String pay_bank_owner;
    private Integer last_mem_log_uid;
    private Date last_mem_log_date;
    private Time last_mem_log_time;
    private String hire_status;
    private String hire_type;
    private String mem_use_flag;
    private String license_flag;
    private String sub_broker_flag;
    private String auto_buyer_uid;
    private String mem_prev;
    private Date mod_date;
    private Time mod_time;
    private Integer mod_mem_uid;
    private String my_memo;
    private Integer last_mgr_assign_index;
    private Integer last_building_assign_index;
    private String connected_sns;
    private String team_name;
    private String rank_name;
    private Integer customer_uid;
    private String find_certi_no;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime find_certi_dt;
    private String sns_prev;
    private String recom_mem_id;
    private Integer mem_out_reason_uid;
    private String mem_out_reason_memo;
    private Date mem_out_date;
    private Time mem_out_time;
    private Integer mem_out_mem_uid;
    private Integer mem_point;
    private String sns_type;
    private String sns_id;
    private Date provision_agree_date;
    private String provision_agree_type;
    private Integer mem_day_chk_cnt;
    private Integer cnt_login;
    private Integer client_level_uid;
    private String mgr_sms_recv;
    private String mem_mobile_hide;
    private String chk_email_sms;
    private String AT_app_test;
    private String AT_app_debug;
    private String push_ad_flag;
    private String mem_out_flag;

    //lombok 어노테이션으로 getter,setter,생성자,toString 메서드 생략 가능

//    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
//        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setMem_uid(memberEntity.getMem_uid());
//        memberDTO.setReg_date(memberEntity.getReg_date());
//        memberDTO.setReg_time(memberEntity.getReg_time());
//        memberDTO.setReg_mem_uid(memberEntity.getReg_mem_uid());
//        memberDTO.setReg_mem_machine(memberEntity.getReg_mem_machine());
//        memberDTO.setReg_mem_os(memberEntity.getReg_mem_os());
//        memberDTO.setCom_uid(memberEntity.getCom_uid());
//        memberDTO.setCom_fax(memberEntity.getCom_fax());
//        memberDTO.setBiz_cate(memberEntity.getBiz_cate());
//        memberDTO.setBiz_item(memberEntity.getBiz_cate());
//        memberDTO.setMem_ok_status(memberEntity.getMem_ok_status());
//        memberDTO.setSale_code_uid(memberEntity.getSale_code_uid());
//        memberDTO.setTax_calc_email(memberEntity.getTax_calc_email());
//        memberDTO.setMemType(memberEntity.getMemType());
//        memberDTO.setMemId(memberEntity.getMemId());
//        memberDTO.setCom_name(memberEntity.getCom_name());
//        memberDTO.setCom_name2(memberEntity.getCom_name2());
//        memberDTO.setCom_biz_no(memberEntity.getCom_biz_name());
//        memberDTO.setCom_biz_name(memberEntity.getCom_biz_name());
//        memberDTO.setCeo_name(memberEntity.getCeo_name());
//        memberDTO.setPassword(memberEntity.getPassword());
//        memberDTO.setENC_app_login_key(memberEntity.getENC_app_login_key());
//        memberDTO.setZ_app_device_uid(memberEntity.getZ_app_device_uid());
//        memberDTO.setDevice_id(memberEntity.getDevice_id());
//        memberDTO.setApp_device_os(memberEntity.getApp_device_os());
//        memberDTO.setPush_id(memberEntity.getPush_id());
//        memberDTO.setPush_key_datetime(memberEntity.getPush_key_datetime());
//        memberDTO.setPush_id_dt(memberEntity.getPush_id_dt());
//        memberDTO.setPw_mod_date(memberEntity.getPw_mod_date());
//        memberDTO.setPw_mod_time(memberEntity.getPw_mod_time());
//        memberDTO.setMem_name(memberEntity.getMem_name());
//        memberDTO.setMem_nickname(memberEntity.getMem_nickname());
//        memberDTO.setMem_mobile(memberEntity.getMem_mobile());
//        memberDTO.setMem_phone(memberEntity.getMem_phone());
//        memberDTO.setMem_email(memberEntity.getMem_email());
//        memberDTO.setZipcode(memberEntity.getZipcode());
//        memberDTO.setZonecode(memberEntity.getZonecode());
//        memberDTO.setAddr1(memberEntity.getAddr1());
//        memberDTO.setAddr2(memberEntity.getAddr2());
//        memberDTO.setRoad_address(memberEntity.getRoad_address());
//        memberDTO.setMemo(memberEntity.getMemo());
//        memberDTO.setWork_sdate(memberEntity.getWork_sdate());
//        memberDTO.setWork_edate(memberEntity.getWork_edate());
//        memberDTO.setTeam_uid(memberEntity.getTeam_uid());
//        memberDTO.setMem_rank_uid(memberEntity.getMem_rank_uid());
//        memberDTO.setMem_no(memberEntity.getMem_no());
//        memberDTO.setPay_bank_code(memberEntity.getPay_bank_code());
//        memberDTO.setPay_bank_owner(memberEntity.getPay_bank_owner());
//        memberDTO.setLast_mem_log_uid(memberEntity.getLast_mem_log_uid());
//        memberDTO.setLast_mem_log_date(memberEntity.getLast_mem_log_date());
//        memberDTO.setLast_mem_log_time(memberEntity.getLast_mem_log_time());
//        memberDTO.setHire_status(memberEntity.getHire_status());
//        memberDTO.setHire_type(memberEntity.getHire_type());
//        memberDTO.setMem_use_flag(memberEntity.getMem_use_flag());
//        memberDTO.setLicense_flag(memberEntity.getLicense_flag());
//        memberDTO.setSub_broker_flag(memberEntity.getSub_broker_flag());
//        memberDTO.setAuto_buyer_uid(memberEntity.getAuto_buyer_uid());
//        memberDTO.setMem_prev(memberEntity.getMem_prev());
//        memberDTO.setMod_date(memberEntity.getMod_date());
//        memberDTO.setMod_time(memberEntity.getMod_time());
//        memberDTO.setMod_mem_uid(memberEntity.getMod_mem_uid());
//        memberDTO.setMy_memo(memberEntity.getMy_memo());
//        memberDTO.setLast_mgr_assign_index(memberEntity.getLast_mgr_assign_index());
//        memberDTO.setLast_building_assign_index(memberEntity.getLast_building_assign_index());
//        memberDTO.setConnected_sns(memberEntity.getConnected_sns());
//        memberDTO.setTeam_name(memberEntity.getTeam_name());
//        memberDTO.setRank_name(memberEntity.getRank_name());
//        memberDTO.setCustomer_uid(memberEntity.getCustomer_uid());
//        memberDTO.setFind_certi_no(memberEntity.getFind_certi_no());
//        memberDTO.setFind_certi_dt(memberEntity.getFind_certi_dt());
//        memberDTO.setSns_prev(memberEntity.getSns_prev());
//        memberDTO.setRecom_mem_id(memberEntity.getRecom_mem_id());
//        memberDTO.setMem_out_reason_uid(memberEntity.getMem_out_reason_uid());
//        memberDTO.setMem_out_reason_memo(memberEntity.getMem_out_reason_memo());
//        memberDTO.setMem_out_date(memberEntity.getMem_out_date());
//        memberDTO.setMem_out_time(memberEntity.getMem_out_time());
//        memberDTO.setMem_out_mem_uid(memberEntity.getMem_out_mem_uid());
//        memberDTO.setMem_point(memberEntity.getMem_point());
//        memberDTO.setSns_type(memberEntity.getSns_type());
//        memberDTO.setSns_id(memberEntity.getSns_id());
//        memberDTO.setProvision_agree_date(memberEntity.getProvision_agree_date());
//        memberDTO.setProvision_agree_type(memberEntity.getProvision_agree_type());
//        memberDTO.setMem_day_chk_cnt(memberEntity.getMem_day_chk_cnt());
//        memberDTO.setCnt_login(memberEntity.getCnt_login());
//        memberDTO.setClient_level_uid(memberEntity.getClient_level_uid());
//        memberDTO.setMgr_sms_recv(memberEntity.getMgr_sms_recv());
//        memberDTO.setMem_mobile_hide(memberEntity.getMem_mobile_hide());
//        memberDTO.setChk_email_sms(memberEntity.getChk_email_sms());
//        memberDTO.setAT_app_test(memberEntity.getAT_app_test());
//        memberDTO.setAT_app_debug(memberEntity.getAT_app_debug());
//        memberDTO.setPush_ad_flag(memberEntity.getPush_ad_flag());
//        memberDTO.setMem_out_flag(memberEntity.getMem_out_flag());
//
//        return memberDTO;
//    }
}
