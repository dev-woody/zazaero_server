package com.zazaero.entity;

import com.zazaero.util.enumcode.commCode;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private commCode.OrderType order_type;

    @Column(nullable = false)
    private Integer private_goods_uid;

    @Column(nullable = false)
    private commCode.MachineType order_machine;

    @Column(nullable = false)
    private commCode.MachineOSType order_machine_os;

    mgr_mem_uid	ip	order_date	order_time	mem_uid	guest_uid	order_title	order_mem_name	order_mem_email	order_mem_phone	order_mem_mobile	recv_name	recv_phone	recv_mobile	zipcode	zonecode	addr1	addr2	order_memo	admin_memo	settlelog	settlekind	settleprice	settleprice_flag	settleprice_src	enuri	prn_settleprice	goodsprice	optprice	sum_sell_price	tot_refund_money	deli_title	deli_type	deli_msg	deli_price	src_deli_price	coupon	save_point	memberdc	point_use	reserve	bankAccount	bankSender	step	step2	referer	pay_date	pay_time	deli_mgr_type	deli_car_type	deli_start_yn	deli_start_date	deli_start_time	deli_com	deli_code	deli_confirm	deli_confirm_date	deli_confirm_time	freeDelivery	goodsDelivery	ord_status	ord_status_date	ord_status_time	pay_status	pay_status_date	pay_status_time	pay_status_mem_uid	imp_uid	make_status	deli_status	deli_done_date	deli_done_time	cancel_type	cancel_status	cancel_flag	cancel_reason_uid	cancel_mem_uid	cancel_date	cancel_time	cancel_memo	refund_deli_flag	refund_status	refund_part_status	refund_bank_code	refund_bank_no	refund_bank_owner	refund_date	refund_time	refund_mem_uid	order_result_set	receipt_type	tax_receipt_use	biz_no	com_name	ceo_name	biz_addr	biz_cate	biz_item	biz_email	cash_receipt_type	cash_receipt_no_type	cash_receipt_no	receipt_status	receipt_status_date	receipt_status_time	receipt_status_mem_uid	mod_date	mod_time	mod_mem_uid	ret_status	return_deli_duty	ret_date	ret_time	ret_mem_uid	pay_result_set	vbankBankCode	vbankBankName	vbankNum	vbankExpDate	set_order_result	pg_type	pg_tid	refund_memo	make_price	hope_opt_price	hope_deli_date	hope_deli_time	deli_mem_name	deli_mem_mobile	sell_customer_uid	tot_sell_price	tot_opt_price	tot_ord_price	tot_js_price	sel_date	sel_time	sel_mem_uid	version_no	mod_addr_flag	mod_hope_flag
}
