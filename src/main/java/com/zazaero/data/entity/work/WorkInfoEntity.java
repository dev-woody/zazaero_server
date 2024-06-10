package com.zazaero.data.entity.work;

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
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@SuperBuilder
@Table(name = "work_info")
@AttributeOverrides({
        @AttributeOverride(name = "uid", column = @Column(name = "work_uid")),
        @AttributeOverride(name = "modMemUid", column = @Column(name = "mod_mem_uid")),
        @AttributeOverride(name = "modDate", column = @Column(name = "mod_date")),
        @AttributeOverride(name = "modTime", column = @Column(name = "mod_time")),
        @AttributeOverride(name = "regDate", column = @Column(name = "reg_date")),
        @AttributeOverride(name = "regTime", column = @Column(name = "reg_time"))
})
public class WorkInfoEntity extends ModifyBaseEntity {

    @Column(name = "work_name", nullable = false, length = 200)
    private String workName;

    @Column(name = "work_sdate", nullable = false)
    private Date workSdate;

    @Column(name = "work_edate", nullable = false)
    private Date workEdate;

    @Builder.Default
    @Column(name = "reg_mem_uid", nullable = false)
    private Integer regMemUid = 0;

    @Builder
    public WorkInfoEntity(Integer regMemUid, String workName, Date workSdate, Date workEdate) {
        super();
        this.regMemUid = regMemUid;
        this.workName = workName;
        this.workSdate = workSdate;
        this.workEdate = workEdate;
    }
}
