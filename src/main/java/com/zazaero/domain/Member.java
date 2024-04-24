package com.zazaero.domain;

import com.zazaero.dto.MemberDTO;
import jakarta.persistence.*;
import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Time;
import java.util.Collection;
import java.sql.Date;



@Entity
@Setter
@Getter
@Table(name = "mem_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "mem_uid", updatable = false)
    private Long mem_uid;

    @Column(nullable = false)
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
    private String mem_type;

    @Column(name = "mem_id", nullable = false, unique = true)
    private String id;

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

    @Column(name = "ENC_mem_pw", nullable = false)
    private String ENC_mem_pw;

    @Column
    private String ENC_app_login_key;

    @Column
    private Integer Z_app_device_uid;

    @Column
    private String device_id;

    @Column
    private String app_device_os;

    @Column
    private String push_id;

    @Column(nullable = false)
    private Date push_key_datetime;

    @Column(nullable = false)
    private Date push_id_dt;

    @Column(nullable = false)
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

    @Column(nullable = false)
    private Date work_sdate;

    @Column(nullable = false)
    private Date work_edate;

    @Column
    private Integer team_uid;

    @Column
    private String mem_no;

    @Column
    private String pay_bank_code;

    @Column
    private String pay_bank_owner;

    @Column
    private Integer last_mem_log_uid;

    @Column(nullable = false)
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
    private String license_flag;

    @Column
    private String sub_broker_flag;

    @Column
    private String auto_buyer_uid;

    @Column
    private String mem_prev;

    @Column(nullable = false)
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
    private commCode.SnsCode connected_sns;

    @Column
    private String team_name;

    @Column
    private String rank_name;

    @Column
    private Integer customer_uid;

    @Column
    private String find_certi_no;

    @Column(nullable = false)
    private Date find_certi_dt;

    @Column
    private String sns_prev;

    @Column
    private String recom_mem_id;

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

    @Column(nullable = false)
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
    private String mgr_sms_recv;

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

    @Transient
    private Collection<SimpleGrantedAuthority> authorities;

    @Builder
    public Member(String id, String ENC_mem_pw, String auth) {
        this.id = id;
        this.ENC_mem_pw = ENC_mem_pw;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getUsername() {
        return id;
    }

    @Override
    public String getPassword() {
        return ENC_mem_pw;
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
}
