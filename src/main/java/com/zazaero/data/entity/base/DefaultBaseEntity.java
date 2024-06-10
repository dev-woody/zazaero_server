package com.zazaero.data.entity.base;

import com.zazaero.data.entity.member.PersonEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Time;
import java.util.Date;

@MappedSuperclass
@DynamicInsert
@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class DefaultBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( updatable = false, nullable = false)
    protected Integer uid;

//    @Column(name = "reg_mem_uid", nullable = false, updatable = false)
//    protected Integer regMemUid;

    @Column(name = "reg_date", nullable = false, updatable = false)
    private Date regDate;

    @Column(name = "reg_time", nullable = false, updatable = false)
    private Time regTime;

//    public void createInfo(PersonEntity personEntity) {
//        this.regMemUid = personEntity.getUid();
//    }

    @PrePersist
    public void prePersist() {
        this.regDate = new Date();
        this.regTime = new Time(System.currentTimeMillis());
//        this.regMemUid = 0;
    }

}