package com.zazaero.data.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Time;
import java.util.Date;

@MappedSuperclass
@DynamicInsert
@DynamicUpdate
@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class DeleteBaseEntity extends ModifyBaseEntity {

    @Builder.Default
    protected Integer outMemUid = 0;
    @Column(name = "out_date")
    protected Date outDate;
    @Column(name = "out_time")
    protected Time outTime;

    @Builder.Default
    @Column(nullable = false, length = 1)
    protected String memOutFlag = "N";

    @PrePersist
    public void prePersist() {
        super.prePersist();
    }
}
