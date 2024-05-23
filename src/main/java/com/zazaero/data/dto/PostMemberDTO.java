package com.zazaero.data.dto;

import lombok.Data;

@Data
public class PostMemberDTO {

    private String mem_nickname;
    private String id;
    private String password;
    private String mem_name;
    private String hire_type;
    private String mem_type;
    private String hire_status;
    private Integer team_uid;
    private Integer mem_rank_uid;

    private String mem_mobile;
    private String mem_phone;
    private String mem_email;
    private String zonecode;
    private String addr1;
    private String addr2;
    private String memo;
}
