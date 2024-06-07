package com.zazaero.data.dto.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PostMemberDTO {

    @NotBlank
    private Long reg_mem_uid;

    @NotBlank
    private String mem_nickname;

    @NotBlank
    private String memId;

    @NotBlank
    private String password;

    @NotBlank
    private String mem_name;

    @NotBlank
    private String hire_type;

    @NotBlank
    private String mem_type;

    @NotBlank
    private String hire_status;

    @NotNull
    private Integer team_uid;

    @NotNull
    private Integer mem_rank_uid;

    @NotBlank
    private String mem_mobile;

    private String mem_phone;

    @Email
    @NotBlank
    private String mem_email;

    private String zonecode;
    private String addr1;
    private String addr2;
    private String memo;
}