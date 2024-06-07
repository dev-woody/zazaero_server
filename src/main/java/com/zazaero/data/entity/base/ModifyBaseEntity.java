package com.zazaero.data.entity.base;

import com.zazaero.data.entity.member.PersonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public abstract class ModifyBaseEntity extends DefaultBaseEntity {

    @Column(name = "mod_mem_uid", nullable = false)
    private Integer modMemUid;

    @Column(name = "mod_date", nullable = false)
    private Date modDate;

    @Column(name = "mod_time", nullable = false)
    private Time modTime;

    public void updateInfo(PersonEntity personEntity) {
        this.modMemUid = personEntity.getUid();
    }

    @PrePersist
    public void prePersist() {
        super.prePersist();
        this.modDate = new Date();
        this.modTime = new Time(System.currentTimeMillis());
        if (this.modMemUid == null) {
            this.modMemUid = 0; // 기본값 설정
        }
    }

    @PreUpdate
    public void preUpdate() {
        this.modDate = new Date();
        this.modTime = new Time((System.currentTimeMillis()));
    }
}
