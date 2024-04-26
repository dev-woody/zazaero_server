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
import java.time.LocalDateTime;
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

    @Column(nullable = false)
    private String mem_type;

    @Column(name = "mem_id", nullable = false, unique = true)
    private String id;

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

    @Column(nullable = false)
    private String ENC_mem_pw;

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

    @Column(nullable = false)
    private LocalDateTime push_key_datetime;

    @Column(nullable = false)
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

    @Column(nullable = false)
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

    @Column(nullable = false)
    private String hire_status;

    @Column(nullable = false)
    private String hire_type;

    @Column(nullable = false)
    private String mem_use_flag;

    @Column(nullable = false)
    private String license_flag;

    @Column(nullable = false)
    private String sub_broker_flag;

    @Column(nullable = false)
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
    private commCode.SnsCode connected_sns;

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

    @Column(nullable = false)
    private String provision_agree_type;

    @Column(nullable = false)
    private Integer mem_day_chk_cnt;

    @Column(nullable = false)
    private Integer cnt_login;

    @Column(nullable = false)
    private Integer client_level_uid;

    @Column(nullable = false)
    private String mgr_sms_recv;

    @Column(nullable = false)
    private String mem_mobile_hide;

    @Column(nullable = false)
    private String chk_email_sms;

    @Column(nullable = false)
    private String AT_app_test;

    @Column(nullable = false)
    private String AT_app_debug;

    @Column(nullable = false)
    private String push_ad_flag;

    @Column(nullable = false)
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
