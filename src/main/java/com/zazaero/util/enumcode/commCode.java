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

    @Getter
    @AllArgsConstructor
    public enum ComType {
        C001("COM"),
        C002("ONE"),
        C003("IND"),
        C004("MST");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum ComStatus {
        C001("counsel"),
        C002("customer");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum OrderType {
        OT001("sian"),
        OT002("self"),
        OT003("sample"),
        OT004("private"),
        OT005("shop"),
        OT006("event"),
        OT007("school");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum MachineType {
        M001(""),
        M002("pc"),
        M003("mobile"),
        M004("shop"),
        M005("app");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum MachineOSType {
        OS001(""),
        OS002("ipad"),
        OS003("iphone"),
        OS004("blackberry"),
        OS005("android"),
        OS006("atc"),
        OS007("aos"),
        OS008("ios");

        private String name;
    }

}
