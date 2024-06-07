package com.zazaero.data.entity.member;

import com.zazaero.data.entity.base.DeleteBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@MappedSuperclass
@DynamicInsert
@DynamicUpdate
@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class PersonEntity extends DeleteBaseEntity {

    @Column(name = "mem_id", unique = true, length = 20, updatable = false, nullable = false)
    private String memId;

    @Column(name = "ENC_mem_pw", nullable = false)
    private String password;

    @Column(name = "mem_type", nullable = false)
    protected String memType;

    @PrePersist
    public void prePersist() {
        super.prePersist();
        this.regMemUid = this.uid;
    }
}
