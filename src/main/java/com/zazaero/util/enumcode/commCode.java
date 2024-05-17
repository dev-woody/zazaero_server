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
        C000("COM"),
        C001("ONE"),
        C002("IND"),
        C003("MST");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum ComStatus {
        C000("counsel"),
        C001("customer");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum OrderType {
        OT000(""),
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
        M000(""),
        M001("pc"),
        M002("mobile"),
        M003("shop"),
        M004("app");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum MachineOSType {
        OS000(""),
        OS001("ipad"),
        OS002("iphone"),
        OS003("blackberry"),
        OS004("android"),
        OS005("atc"),
        OS006("aos"),
        OS007("ios");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum Settlekind {
        SK000(""),
        SK001("bank"),
        SK002("card"),
        SK003("phone"),
        SK004("payco"),
        SK005("vbank"),
        SK006("trans");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum Deli_confirm {
        DC000(""),
        DC001("admin"),
        DC002("client");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum NumCode {
        DC000("0"),
        DC001("1");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum Ord_status {
        OR000(""),
        OR001("ord_writing"),
        OR002("ord_ready"),
        OR003("ord_doing"),
        OR004("ord_edit"),
        OR005("pay_try"),
        OR006("pay_err"),
        OR007("pay_ready"),
        OR008("pay_done"),
        OR009("make_doing"),
        OR010("deli_ready"),
        OR011("deli_doing"),
        OR012("deli_done"),
        OR013("ord_cancel"),
        OR014("ret_ready"),
        OR0015("ret_doing"),
        OR0016("ret_done"),
        OR0017("refund_ready"),
        OR0018("refund_done");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum PayStatus {
        P000(""),
        P001("ready"),
        P002("try"),
        P003("err"),
        P004("done"),
        P005("hack");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum StatusCode {
        S000(""),
        S001("ready"),
        S002("doing"),
        S003("done");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum StatusCode_rd {
        S000(""),
        S001("ready"),
        S002("done");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum StatusCode_dd {
        S000(""),
        S001("doing"),
        S002("done");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum Cash_receipt_type {
        C000(""),
        C001("person"),
        C002("company");

        private String name;
    }

    @Getter
    @AllArgsConstructor
    public enum Cash_receipt_no_type {
        C000(""),
        C001("phone"),
        C002("card"),
        C003("biz_no");

        private String name;
    }

}
