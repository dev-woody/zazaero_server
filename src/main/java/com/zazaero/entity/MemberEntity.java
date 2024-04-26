package com.zazaero.entity;

import com.zazaero.dto.MemberDTO;
import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long mem_uid;

    @Column
    private Date reg_date;

    @Column
    private Time reg_time;

    @Column
    private Integer reg_mem_uid;

    @Column(columnDefinition = "varchar")
    private String reg_mem_machine;

    @Column
    private String reg_mem_os;

    @Column
    private Long com_uid;

    @Column
    private String com_fax;

    @Column
    private String biz_cate;

    @Column
    private String biz_item;

    @Column
    private String mem_ok_status;

    @Column
    private Integer sale_code_uid;

    @Column
    private String tax_calc_email;

    @Column
    private commCode.MemCode mem_type;

    @Column
    private String mem_id;

    @Column
    private String com_name;

    @Column
    private String com_name2;

    @Column
    private String com_biz_no;

    @Column
    private String com_biz_name;

    @Column
    private String ceo_name;

    @Column
    private String ENC_mem_pw;

    @Column
    private String ENC_app_login_key;

    @Column
    private Integer Z_app_device_id;

    @Column
    private String device_id;

    @Column
    private String app_device_os;

    @Column
    private String push_id;

    @Column
    private Date push_key_datetime;

    @Column
    private Date push_id_dt;

    @Column
    private Date pw_mod_date;

    @Column
    private Time pw_mod_time;

    @Column
    private String mem_name;

    @Column
    private String mem_nickname;

    @Column
    private String mem_mobile;

    @Column
    private String mem_phone;

    @Column
    private String mem_email;

    @Column
    private String zipcode;

    @Column
    private String zonecode;

    @Column
    private String addr1;

    @Column
    private String addr2;

    @Column
    private String road_address;

    @Column
    private String memo;

    @Column
    private Date work_sdate;

    @Column
    private Date work_edate;

    @Column
    private Integer team_uid;

    @Column
    private Integer team_rank_uid;

    @Column
    private String mem_no;

    @Column
    private String pay_bank_code;

    @Column
    private String pay_bank_owner;

    @Column
    private Integer last_mem_log_uid;

    @Column
    private Date last_mem_log_date;

    @Column
    private Time last_mem_log_time;

    @Column
    private String hire_status;

    @Column
    private String hire_type;

    @Column
    private String mem_use_flag;

    @Column
    private commCode.YNCode license_flag;

    @Column
    private commCode.YNCode sub_broker_flag;

    @Column
    private String auto_buyer_uid;

    @Column
    private String mem_prev;

    @Column
    private Date mod_date;

    @Column
    private Time mod_time;

    @Column
    private Integer mod_mem_uid;

    @Column
    private String my_memo;

    @Column
    private Integer last_mgr_assign_index;

    @Column
    private Integer last_building_assign_index;

    @Column
    private Set<commCode.SnsCode> connected_sns;

    @Column
    private String team_name;

    @Column
    private String rank_name;

    @Column
    private Integer customer_uid;

    @Column
    private String find_certi_no;

    @Column
    private Date find_certi_dt;

    @Column
    private String sns_prev;

    @Column
    private String recome_meme_id;

    @Column
    private Integer mem_out_reason_uid;

    @Column
    private String mem_out_reason_memo;

    @Column
    private Date mem_out_time;

    @Column
    private Integer mem_out_mem_uid;

    @Column
    private Integer mem_point;

    @Column
    private String sns_type;

    @Column
    private String sns_id;

    @Column
    private Date provision_agree_date;

    @Column
    private String provision_agree_type;

    @Column
    private Integer mem_day_chk_cnt;

    @Column
    private Integer cnt_login;

    @Column
    private Integer client_level_uid;

    @Column
    private String mrg_sms_recv;

    @Column
    private String mem_mobile_hide;

    @Column
    private String chk_email_sms;

    @Column
    private String AT_app_test;

    @Column
    private String AT_app_debug;

    @Column
    private String push_ad_flag;

    @Column
    private String mem_out_flag;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMem_uid(memberDTO.getMem_uid());
        memberEntity.setReg_date((Date) memberDTO.getReg_date());
        memberEntity.setReg_time(memberDTO.getReg_time());
        memberEntity.setReg_mem_uid(memberDTO.getReg_mem_uid());
        memberEntity.setReg_mem_machine(memberDTO.getReg_mem_machine());
        memberEntity.setReg_mem_os(memberDTO.getReg_mem_os());
        memberEntity.setCom_uid(memberDTO.getCom_uid());
        memberEntity.setCom_fax(memberDTO.getCom_fax());
        memberEntity.setBiz_cate(memberDTO.getBiz_cate());
        memberEntity.setBiz_item(memberDTO.getBiz_item());
        memberEntity.setMem_ok_status(memberDTO.getMem_ok_status());
        memberEntity.setSale_code_uid(memberDTO.getSale_code_uid());
        memberEntity.setTax_calc_email(memberDTO.getTax_calc_email());
        memberEntity.setMem_type(memberDTO.getMem_type());
        memberEntity.setMem_id(memberDTO.getMem_id());
        memberEntity.setCom_name(memberDTO.getCom_name());
        memberEntity.setCom_name2(memberDTO.getCom_name2());
        memberEntity.setCom_biz_no(memberDTO.getCom_biz_no());
        memberEntity.setCom_biz_name(memberDTO.getCom_biz_name());
        memberEntity.setCeo_name(memberDTO.getCeo_name());
        memberEntity.setENC_mem_pw(memberDTO.getENC_mem_pw());
        memberEntity.setENC_app_login_key(memberDTO.getENC_app_login_key());
        memberEntity.setZ_app_device_id(memberDTO.getZ_app_device_id());
        memberEntity.setDevice_id(memberDTO.getDevice_id());
        memberEntity.setApp_device_os(memberDTO.getApp_device_os());
        memberEntity.setPush_id(memberDTO.getPush_id());
        memberEntity.setPush_key_datetime(memberEntity.getPush_key_datetime());
        memberEntity.setPush_id_dt(memberDTO.getPush_id_dt());
        memberEntity.setPw_mod_date(memberDTO.getPw_mod_date());
        memberEntity.setPw_mod_time(memberDTO.getPw_mod_time());
        memberEntity.setMem_name(memberDTO.getMem_name());
        memberEntity.setMem_nickname(memberDTO.getMem_nickname());
        memberEntity.setMem_mobile(memberDTO.getMem_mobile());
        memberEntity.setMem_phone(memberDTO.getMem_phone());
        memberEntity.setMem_email(memberDTO.getMem_email());
        memberEntity.setZipcode(memberDTO.getZipcode());
        memberEntity.setZonecode(memberDTO.getZonecode());
        memberEntity.setAddr1(memberDTO.getAddr1());
        memberEntity.setAddr2(memberDTO.getAddr2());
        memberEntity.setRoad_address(memberDTO.getRoad_address());
        memberEntity.setMemo(memberDTO.getMemo());
        memberEntity.setWork_sdate(memberDTO.getWork_sdate());
        memberEntity.setWork_edate(memberDTO.getWork_edate());
        memberEntity.setTeam_uid(memberDTO.getTeam_uid());
        memberEntity.setTeam_rank_uid(memberDTO.getTeam_rank_uid());
        memberEntity.setMem_no(memberDTO.getMem_no());
        memberEntity.setPay_bank_code(memberDTO.getPay_bank_code());
        memberEntity.setPay_bank_owner(memberDTO.getPay_bank_owner());
        memberEntity.setLast_mem_log_uid(memberEntity.getLast_mem_log_uid());
        memberEntity.setLast_mem_log_date(memberDTO.getLast_mem_log_date());
        memberEntity.setLast_mem_log_time(memberDTO.getLast_mem_log_time());
        memberEntity.setHire_status(memberDTO.getHire_status());
        memberEntity.setHire_type(memberDTO.getHire_type());
        memberEntity.setMem_use_flag(memberDTO.getMem_use_flag());
        memberEntity.setLicense_flag(memberDTO.getLicense_flag());
        memberEntity.setSub_broker_flag(memberDTO.getSub_broker_flag());
        memberEntity.setAuto_buyer_uid(memberDTO.getAuto_buyer_uid());
        memberEntity.setMem_prev(memberDTO.getMem_prev());
        memberEntity.setMod_date(memberDTO.getMod_date());
        memberEntity.setMod_time(memberDTO.getMod_time());
        memberEntity.setMod_mem_uid(memberDTO.getMod_mem_uid());
        memberEntity.setMy_memo(memberDTO.getMy_memo());
        memberEntity.setLast_mgr_assign_index(memberDTO.getLast_mgr_assign_index());
        memberEntity.setLast_building_assign_index(memberDTO.getLast_building_assign_index());
        memberEntity.setConnected_sns(memberDTO.getConnected_sns());
        memberEntity.setTeam_name(memberDTO.getTeam_name());
        memberEntity.setRank_name(memberDTO.getRank_name());
        memberEntity.setCustomer_uid(memberDTO.getCustomer_uid());
        memberEntity.setFind_certi_no(memberDTO.getFind_certi_no());
        memberEntity.setFind_certi_dt(memberDTO.getFind_certi_dt());
        memberEntity.setSns_prev(memberDTO.getSns_prev());
        memberEntity.setRecome_meme_id(memberDTO.getRecome_meme_id());
        memberEntity.setMem_out_reason_uid(memberDTO.getMem_out_reason_uid());
        memberEntity.setMem_out_reason_memo(memberDTO.getMem_out_reason_memo());
        memberEntity.setMem_out_time(memberDTO.getMem_out_time());
        memberEntity.setMem_out_mem_uid(memberDTO.getMem_out_mem_uid());
        memberEntity.setMem_point(memberDTO.getMem_point());
        memberEntity.setSns_type(memberDTO.getSns_type());
        memberEntity.setSns_id(memberDTO.getSns_id());
        memberEntity.setProvision_agree_date(memberDTO.getProvision_agree_date());
        memberEntity.setProvision_agree_type(memberDTO.getProvision_agree_type());
        memberEntity.setMem_day_chk_cnt(memberDTO.getMem_day_chk_cnt());
        memberEntity.setCnt_login(memberDTO.getCnt_login());
        memberEntity.setClient_level_uid(memberDTO.getClient_level_uid());
        memberEntity.setMrg_sms_recv(memberDTO.getMrg_sms_recv());
        memberEntity.setMem_mobile_hide(memberDTO.getMem_mobile_hide());
        memberEntity.setChk_email_sms(memberDTO.getChk_email_sms());
        memberEntity.setAT_app_test(memberDTO.getAT_app_test());
        memberEntity.setAT_app_debug(memberDTO.getAT_app_debug());
        memberEntity.setPush_ad_flag(memberDTO.getPush_ad_flag());
        memberEntity.setMem_out_flag(memberDTO.getMem_out_flag());

        return memberEntity;
    }
}
