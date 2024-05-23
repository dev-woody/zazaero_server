package com.zazaero.data.entity.entity;

import com.zazaero.data.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Time;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Collection;


@Entity
@Setter
@Getter
@Table(name = "mem_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
public class MemberEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "mem_uid", updatable = false)
    private Long mem_uid;

    @Column(nullable = false)
    private Date reg_date;

    @Column(nullable = false)
    private Time reg_time;

    @Column(nullable = false)
    private Integer reg_mem_uid;

    @Column(columnDefinition = "varchar")
    private String reg_mem_machine;

    @Column(nullable = false)
    private String reg_mem_os;

    @Column(nullable = false)
    private Long com_uid;

    @Column(nullable = false)
    private String com_fax;

    @Column(nullable = false)
    private String biz_cate;

    @Column(nullable = false)
    private String biz_item;

    @Column(nullable = false)
    private String mem_ok_status;

    @Column(nullable = false)
    private Integer sale_code_uid;

    @Column(nullable = false)
    private String tax_calc_email;

    @Column(name = "mem_type", nullable = false)
    @ColumnDefault("''")
    private String memType;

    @Column(name= "mem_id", nullable = false, unique = true)
    private String memId;

    @Column(nullable = false)
    private String com_name;

    @Column(nullable = false)
    private String com_name2;

    @Column(nullable = false)
    private String com_biz_no;

    @Column(nullable = false)
    private String com_biz_name;

    @Column(nullable = false)
    private String ceo_name;

    @Column(name = "ENC_mem_pw", nullable = false)
    private String password;

    @Column(nullable = false)
    private String ENC_app_login_key;

    @Column(nullable = false)
    private Integer Z_app_device_uid;

    @Column(nullable = false)
    private String device_id;

    @Column(nullable = false)
    private String app_device_os;

    @Column(nullable = false)
    private String push_id;

    @Column
    private LocalDateTime push_key_datetime;

    @Column
    private LocalDateTime push_id_dt;

    @Column(nullable = false)
    private Date pw_mod_date;

    @Column(nullable = false)
    private Time pw_mod_time;

    @Column(nullable = false)
    private String mem_name;

    @Column(nullable = false)
    private String mem_nickname;

    @Column(nullable = false)
    private String mem_mobile;

    @Column(nullable = false)
    private String mem_phone;

    @Column(nullable = false)
    private String mem_email;

    @Column(nullable = false)
    private String zipcode;

    @Column
    private String zonecode;

    @Column(nullable = false)
    private String addr1;

    @Column(nullable = false)
    private String addr2;

    @Column(nullable = false)
    private String road_address;

    @Column
    private String memo;

    @Column(nullable = false)
    private Date work_sdate;

    @Column(nullable = false)
    private Date work_edate;

    @Column(nullable = false)
    private Integer team_uid;

    @Column(nullable = false)
    private Integer mem_rank_uid;

    @Column(nullable = false)
    private String mem_no;

    @Column(nullable = false)
    private String pay_bank_code;

    @Column(nullable = false)
    private String pay_bank_owner;

    @Column(nullable = false)
    private Integer last_mem_log_uid;

    @Column(nullable = false)
    private Date last_mem_log_date;

    @Column(nullable = false)
    private Time last_mem_log_time;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'Y'")
    private String hire_status;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'")
    private String hire_type;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'Y'")
    private String mem_use_flag;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String license_flag;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String sub_broker_flag;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String auto_buyer_uid;

    @Column(nullable = false)
    private String mem_prev;

    @Column(nullable = false)
    private Date mod_date;

    @Column(nullable = false)
    private Time mod_time;

    @Column(nullable = false)
    private Integer mod_mem_uid;

    @Column(nullable = false)
    private String my_memo;

    @Column(nullable = false)
    private Integer last_mgr_assign_index;

    @Column(nullable = false)
    private Integer last_building_assign_index;

    @Column(nullable = false)
    private String connected_sns;

    @Column(nullable = false)
    private String team_name;

    @Column(nullable = false)
    private String rank_name;

    @Column(nullable = false)
    private Integer customer_uid;

    @Column(nullable = false)
    private String find_certi_no;

    @Column
    private LocalDateTime find_certi_dt;

    @Column(nullable = false)
    private String sns_prev;

    @Column(nullable = false)
    private String recom_mem_id;

    @Column(nullable = false)
    private Integer mem_out_reason_uid;

    @Column(nullable = false)
    private String mem_out_reason_memo;

    @Column(nullable = true)
    private Date mem_out_date;

    @Column(nullable = false)
    private Date mem_out_time;

    @Column(nullable = false)
    private Integer mem_out_mem_uid;

    @Column(nullable = false)
    private Integer mem_point;

    @Column(nullable = false)
    private String sns_type;

    @Column(nullable = false)
    private String sns_id;

    @Column(nullable = false)
    private Date provision_agree_date;

    @Column(nullable = false, length = 10)
    private String provision_agree_type;

    @Column(nullable = false)
    private Integer mem_day_chk_cnt;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer cnt_login;

    @Column(nullable = false)
    @ColumnDefault("1")
    private Integer client_level_uid;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String mgr_sms_recv;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String mem_mobile_hide;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String chk_email_sms;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String AT_app_test;

    @Column(name = "AT_app_debug", nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String AT_app_debug;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String push_ad_flag;

    @Column(nullable = false, length = 1)
    @ColumnDefault("'N'")
    private String mem_out_flag;

    @Transient
    private Collection<SimpleGrantedAuthority> authorities;

//    @Builder
//    public MemberEntity(String id,
//                        String password,
//                        String mem_name,
//                        String hire_type,
//                        String mem_type,
//                        String hire_status,
//                        Integer team_uid,
//                        Integer mem_rank_uid,
//                        String mem_mobile,
//                        String mem_phone,
//                        String mem_email,
//                        String zonecode,
//                        String addr1,
//                        String addr2,
//                        String memo,
//                        String auth) {
//        this.memId = id;
//        this.password = password;
//        this.mem_name = mem_name;
//        this.hire_type = hire_type;
//        this.memType = mem_type;
//        this.hire_status = hire_status;
//        this.team_uid = team_uid;
//        this.mem_rank_uid = mem_rank_uid;
//        this.mem_mobile = mem_mobile;
//        this.mem_phone = mem_phone;
//        this.mem_email = mem_email;
//        this.zonecode = zonecode;
//        this.addr1 = addr1;
//        this.addr2 = addr2;
//        this.memo = memo;
//
//        this.reg_date = new Date();
//        this.reg_time = new Time(System.currentTimeMillis());
//        this.reg_mem_uid = 0; // Or whatever default value you want
//        this.reg_mem_machine = ""; // Or whatever default value you want
//        this.reg_mem_os = ""; // Or whatever default value you want
//        this.com_uid = 0L; // Or whatever default value you want
//        this.com_fax = ""; // Or whatever default value you want
//        this.biz_cate = ""; // Or whatever default value you want
//        this.biz_item = ""; // Or whatever default value you want
//        this.mem_ok_status = ""; // Or whatever default value you want
//        this.sale_code_uid = 0; // Or whatever default value you want
//        this.tax_calc_email = ""; // Or whatever default value you want
//        this.ENC_app_login_key = ""; // Or whatever default value you want
//        this.Z_app_device_uid = 0; // Or whatever default value you want
//        this.device_id = ""; // Or whatever default value you want
//        this.app_device_os = ""; // Or whatever default value you want
//        this.push_id = ""; // Or whatever default value you want
//        this.push_key_datetime = LocalDateTime.now(); // Or whatever default value you want
//        this.push_id_dt = LocalDateTime.now(); // Or whatever default value you want
//        this.pw_mod_date = new Date(); // Or whatever default value you want
//        this.pw_mod_time = new Time(System.currentTimeMillis()); // Or whatever default value you want
//        this.mem_no = ""; // Or whatever default value you want
//        this.pay_bank_code = ""; // Or whatever default value you want
//        this.pay_bank_owner = ""; // Or whatever default value you want
//        this.last_mem_log_uid = 0; // Or whatever default value you want
//        this.last_mem_log_date = new Date(); // Or whatever default value you want
//        this.last_mem_log_time = new Time(System.currentTimeMillis()); // Or whatever default value you want
//        this.hire_status = "Y"; // Or whatever default value you want
//        this.mem_use_flag = "Y"; // Or whatever default value you want
//        this.license_flag = "N"; // Or whatever default value you want
//        this.sub_broker_flag = "N"; // Or whatever default value you want
//        this.auto_buyer_uid = "N"; // Or whatever default value you want
//        this.mem_prev = ""; // Or whatever default value you want
//        this.mod_date = new Date(); // Or whatever default value you want
//        this.mod_time = new Time(System.currentTimeMillis()); // Or whatever default value you want
//        this.mod_mem_uid = 0; // Or whatever default value you want
//        this.my_memo = ""; // Or whatever default value you want
//        this.last_mgr_assign_index = 0; // Or whatever default value you want
//        this.last_building_assign_index = 0; // Or whatever default value you want
//        this.connected_sns = ""; // Or whatever default value you want
//        this.team_name = ""; // Or whatever default value you want
//        this.rank_name = ""; // Or whatever default value you want
//        this.customer_uid = 0; // Or whatever default value you want
//        this.find_certi_no = ""; // Or whatever default value you want
//        this.find_certi_dt = LocalDateTime.now(); // Or whatever default value you want
//        this.sns_prev = ""; // Or whatever default value you want
//        this.recom_mem_id = ""; // Or whatever default value you want
//        this.mem_out_reason_uid = 0; // Or whatever default value you want
//        this.mem_out_reason_memo = ""; // Or whatever default value you want
//        this.mem_out_date = new Date(); // Or whatever default value you want
//        this.mem_out_time = new Date(); // Or whatever default value you want
//        this.mem_out_mem_uid = 0; // Or whatever default value you want
//        this.mem_point = 0; // Or whatever default value you want
//        this.sns_type = ""; // Or whatever default value you want
//        this.sns_id = ""; // Or whatever default value you want
//        this.provision_agree_date = new Date(); // Or whatever default value you want
//        this.provision_agree_type = ""; // Or whatever default value you want
//        this.mem_day_chk_cnt = 0; // Or whatever default value you want
//        this.cnt_login = 0; // Or whatever default value you want
//        this.client_level_uid = 1; // Or whatever default value you want
//        this.mgr_sms_recv = "N"; // Or whatever default value you want
//        this.mem_mobile_hide = "N"; // Or whatever default value you want
//        this.chk_email_sms = "N"; // Or whatever default value you want
//        this.AT_app_test = "N"; // Or whatever default value you want
//        this.AT_app_debug = "N"; // Or whatever default value you want
//        this.push_ad_flag = "N"; // Or whatever default value you want
//        this.mem_out_flag = "N"; // Or whatever default value you want
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getUsername() {
        return memId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMem_uid(memberDTO.getMem_uid());
        memberEntity.setReg_date(memberDTO.getReg_date());
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
        memberEntity.setMemType(memberDTO.getMemType());
        memberEntity.setMemId(memberDTO.getMemId());
        memberEntity.setCom_name(memberDTO.getCom_name());
        memberEntity.setCom_name2(memberDTO.getCom_name2());
        memberEntity.setCom_biz_no(memberDTO.getCom_biz_no());
        memberEntity.setCom_biz_name(memberDTO.getCom_biz_name());
        memberEntity.setCeo_name(memberDTO.getCeo_name());
        memberEntity.setPassword(memberDTO.getPassword());
        memberEntity.setENC_app_login_key(memberDTO.getENC_app_login_key());
        memberEntity.setZ_app_device_uid(memberDTO.getZ_app_device_uid());
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
        memberEntity.setMem_rank_uid(memberDTO.getMem_rank_uid());
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
        memberEntity.setRecom_mem_id(memberDTO.getRecom_mem_id());
        memberEntity.setMem_out_reason_uid(memberDTO.getMem_out_reason_uid());
        memberEntity.setMem_out_reason_memo(memberDTO.getMem_out_reason_memo());
        memberEntity.setMem_out_date(memberDTO.getMem_out_date());
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
        memberEntity.setMgr_sms_recv(memberDTO.getMgr_sms_recv());
        memberEntity.setMem_mobile_hide(memberDTO.getMem_mobile_hide());
        memberEntity.setChk_email_sms(memberDTO.getChk_email_sms());
        memberEntity.setAT_app_test(memberDTO.getAT_app_test());
        memberEntity.setAT_app_debug(memberDTO.getAT_app_debug());
        memberEntity.setPush_ad_flag(memberDTO.getPush_ad_flag());
        memberEntity.setMem_out_flag(memberDTO.getMem_out_flag());

        return memberEntity;
    }
}
