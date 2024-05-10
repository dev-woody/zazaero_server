package com.zazaero.entity;

import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "com_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Com_infoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer com_uid;

    @Column(nullable = false)
    private Date reg_date;

    @Column(nullable = false)
    private Time reg_Time;

    @Column(nullable = false)
    private Integer reg_mem_uid;

    @Column(nullable = false, length = 100)
    private Character com_name;

    @Column(nullable = false)
    private commCode.ComType com_type;

    @Column(nullable = false, length = 20)
    private Character biz_no;

    @Column(nullable = false, length = 50)
    private Character ceo_name;

    @Column(nullable = false, length = 20)
    private Character com_phone;

    @Column(nullable = false, length = 13)
    private Character com_mobile;

    @Column(nullable = false, length = 20)
    private Character com_fax;

    @Column(nullable = false, length = 50)
    private Character com_email;

    @Column(nullable = false, length = 50)
    private Character sale_refer_no;

    @Column(nullable = false, length = 50)
    private Character info_mgr_name;

    @Column(nullable = false, length = 50)
    private Character info_mgr_email;

    @Column(nullable = false, length = 100)
    private Character biz_type;

    @Column(nullable = false, length = 100)
    private Character biz_item;

    @Column(nullable = false, length = 50)
    private Character tax_calc_email;

    @Column(nullable = false, length = 5)
    private Character zonecode;

    @Column(nullable = false, length = 10)
    private Character postcode;

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
    private commCode.YNCode com_use_flag;

    @Column(nullable = false)
    private Integer price_SMS;

    @Column(nullable = false)
    private Integer price_LMS;

    @Column(nullable = false)
    private Integer price_MMS;

    @Column(nullable = false)
    private commCode.ComStatus com_status;

    @Column(nullable = false)
    private Integer last_work_counsel_log_uid;

    @Column(nullable = false)
    private String com_memo;

    @Column(nullable = false)
    private String biz_cate;

    @Column(nullable = false)
    private String biz_code;

    @Column(nullable = false)
    private String biz_sdate;

    @Column(nullable = false, length = 50)
    private Character callcenter_open_tiem;

    @Column(nullable = false, length = 20)
    private Character parcel_fee_type;

    @Column(nullable = false, length = 20)
    private Character delevery_type;
}
