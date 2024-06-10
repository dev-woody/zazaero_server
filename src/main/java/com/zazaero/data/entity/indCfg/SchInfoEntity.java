package com.zazaero.data.entity.indCfg;

import com.zazaero.data.entity.base.ModifyBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@SuperBuilder
@DynamicInsert
@DynamicUpdate
@AttributeOverrides({
        @AttributeOverride(name = "uid", column = @Column(name = "sch_uid")),
        @AttributeOverride(name = "modDate", column = @Column(name = "edit_date")),
        @AttributeOverride(name = "modTime", column = @Column(name = "edit_time")),
        @AttributeOverride(name = "modMemUid", column = @Column(name = "edit_mem_uid"))
})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "sch_info")
public class SchInfoEntity extends ModifyBaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "sch_uid", nullable = false)
//    private Integer schUid;

//    @Column(name = "reg_date", nullable = false)
//    private Date regDate;
//
//    @Column(name = "reg_time", nullable = false)
//    private Time regTime;

    @Column(name = "reg_mem_uid", nullable = false)
    private Integer regMemUid;

    @Column(name = "sel_mem_uid", nullable = false)
    private Integer selMemUid;

    @Column(name = "sch_type_uid", nullable = false)
    private Integer schTypeUid;

    @Column(name = "sch_sms_uid", nullable = false)
    private Integer schSmsUid;

    @Column(name = "sch_date", nullable = false)
    private Date schDate;

    @Column(name = "sch_time", nullable = false)
    private Time schTime;

    @Column(name = "sch_end_date", nullable = false)
    private Date schEndDate;

    @Column(name = "sch_end_time", nullable = false)
    private Time schEndTime;

    @Column(name = "sch_title", nullable = false, length = 255)
    private String schTitle;

    @Column(name = "sch_memo", nullable = false, columnDefinition = "TEXT")
    private String schMemo;

//    @Column(name = "edit_date", nullable = false)
//    private Date editDate;
//
//    @Column(name = "edit_time", nullable = false)
//    private Time editTime;

//    @Column(name = "edit_mem_uid", nullable = false)
//    private Integer editMemUid;

    @Column(name = "client_uid", nullable = false)
    private Integer clientUid;

    @Builder
    public SchInfoEntity( Integer regMemUid, Integer selMemUid, Integer schTypeUid,
                         Integer schSmsUid, Date schDate, Time schTime, Date schEndDate, Time schEndTime,
                         String schTitle, String schMemo, Integer clientUid) {
//        this.regDate = regDate;
//        this.regTime = regTime;
        this.regMemUid = regMemUid;
        this.selMemUid = selMemUid;
        this.schTypeUid = schTypeUid;
        this.schSmsUid = schSmsUid;
        this.schDate = schDate;
        this.schTime = schTime;
        this.schEndDate = schEndDate;
        this.schEndTime = schEndTime;
        this.schTitle = schTitle;
        this.schMemo = schMemo;
//        this.editDate = editDate;
//        this.editTime = editTime;
//        this.editMemUid = editMemUid;
        this.clientUid = clientUid;
    }
}