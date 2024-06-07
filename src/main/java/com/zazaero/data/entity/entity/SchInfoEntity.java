package com.zazaero.data.entity.entity;

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
@Table(name = "sch_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SchInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long sch_uid;

    @Column(name = "reg_date")
    private Date reg_date;

    @Column(name = "reg_time")
    private Date reg_time;

    @Column(name = "reg_mem_uid", nullable = false)
    private Integer reg_mem_uid;

    @Column(name = "sel_mem_uid", nullable = false)
    private Integer sel_mem_uid;

    @Column(name = "sch_type_uid", nullable = false)
    private Integer sch_type_uid;

    @Column(name = "sch_sms_uid", nullable = false)
    private Integer sch_sms_uid;

    @Column(name = "sch_date")
    private Date sch_date;

    @Column(name = "sch_time")
    private Time sch_time;

    @Column(name = "sch_end_date")
    private Date sch_end_date;

    @Column(name = "sch_end_time")
    private Time sch_end_time;

    @Column(name = "sch_title", nullable = false)
    private String sch_title;


    @Column(name = "sch_memo", nullable = false)
    private String sch_memo;

    @Column(name = "edit_date")
    private Date edit_date;

    @Column(name = "edit_time")
    private Time edit_time;

    @Column(name = "edit_mem_uid", nullable = false)
    private Integer edit_mem_uid;

    @Column(name = "client_uid", nullable = false)
    private Integer client_uid;
}
