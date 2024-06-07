package com.zazaero.data.entity.member;

import com.zazaero.data.entity.base.DeleteBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Getter
@DynamicInsert
@DynamicUpdate
@SuperBuilder
@Table(name = "mem_info")
@AttributeOverrides({
        @AttributeOverride(name = "uid", column = @Column(name = "mem_uid")),
        @AttributeOverride(name = "outDate", column = @Column(name = "mem_out_date")),
        @AttributeOverride(name = "outTime", column = @Column(name = "mem_out_time")),
        @AttributeOverride(name = "outMemUid", column = @Column(name = "mem_out_mem_uid"))
})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends DeleteBaseEntity implements UserDetails {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "mem_uid", insertable=false, updatable = false, nullable = false)
//    private Integer memUid;

    @Builder.Default
    private BigInteger com_uid = BigInteger.valueOf(0);
    @Builder.Default
    private String com_fax = "";
    @Builder.Default
    private String biz_cate = "";
    @Builder.Default
    private String biz_item = "";
    @Builder.Default
    private String mem_ok_status = "";
    @Builder.Default
    private Integer sale_code_uid = 0;
    @Builder.Default
    private String tax_calc_email = "";

    @Column(name = "mem_type", nullable = false)
    private String memType;

    @Builder.Default
    @Column(name= "mem_id", nullable = false, unique = true)
    private String memId = "";

    @Builder.Default
    private String com_name = "";
    @Builder.Default
    private String com_name2 = "";
    @Builder.Default
    private String com_biz_no = "";
    @Builder.Default
    private String com_biz_name = "";
    @Builder.Default
    private String ceo_name = "";

    @Builder.Default
    @Column(name = "ENC_mem_pw", nullable = false)
    private String password = "";

    @Builder.Default
    private String ENC_app_login_key = "";
    @Builder.Default
    private Integer Z_app_device_uid = 0;
    @Builder.Default
    private String device_id = "";
    @Builder.Default
    private String app_device_os = "";
    @Builder.Default
    private String push_id = "";

    @Builder.Default
    private LocalDateTime push_key_datetime = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime push_id_dt = LocalDateTime.now();
    @Builder.Default
    private Date pw_mod_date = new Date();
    @Builder.Default
    private Time pw_mod_time = new Time(System.currentTimeMillis());
    @Builder.Default
    private String mem_name = "";

    @Builder.Default
    @Column(name = "mem_nickname", nullable = false, length = 50)
    private String mem_nickname = "";

    @Builder.Default
    private String mem_mobile = "";
    @Builder.Default
    private String mem_phone = "";
    @Builder.Default
    private String mem_email = "";
    @Builder.Default
    private String zipcode = "";
    @Builder.Default
    private String zonecode = "";
    @Builder.Default
    private String addr1 = "";
    @Builder.Default
    private String addr2 = "";
    @Builder.Default
    private String road_address = "";
    @Builder.Default
    private String memo = "";
    @Builder.Default
    private Date work_sdate = new Date();
    @Builder.Default
    private Date work_edate = new Date();
    @Builder.Default
    private Integer team_uid = 0;
    @Builder.Default
    private Integer mem_rank_uid = 0;
    @Builder.Default
    private String mem_no = "";
    @Builder.Default
    private String pay_bank_code = "";
    @Builder.Default
    private String pay_bank_no = "";
    @Builder.Default
    private String pay_bank_owner = "";
    @Builder.Default
    private Integer last_mem_log_uid = 0;
    @Builder.Default
    private Date last_mem_log_date = new Date();
    @Builder.Default
    private Time last_mem_log_time = new Time(System.currentTimeMillis());

    @Builder.Default
    private Integer auto_buyer_uid = 0;
    @Builder.Default
    private String mem_prev = "";
    @Builder.Default
    private String my_memo = "";
    @Builder.Default
    private Integer last_mgr_assign_index = 0;
    @Builder.Default
    private Integer last_building_assign_index = 0;
    @Builder.Default
    private String connected_sns = "";
    @Builder.Default
    private String team_name = "";
    @Builder.Default
    private String rank_name = "";
    @Builder.Default
    private Integer customer_uid = 0;
    @Builder.Default
    private String find_certi_no = "";
    @Builder.Default
    private LocalDateTime find_certi_dt = LocalDateTime.now();
    @Builder.Default
    private String sns_prev = "";
    @Builder.Default
    private String recom_mem_id = "";
    @Builder.Default
    private Integer mem_out_reason_uid = 0;
    @Builder.Default
    private String mem_out_reason_memo = "";
    @Builder.Default
    private Integer mem_point = 0;
    @Builder.Default
    private String sns_type = "";
    @Builder.Default
    private String sns_id = "";
    @Builder.Default
    private Date provision_agree_date = new Date();

    @Builder.Default
    @Column(nullable = false, length = 10)
    private String provision_agree_type = "";

    @Builder.Default
    private Integer mem_day_chk_cnt = 0;

    @Builder.Default
    @Column(name = "reg_mem_machine", nullable = false)
    private String reg_mem_machine = "";

    @Builder.Default
    @Column(name = "reg_mem_os", nullable = false)
    private String reg_mem_os = "";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String hire_status = "Y";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String hire_type = "";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String mem_use_flag = "Y";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String license_flag = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String sub_broker_flag = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String auto_buyer_assign = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String mgr_sms_recv = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String mem_mobile_hide = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String chk_email_sms = "N";

    @Builder.Default
    @Column(nullable = false, length = 1)
    private String AT_app_test = "N";

    @Builder.Default
    @Column(name = "AT_app_debug", nullable = false, length = 1)
    private String AT_app_debug = "N";

//    @Column(name = "mem_out_mem_uid")
//    private Integer mem_out_mem_uid;
//
//    @Column(name = "mem_out_date")
//    private Date memOutDate;
//
//    @Column(name = "mem_out_time")
//    private Time mem_out_time;

    @Column(name = "memOutFlag", nullable = false, length = 1)
    private String memOutFlag = "N";


    @Transient
    private Collection<SimpleGrantedAuthority> authorities;

    @Builder
    public MemberEntity( String mem_nickname, String memId, String password, String mem_name,
                         String hire_type, String memType, String hire_status, Integer team_uid, Integer mem_rank_uid,
                         String mem_mobile, String mem_phone, String mem_email, String zonecode, String addr1,
                         String addr2, String memo) {
        this.mem_nickname = mem_nickname;
        this.memId = memId;
        this.password = password;
        this.mem_name = mem_name;
        this.hire_type = hire_type;
        this.memType = memType;
        this.hire_status = hire_status;
        this.team_uid = team_uid;
        this.mem_rank_uid = mem_rank_uid;
        this.mem_mobile = mem_mobile;
        this.mem_phone = mem_phone;
        this.mem_email = mem_email;
        this.zonecode = zonecode;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.memo = memo;

        this.reg_mem_os = "";
    }

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

    @PrePersist
    @Override
    public void prePersist() {
        super.prePersist();
//        this.memUid = this.uid;
//        this.mem_out_mem_uid = this.outMemUid;
//        this.memOutDate = this.outDate;
//        this.mem_out_time = this.outTime;
    }
}

