package com.zazaero.data.entity.indCfg;

import com.zazaero.data.entity.base.ModifyBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
@SuperBuilder
@AttributeOverrides({
        @AttributeOverride(name = "uid", column = @Column(name = "ind_cfg_uid")),
        @AttributeOverride(name = "modDate", column = @Column(name = "mod_date")),
        @AttributeOverride(name = "modTime", column = @Column(name = "mod_time")),
        @AttributeOverride(name = "modMemUid", column = @Column(name = "mod_mem_uid")),
//        @AttributeOverride(name = "regMemUid", column = @Column(name = "reg_mem_uid"))
})
@Table(name = "ind_cfg")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IndCfgEntity extends ModifyBaseEntity {

    @Builder.Default
    @Column(name = "customer_uid", nullable = false)
    private Integer customerUid = 0;

    @Builder.Default
    @Column(name = "cfg_part1", nullable = false, length = 50)
    private String cfgPart1 = "";

    @Builder.Default
    @Column(name = "cfg_part2", nullable = false, length = 50)
    private String cfgPart2 = "";

    @Builder.Default
    @Column(name = "cfg_part3", nullable = false, length = 50)
    private String cfgPart3 = "";

    @Builder.Default
    @Column(name = "cfg_part4", nullable = false, length = 50)
    private String cfgPart4 = "";

    @Builder.Default
    @Column(name = "cfg_part5", nullable = false, length = 50)
    private String cfgPart5 = "";

    @Builder.Default
    @Column(name = "cfg_index", nullable = false)
    private Integer cfgIndex = 0;

    @Builder.Default
    @Column(name = "cfg_int_val1", nullable = false)
    private Integer cfgIntVal1 = 0;

    @Builder.Default
    @Column(name = "cfg_int_val2", nullable = false)
    private Integer cfgIntVal2 = 0;

    @Builder.Default
    @Column(name = "cfg_int_val3", nullable = false)
    private Integer cfgIntVal3 = 0;

    @Builder.Default
    @Column(name = "cfg_bigint_val1", nullable = false)
    private BigInteger cfgBigintVal1 = BigInteger.ZERO;

    @Builder.Default
    @Column(name = "cfg_bigint_val2", nullable = false)
    private BigInteger cfgBigintVal2 = BigInteger.ZERO;

    @Builder.Default
    @Column(name = "cfg_bigint_val3", nullable = false)
    private BigInteger cfgBigintVal3 = BigInteger.ZERO;

    @Builder.Default
    @Column(name = "cfg_val1", nullable = false, length = 100)
    private String cfgVal1 = "";

    @Builder.Default
    @Column(name = "cfg_val2", nullable = false, length = 100)
    private String cfgVal2 = "";

    @Builder.Default
    @Column(name = "cfg_val3", nullable = false, length = 100)
    private String cfgVal3 = "";

    @Builder.Default
    @Column(name = "cfg_val4", nullable = false, length = 100)
    private String cfgVal4 = "";

    @Builder.Default
    @Column(name = "cfg_val5", nullable = false, length = 100)
    private String cfgVal5 = "";

    @Builder.Default
    @Column(name = "cfg_txt_val1", nullable = false)
    private String cfgTxtVal1 = "";

    @Builder.Default
    @Column(name = "cfg_txt_val2", nullable = false)
    private String cfgTxtVal2 = "";

    @Builder.Default
    @Column(name = "cfg_txt_val3", nullable = false)
    private String cfgTxtVal3 = "";

    @Column(name = "cfg_date_val1")
    private Date cfgDateVal1;

    @Column(name = "cfg_date_val2")
    private Date cfgDateVal2;

    @Builder.Default
    @Column(name = "ind_cfg_use_flag", nullable = false)
    private String indCfgUseFlag = "Y";

    @Builder.Default
    @Column(name = "hide", nullable = false, length = 1)
    private String hide = "N";

    @Builder.Default
    @Column(name = "com_uid", nullable = false)
    private Long comUid = 0L;

    @Builder.Default
    @Column(name = "use_count", nullable = false)
    private Integer useCount = 0;

    @Builder.Default
    @Column(name = "editable", nullable = false)
    private String editable = "Y";

    @Column(name = "reg_mem_uid", nullable = false)
    private Integer regMemUid;

    @PrePersist
    public void prePersist() {
        super.prePersist();
//        this.indCfgUid = this.uid;
    }

    @Builder
    public IndCfgEntity(Integer customerUid,
                        String cfgPart1, String cfgPart2, String cfgPart3, String cfgPart4, String cfgPart5,
                        Integer cfgIndex, Integer cfgIntVal1, Integer cfgIntVal2, Integer cfgIntVal3,
                        BigInteger cfgBigintVal1, BigInteger cfgBigintVal2, BigInteger cfgBigintVal3,
                        String cfgVal1, String cfgVal2, String cfgVal3, String cfgVal4, String cfgVal5,
                        String cfgTxtVal1, String cfgTxtVal2, String cfgTxtVal3, Date cfgDateVal1,
                        Date cfgDateVal2, String indCfgUseFlag, String hide, Long comUid, Integer useCount, String editable, Integer regMemUid) {
        this.customerUid = customerUid;
        this.cfgPart1 = cfgPart1;
        this.cfgPart2 = cfgPart2;
        this.cfgPart3 = cfgPart3;
        this.cfgPart4 = cfgPart4;
        this.cfgPart5 = cfgPart5;
        this.cfgIndex = cfgIndex;
        this.cfgIntVal1 = cfgIntVal1;
        this.cfgIntVal2 = cfgIntVal2;
        this.cfgIntVal3 = cfgIntVal3;
        this.cfgBigintVal1 = cfgBigintVal1;
        this.cfgBigintVal2 = cfgBigintVal2;
        this.cfgBigintVal3 = cfgBigintVal3;
        this.cfgVal1 = cfgVal1;
        this.cfgVal2 = cfgVal2;
        this.cfgVal3 = cfgVal3;
        this.cfgVal4 = cfgVal4;
        this.cfgVal5 = cfgVal5;
        this.cfgTxtVal1 = cfgTxtVal1;
        this.cfgTxtVal2 = cfgTxtVal2;
        this.cfgTxtVal3 = cfgTxtVal3;
        this.cfgDateVal1 = cfgDateVal1;
        this.cfgDateVal2 = cfgDateVal2;
        this.indCfgUseFlag = indCfgUseFlag;
        this.hide = hide;
        this.comUid = comUid;
        this.useCount = useCount;
        this.editable = editable;
        this.regMemUid = regMemUid;
    }
}
