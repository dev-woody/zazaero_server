package com.zazaero.entity;

import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "ind_cfg")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ind_cfgEntity {

    @Id
    @GeneratedValue
    @Column(name = "ind_cfg_uid", updatable = false)
    private Long ind_cfg_uid;

    @Column(name = "reg_date", nullable = false)
    private Integer reg_date;

    @Column(name = "reg_time")
    private Date reg_time;

    @Column(name = "reg_mem_uid", nullable = false)
    private Integer reg_mem_uid;

    @Column(name = "customer_uid", nullable = false)
    private Integer customer_uid;

    @Column(name = "cfg_part1", nullable = false, length = 50)
    private Character cfg_part1;

    @Column(name = "cfg_part2", nullable = false, length = 50)
    private Character cfg_part2;

    @Column(name = "cfg_part3", nullable = false, length = 50)
    private Character cfg_part3;

    @Column(name = "cfg_part4", nullable = false, length = 50)
    private Character cfg_part4;

    @Column(name = "cfg_part5", nullable = false, length = 50)
    private Character cfg_part5;

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
    private Character cfg_val1;

    @Column(name = "cfg_val2", nullable = false, length = 100)
    private Character cfg_val2;

    @Column(name = "cfg_val3", nullable = false, length = 100)
    private Character cfg_val3;

    @Column(name = "cfg_val4", nullable = false, length = 100)
    private Character cfg_val4;

    @Column(name = "cfg_val5", nullable = false, length = 100)
    private Character cfg_val5;

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
    private commCode.YNCode ind_cfg_use_flag;

    @Column(name = "hide", nullable = false, length = 1)
    @ColumnDefault("N")
    private String hide;

    @Column(name = "com_uid", nullable = false)
    private Integer com_uid;

    @Column(name = "mod_date")
    private Date mod_date;

    @Column(name = "mod_time")
    private Time mod_time;

    @Column(name = "mod_mem_uid", nullable = false)
    private Integer mod_mem_uid;

    @Column(name = "use_count", nullable = false)
    private Integer use_count;

    @Column(name = "editable", nullable = false)
    @ColumnDefault("Y")
    private commCode.YNCode editable;
}
