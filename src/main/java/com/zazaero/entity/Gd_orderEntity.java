package com.zazaero.entity;

import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Time;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "gd_order")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gd_orderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer gd_order_uid;

    @Column(nullable = false)
    private Integer order_no;

    @Column(nullable = false)
    private Integer parent_gd_order_uid;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer add_gd_order_idx;

    @Column
    private Date reg_date;

    @Column
    private Time reg_time;

    @Column(nullable = false)
    private Integer reg_mem_uid;

    @Column(nullable = false)
    private Integer work_uid;

    @Column(nullable = false)
    private Integer deli_addr_uid;

    @Column(nullable = false)
    private Integer goods_cate1_uid;

    @Column(nullable = false)
    @ColumnDefault("OT000")
    private commCode.OrderType order_type;

    @Column(nullable = false)
    private Integer private_goods_uid;

    @Column(nullable = false)
    private commCode.MachineType order_machine;

    @Column(nullable = false)
    private commCode.MachineOSType order_machine_os;

    @Column(nullable = false)
    private Integer mgr_mem_uid;

    @Column(nullable = false, length = 15)
    private String ip;

    @Column
    private Date order_date;

    @Column
    private Time order_time;

    @Column(nullable = false)
    private Integer mem_uid;

    @Column(nullable = false)
    private Integer guest_uid;

    @Column(nullable = false, length = 200)
    private String order_title;

    @Column(nullable = false, length = 20)
    private String order_mem_name;

    @Column(nullable = false, length = 100)
    private String order_mem_email;

    @Column(nullable = false, length = 20)
    private String order_mem_phone;

    @Column(nullable = false, length = 20)
    private String order_mem_mobile;

    @Column(nullable = false, length = 20)
    private String recv_name;

    @Column(nullable = false, length = 20)
    private String recv_phone;

    @Column(nullable = false, length = 20)
    private String recv_mobile;

    @Column(nullable = false, length = 10)
    private String zipcode;

    @Column(nullable = false, length = 11)
    private String zonecode;

    @Column(nullable = false, length = 100)
    private String addr1;

    @Column(nullable = false, length = 100)
    private String addr2;

    @Column(nullable = false)
    private String order_memo;

    @Column(nullable = false)
    private String admin_memo;

    @Column(nullable = false)
    private String settlelog;

    @Column(nullable = false)
    private commCode.Settlekind settlekind;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer settleprice;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private String settleprice_flag;

    @Column(nullable = false)
    private Integer settleprice_src;

    @Column(nullable = false)
    private Integer enuri;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer prn_settleprice;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer goodsprice;

    @Column(nullable = false)
    private Integer optprice;

    @Column(nullable = false)
    private Integer sum_sell_price;

    @Column(nullable = false)
    private Integer tot_refund_money;

    @Column(nullable = false, length = 20)
    private String deli_title;

    @Column(nullable = false, length = 10)
    private String deli_type;

    @Column(nullable = false, length = 100)
    private String deli_msg;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer deli_price;

    @Column(nullable = false)
    private Integer src_deli_price;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer coupon;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer save_point;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer memberdc;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer point_use;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer reserve;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer bankAccount;

    @Column(nullable = false, length = 20)
    private String bankSender;

    @Column(nullable = false)
    private Integer step;

    @Column(nullable = false)
    private Integer step2;

    @Column(nullable = false)
    private String referer;

    @Column
    private Date pay_date;

    @Column
    private Time pay_time;

    @Column(nullable = false, length = 20)
    @ColumnDefault("cust")
    private String deli_mgr_type;

    @Column(nullable = false)
    private Integer deli_car_type;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private String deli_start_yn;

    @Column
    private Date deli_start_date;

    @Column
    private Time deli_start_time;

    @Column(nullable = false)
    private Integer deli_com;

    @Column(nullable = false, length = 20)
    private String deli_code;

    @Column
    private commCode.Deli_confirm deli_confirm;

    @Column
    private Date deli_confirm_date;

    @Column
    private Time deli_confirm_time;

    @Column(nullable = false)
    private commCode.NumCode freeDelivery;

    @Column
    private commCode.NumCode goodsDelivery;

    @Column(nullable = false)
    @ColumnDefault("OR000")
    private commCode.Ord_status ord_status;

    @Column
    private Date ord_status_date;

    @Column
    private Time ord_status_time;

    @Column(nullable = false)
    @ColumnDefault("P000")
    private commCode.PayStatus pay_status;

    @Column
    private Date pay_status_date;

    @Column
    private Time pay_status_time;

    @Column(nullable = false)
    private Integer pay_status_mem_uid;

    @Column(nullable = false, length = 100)
    private String imp_uid;

    @Column(nullable = false)
    @ColumnDefault("S000")
    private commCode.StatusCode make_status;

    @Column(nullable = false)
    @ColumnDefault("S000")
    private commCode.StatusCode deli_status;

    @Column
    private Date deli_done_date;

    @Column
    private Time deli_done_time;

    @Column(nullable = false, length = 20)
    @ColumnDefault("none")
    private String cancel_type;

    @Column(nullable = false, length = 20)
    @ColumnDefault("none")
    private String cancel_status;

    @Column(nullable = false)
    @ColumnDefault("N")
    private commCode.YNCode cancel_flag;

    @Column(nullable = false)
    private Integer cancel_reason_uid;

    @Column(nullable = false)
    private Integer cancel_mem_uid;

    @Column
    private Date cancel_date;

    @Column
    private Time cancel_time;

    @Column(nullable = false)
    private String cancel_memo;

    @Column(nullable = false)
    @ColumnDefault("N")
    private commCode.YNCode refund_deli_flag;

    @Column(nullable = false)
    @ColumnDefault("S000")
    private commCode.StatusCode_rd refund_status;

    @Column(nullable = false)
    private commCode.StatusCode_dd refund_part_status;

    @Column(nullable = false, length = 3)
    private String refund_bank_code;

    @Column(nullable = false, length = 50)
    private String refund_bank_no;

    @Column(nullable = false, length = 30)
    private String refund_bank_owner;

    @Column
    private Date refund_date;

    @Column
    private Time refund_time;

    @Column(nullable = false)
    private Integer refund_mem_uid;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private String order_result_set;

    @Column(nullable = false, length = 1)
    private String receipt_type;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private String tax_receipt_use;

    @Column(nullable = false, length = 20)
    private String biz_no;

    @Column(nullable = false, length = 100)
    private String com_name;

    @Column(nullable = false, length = 50)
    private String ceo_name;

    @Column(nullable = false, length = 200)
    private String biz_addr;

    @Column(nullable = false, length = 100)
    private String biz_cate;

    @Column(nullable = false, length = 100)
    private String biz_item;

    @Column(nullable = false, length = 100)
    private String biz_email;

    @Column(nullable = false)
    private commCode.Cash_receipt_type cash_receipt_type;

    @Column(nullable = false)
    private commCode.Cash_receipt_no_type cash_receipt_no_type;

    @Column(nullable = false, length = 100)
    private String cash_receipt_no;

    @Column(nullable = false, length = 10)
    @ColumnDefault("ready")
    private String receipt_status;

    @Column
    private Date receipt_status_date;

    @Column
    private Time receipt_status_time;

    @Column(nullable = false)
    private Integer receipt_status_mem_uid;

    @Column
    private Date mod_date;

    @Column
    private Time mod_time;

    @Column(nullable = false)
    private Integer mod_mem_uid;

    @Column(nullable = false)
    private commCode.StatusCode ret_status;

    @Column(nullable = false, length = 1)
    private String return_deli_duty;

    @Column
    private Date ret_date;

    @Column
    private Time ret_time;

    @Column(nullable = false)
    private Integer ret_mem_uid;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private String pay_result_set;

    @Column(nullable = false, length = 10)
    private String vbankBankCode;

    @Column(nullable = false, length = 100)
    private String vbankBankName;

    @Column(nullable = false, length = 50)
    private String vbankNum;

    @Column(nullable = false, length = 20)
    private String vbankExpDate;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private Character set_order_result;

    @Column(nullable = false, length = 20)
    private Character pg_type;

    @Column(nullable = false, length = 200)
    private Character pg_tid;

    @Column(nullable = false)
    private String refund_memo;

    @Column(nullable = false)
    private Integer make_price;

    @Column(nullable = false)
    private Integer hope_opt_price;

    @Column
    private Date hope_deli_date;

    @Column(nullable = false, length = 20)
    private Character hope_deli_time;

    @Column(nullable = false, length = 50)
    private Character deli_mem_name;

    @Column(nullable = false, length = 20)
    private Character deli_mem_mobile;

    @Column(nullable = false)
    private Integer sell_customer_uid;

    @Column(nullable = false)
    private Integer tot_sell_price;

    @Column(nullable = false)
    private Integer tot_opt_price;

    @Column(nullable = false)
    private Integer tot_ord_price;

    @Column(nullable = false)
    private Integer tot_js_price;

    @Column
    private Date sel_date;

    @Column
    private Time sel_time;

    @Column(nullable = false)
    private Integer sel_mem_uid;

    @Column(nullable = false)
    @ColumnDefault("2")
    private Integer version_no;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private Character mod_addr_flag;

    @Column(nullable = false, length = 1)
    @ColumnDefault("N")
    private Character mod_hope_flag;
}
