package com.zazaero.data.entity.indCfg;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Time;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "com_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
public class ComInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_uid", updatable = false)
    private Long id;

    @Column(nullable = false)
    private Date reg_date;

    @Column(nullable = false)
    private Time reg_time;

    @Column(nullable = false)
    private Integer reg_mem_uid;

    @Column(nullable = false, length = 100)
    private String com_name;

    @Column(nullable = false)
    private String com_type;

    @Column(nullable = false, length = 20)
    private String biz_no;

    @Column(nullable = false, length = 50)
    private String ceo_name;

    @Column(nullable = false, length = 20)
    private String com_phone;

    @Column(nullable = false, length = 13)
    private String com_mobile;

    @Column(nullable = false, length = 20)
    private String com_fax;

    @Column(nullable = false, length = 50)
    private String com_email;

    @Column(nullable = false, length = 50)
    private String sale_refer_no;

    @Column(nullable = false, length = 50)
    private String info_mgr_name;

    @Column(nullable = false, length = 50)
    private String info_mgr_email;

    @Column(nullable = false, length = 100)
    private String biz_type;

    @Column(nullable = false, length = 100)
    private String biz_item;

    @Column(nullable = false, length = 50)
    private String tax_calc_email;

    @Column(nullable = false, length = 5)
    private String zonecode;

    @Column(nullable = false, length = 10)
    private String postcode;

    @Column(nullable = false)
    private Integer post1;

    @Column(nullable = false)
    private Integer post2;

    @Column(nullable = false)
    private String addr1;

    @Column(nullable = false)
    private String addr2;

    @Column(nullable = false)
    private Integer ct_mem_uid;

    @Column(nullable = false)
    private String com_use_flag;

    @Column(nullable = false)
    private Integer price_SMS;

    @Column(nullable = false)
    private Integer price_LMS;

    @Column(nullable = false)
    private Integer price_MMS;

    @Column(nullable = false)
    private String com_status;

    @Column(nullable = false)
    private Integer last_work_counsel_log_uid;

    @Column(nullable = false)
    private String com_memo;

    @Column(nullable = false)
    private String biz_cate;

    @Column(nullable = false)
    private String biz_code;

    @Column
    private Date biz_sdate;

    @Column(nullable = false, length = 50)
    private String callcenter_open_time;

    @Column(nullable = false, length = 20)
    private String parcel_fee_type;

    @Column(nullable = false, length = 20)
    private String delivery_type;
}
