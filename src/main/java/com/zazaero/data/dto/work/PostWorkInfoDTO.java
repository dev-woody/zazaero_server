package com.zazaero.data.dto.work;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class PostWorkInfoDTO {
    private Integer regMemUid;
    private String workName;
    private Date workSdate;
    private Date workEdate;
}
