package com.zazaero.service;

import com.zazaero.data.dto.indCfg.GetComInfoDTO;
import com.zazaero.data.dto.indCfg.PutComInfoDTO;
import com.zazaero.data.entity.indCfg.ComInfoEntity;
import com.zazaero.data.repository.ComInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComInfoService {

    @Autowired
    public final ComInfoRepository comInfoRepository;

    public ComInfoService(ComInfoRepository comInfoRepository) {
        this.comInfoRepository = comInfoRepository;
    }

    @Transactional
    public GetComInfoDTO getComInfoById(Long id) {
        ComInfoEntity entity = comInfoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));
        GetComInfoDTO responseDTO = new GetComInfoDTO();

        responseDTO.setId(entity.getId());
        responseDTO.setReg_date(entity.getReg_date());
        responseDTO.setReg_time(entity.getReg_time());
        responseDTO.setReg_mem_uid(entity.getReg_mem_uid());
        responseDTO.setCom_name(entity.getCom_name());
        responseDTO.setCom_type(entity.getCom_type());
        responseDTO.setBiz_no(entity.getBiz_no());
        responseDTO.setCeo_name(entity.getCeo_name());
        responseDTO.setCom_phone(entity.getCom_phone());
        responseDTO.setCom_mobile(entity.getCom_mobile());
        responseDTO.setCom_fax(entity.getCom_fax());
        responseDTO.setCom_email(entity.getCom_email());
        responseDTO.setSale_refer_no(entity.getSale_refer_no());
        responseDTO.setInfo_mgr_name(entity.getInfo_mgr_name());
        responseDTO.setInfo_mgr_email(entity.getInfo_mgr_email());
        responseDTO.setBiz_type(entity.getBiz_type());
        responseDTO.setBiz_item(entity.getBiz_item());
        responseDTO.setTax_calc_email(entity.getTax_calc_email());
        responseDTO.setZonecode(entity.getZonecode());
        responseDTO.setPostcode(entity.getPostcode());
        responseDTO.setPost1(entity.getPost1());
        responseDTO.setPost2(entity.getPost2());
        responseDTO.setAddr1(entity.getAddr1());
        responseDTO.setAddr2(entity.getAddr2());
        responseDTO.setCt_mem_uid(entity.getCt_mem_uid());
        responseDTO.setCom_use_flag(entity.getCom_use_flag());
        responseDTO.setPrice_SMS(entity.getPrice_SMS());
        responseDTO.setPrice_LMS(entity.getPrice_LMS());
        responseDTO.setPrice_MMS(entity.getPrice_MMS());
        responseDTO.setCom_status(entity.getCom_status());
        responseDTO.setLast_work_counsel_log_uid(entity.getLast_work_counsel_log_uid());
        responseDTO.setCom_memo(entity.getCom_memo());
        responseDTO.setBiz_cate(entity.getBiz_cate());
        responseDTO.setBiz_code(entity.getBiz_code());
        responseDTO.setBiz_sdate(entity.getBiz_sdate());
        responseDTO.setCallcenter_open_time(entity.getCallcenter_open_time());
        responseDTO.setParcel_fee_type(entity.getParcel_fee_type());
        responseDTO.setDelivery_type(entity.getDelivery_type());

        return responseDTO;


    }

    @Transactional
    public ComInfoEntity updateComInfo(Long id, PutComInfoDTO putComInfoDTO) {
        ComInfoEntity entity = comInfoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        if (putComInfoDTO.getBiz_no() != null) {
            entity.setBiz_no(putComInfoDTO.getBiz_no());
        }
        if (putComInfoDTO.getCeo_name() != null) {
            entity.setCeo_name(putComInfoDTO.getCeo_name());
        }
        if (putComInfoDTO.getCom_phone() != null) {
            entity.setCom_phone(putComInfoDTO.getCom_phone());
        }
        if (putComInfoDTO.getCom_mobile() != null) {
            entity.setCom_mobile(putComInfoDTO.getCom_mobile());
        }
        if (putComInfoDTO.getCom_fax() != null) {
            entity.setCom_fax(putComInfoDTO.getCom_fax());
        }
        if (putComInfoDTO.getCom_email() != null) {
            entity.setCom_email(putComInfoDTO.getCom_email());
        }
        if (putComInfoDTO.getSale_refer_no() != null) {
            entity.setSale_refer_no(putComInfoDTO.getSale_refer_no());
        }
        if (putComInfoDTO.getInfo_mgr_name() != null) {
            entity.setInfo_mgr_name(putComInfoDTO.getInfo_mgr_name());
        }
        if (putComInfoDTO.getInfo_mgr_email() != null) {
            entity.setInfo_mgr_email(putComInfoDTO.getInfo_mgr_email());
        }
        if (putComInfoDTO.getBiz_type() != null) {
            entity.setBiz_type(putComInfoDTO.getBiz_type());
        }
        if (putComInfoDTO.getBiz_item() != null) {
            entity.setBiz_item(putComInfoDTO.getBiz_item());
        }
        if (putComInfoDTO.getTax_calc_email() != null) {
            entity.setTax_calc_email(putComInfoDTO.getTax_calc_email());
        }
        if (putComInfoDTO.getZonecode() != null) {
            entity.setZonecode(putComInfoDTO.getZonecode());
        }
        if (putComInfoDTO.getAddr1() != null) {
            entity.setAddr1(putComInfoDTO.getAddr1());
        }
        if (putComInfoDTO.getAddr2() != null) {
            entity.setAddr2(putComInfoDTO.getAddr2());
        }
        if (putComInfoDTO.getBiz_cate() != null) {
            entity.setBiz_cate(putComInfoDTO.getBiz_cate());
        }

        comInfoRepository.save(entity);
        return entity;
    }

}
