package com.zazaero.entity;

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
@Table(name = "work_info")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Wokr_infoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer work_uid;

    @Column
    private Date reg_date;

    @Column
    private Time reg_time;

    @Column(nullable = false)
    private Integer reg_mem_uid;

    @Column(nullable = false, length = 255)
    private String work_name;

    @Column
    private Date work_sdate;

    @Column
    private Date work_edate;

    @Column
    private Date mod_date;

    @Column
    private Time mod_time;

    @Column(nullable = false)
    private Integer mod_mem_uid;

}
