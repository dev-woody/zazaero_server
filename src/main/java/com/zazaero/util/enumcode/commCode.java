package com.zazaero.util.enumcode;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class commCode {

    @Getter
    @AllArgsConstructor
    public enum MemCode {
        M000("master"),
        M001("admin"),
        M002("client"),
        M003("customer");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum YNCode {
        N("N"),
        Y("Y");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum SnsCode {
        S000("PAYCO"),
        S001("FACEBOOK"),
        S002("NAVER"),
        S003("KAKAO");

        private String name;
    }

}
