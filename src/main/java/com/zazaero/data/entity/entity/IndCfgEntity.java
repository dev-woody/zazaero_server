package com.zazaero.data.entity.entity;

import com.zazaero.data.dto.indCfg.PostPopupDTO;
import com.zazaero.data.entity.base.ModifyBaseEntity;
import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "ind_cfg")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
public class IndCfgEntity extends ModifyBaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ind_cfg_uid", updatable = false)
    private Integer indCfgUid;

//    @Column(name = "reg_date", nullable = false)
//    private Date reg_date;
//
//    @Column(name = "reg_time", nullable = false)
//    private Time reg_time;

//    @Column(name = "reg_mem_uid", nullable = false)
//    private Integer reg_mem_uid;

    @Column(name = "customer_uid", nullable = false)
    private Integer customer_uid;

    @Column(name = "cfg_part1", nullable = false, length = 50)
    private String cfgPart1;

    @Column(name = "cfg_part2", nullable = false, length = 50)
    private String cfgPart2;

    @Column(name = "cfg_part3", nullable = false, length = 50)
    private String cfg_part3;

    @Column(name = "cfg_part4", nullable = false, length = 50)
    private String cfg_part4;

    @Column(name = "cfg_part5", nullable = false, length = 50)
    private String cfg_part5;

    @Column(name = "cfg_index", nullable = false)
    private Integer cfg_index;

    @Column(name = "cfg_int_val1", nullable = false)
    private Integer cfg_int_val1;

    @Column(name = "cfg_int_val2", nullable = false)
    private Integer cfg_int_val2;

    @Column(name = "cfg_int_val3", nullable = false)
    private Integer cfg_int_val3;

    @Column(name = "cfg_bigint_val1", nullable = false)
    private BigInteger cfg_bigint_val1;

    @Column(name = "cfg_bigint_val2", nullable = false)
    private BigInteger cfg_bigint_val2;

    @Column(name = "cfg_bigint_val3",nullable = false)
    private BigInteger cfg_bigint_val3;

    @Column(name = "cfg_val1", nullable = false, length = 100)
    private String cfg_val1;

    @Column(name = "cfg_val2", nullable = false, length = 100)
    private String cfg_val2;

    @Column(name = "cfg_val3", nullable = false, length = 100)
    private String cfg_val3;

    @Column(name = "cfg_val4", nullable = false, length = 100)
    private String cfg_val4;

    @Column(name = "cfg_val5", nullable = false, length = 100)
    private String cfg_val5;

    @Column(name = "cfg_txt_val1", nullable = false)
    private String cfg_txt_val1;

    @Column(name = "cfg_txt_val2", nullable = false)
    private String cfg_txt_val2;

    @Column(name = "cfg_txt_val3", nullable = false)
    private String cfg_txt_val3;

    @Column(name = "cfg_date_val1")
    private Date cfg_date_val1;

    @Column(name = "cfg_date_val2")
    private Date cfg_date_val2;

    @Column(name = "ind_cfg_use_flag", nullable = false)
    @ColumnDefault("Y")
    private String ind_cfg_use_flag;

    @Column(name = "hide", nullable = false, length = 1)
    @ColumnDefault("N")
    private String hide;

    @Column(name = "com_uid", nullable = false)
    private Long com_uid;

//    @Column(name = "mod_date")
//    private Date mod_date;
//
//    @Column(name = "mod_time")
//    private Time mod_time;
//
//    @Column(name = "mod_mem_uid", nullable = false)
//    private Integer mod_mem_uid;

    @Column(name = "use_count", nullable = false)
    private Integer use_count;

    @Column(name = "editable", nullable = false)
    @ColumnDefault("Y")
    private String editable;

    @PrePersist
    public void prePersist() {
        super.prePersist();
        this.indCfgUid = this.uid;
    }

    @Builder
    public IndCfgEntity( Integer customer_uid,
                  String cfgPart1, String cfgPart2, String cfg_part3, String cfg_part4, String cfg_part5,
                  Integer cfg_index, Integer cfg_int_val1, Integer cfg_int_val2, Integer cfg_int_val3,
                  BigInteger cfg_bigint_val1, BigInteger cfg_bigint_val2, BigInteger cfg_bigint_val3,
                  String cfg_val1, String cfg_val2, String cfg_val3, String cfg_val4, String cfg_val5,
                  String cfg_txt_val1, String cfg_txt_val2, String cfg_txt_val3, Date cfg_date_val1,
                  Date cfg_date_val2, String ind_cfg_use_flag, String hide, Long com_uid, Integer use_count, String editable) {
//        this.ind_cfg_uid = ind_cfg_uid;
//        this.reg_date = reg_date;
//        this.reg_time = reg_time;
//        this.reg_mem_uid = reg_mem_uid;
        this.customer_uid = customer_uid;
        this.cfgPart1 = cfgPart1;
        this.cfgPart2 = cfgPart2;
        this.cfg_part3 = cfg_part3;
        this.cfg_part4 = cfg_part4;
        this.cfg_part5 = cfg_part5;
        this.cfg_index = cfg_index;
        this.cfg_int_val1 = cfg_int_val1;
        this.cfg_int_val2 = cfg_int_val2;
        this.cfg_int_val3 = cfg_int_val3;
        this.cfg_bigint_val1 = cfg_bigint_val1;
        this.cfg_bigint_val2 = cfg_bigint_val2;
        this.cfg_bigint_val3 = cfg_bigint_val3;
        this.cfg_val1 = cfg_val1;
        this.cfg_val2 = cfg_val2;
        this.cfg_val3 = cfg_val3;
        this.cfg_val4 = cfg_val4;
        this.cfg_val5 = cfg_val5;
        this.cfg_txt_val1 = cfg_txt_val1;
        this.cfg_txt_val2 = cfg_txt_val2;
        this.cfg_txt_val3 = cfg_txt_val3;
        this.cfg_date_val1 = cfg_date_val1;
        this.cfg_date_val2 = cfg_date_val2;
        this.ind_cfg_use_flag = ind_cfg_use_flag;
        this.hide = hide;
        this.com_uid = com_uid;
//        this.mod_date = mod_date;
//        this.mod_time = mod_time;
//        this.mod_mem_uid = mod_mem_uid;
        this.use_count = use_count;
        this.editable = editable;
    }
//    IndCfgEntity indCfgEntity = new IndCfgEntity().Builder()
//            this.reg_date(new Date())
//            this.reg_time(new Time(System.currentTimeMillis()))
//            this.reg_mem_uid(123)
//            this.customer_uid(456)
//            this.cfgPart1("Part1")
//            this.cfgPart2("Part2")
//            this.cfg_part3("Part3")
//            this.cfg_part4("Part4")
//            this.cfg_part5("Part5")
//            this.cfg_index(1)
//            this.cfg_int_val1(10)
//            this.cfg_int_val2(20)
//            this.cfg_int_val3(30)
//            this.cfg_bigint_val1(BigInteger.valueOf(100L))
//            this.cfg_bigint_val2(BigInteger.valueOf(200L))
//            this.cfg_bigint_val3(BigInteger.valueOf(300L))
//            this.cfg_val1("Value1")
//            this.cfg_val2("Value2")
//            this.cfg_val3("Value3")
//            this.cfg_val4("Value4")
//            this.cfg_val5("Value5")
//            this.cfg_txt_val1("Text1")
//            this.cfg_txt_val2("Text2")
//            this.cfg_txt_val3("Text3")
//            this.cfg_date_val1(new Date())
//            this.cfg_date_val2(new Date())
//            this.ind_cfg_use_flag("Y")
//            this.hide("N")
//            this.com_uid(789L)
//            this.mod_date(new Date())
//            this.mod_time(new Time(System.currentTimeMillis()))
//            this.mod_mem_uid(456)
//            this.use_count(5)
//            this.editable("Y")
//            this.build();
}
