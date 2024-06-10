package com.zazaero.data.dto.indCfg;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.sql.Time;
import java.util.Date;
@Data
public class PostSchInfoDTO {
    @NotBlank
    private Integer regMemUid;
    @NotBlank
    private Integer selMemUid;
    @NotBlank
    private Integer schTypeUid;
    @NotBlank
    private Integer schSmsUid;
    @NotBlank
    private Date schDate;
    @NotBlank
    private Time schTime;
    @NotBlank
    private Date schEndDate;
    @NotBlank
    private Time schEndTime;
    @NotBlank
    private String schTitle;
    @NotBlank
    private String schMemo;
    @NotBlank
    private Integer editMemUid;
    @NotBlank
    private Integer clientUid;
}
