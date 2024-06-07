package com.zazaero.service;

import com.zazaero.data.dto.member.PostMemberDTO;
import com.zazaero.data.entity.member.MemberEntity;
import com.zazaero.data.mapper.MemberMapper.MasterRegisterMapper;
import com.zazaero.data.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository; // 먼저 jpa, mysql dependency 추가
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final MasterRegisterMapper masterRegisterMapper;

    public MemberEntity save(PostMemberDTO dto) {
        dto.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));
        return memberRepository.save(masterRegisterMapper.toEntity(dto));
    }

    public MemberEntity findByMemId(Long userId) {
        return memberRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
    }

    public List<MemberEntity> findMemverType(String memType) {
        return memberRepository.findByMemType(memType);
    }

    public MemberEntity findById(Long memUid) {
        return memberRepository.findById(memUid).orElseThrow(() -> new RuntimeException("Entity not found"));
    }

//    @Transactional
//    public List<Member> changepw() throws ParseException {
//        List<Member> memberInfos = memberRepository.findAll();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        SimpleDateFormat fomatter = new SimpleDateFormat("yyyy-MM-dd");
//
//        for (Member memberInfo : memberInfos) {
//            if (memberInfo.getFind_certi_dt() == null) {
//                memberInfo.setFind_certi_dt(LocalDateTime.of(0, 1, 1, 0, 0));
//            }
//
//            if (memberInfo.getMod_date() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setMod_date(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (memberInfo.getProvision_agree_date() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setProvision_agree_date(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (memberInfo.getPush_id_dt() == null) {
////                memberInfo.setPush_key_datetime(LocalDateTime.of(0, 0, 0, 0, 0));
//                memberInfo.setPush_key_datetime(LocalDateTime.parse("0000-00-00 00:00:00"));
//            }

//                if (Objects.equals(memberInfo.getPush_key_datetime(), LocalDateTime.of(1, 1, 1, 0, 0,0))) {
//                    memberInfo.setPush_key_datetime(null);
//                };

//            if (Objects.equals(memberInfo.getPush_id_dt(), LocalDateTime.of(1, 1, 1, 0, 0,0))) {
//                    memberInfo.setPush_id_dt(null);
//                };
//
//                if (Objects.equals(memberInfo.getFind_certi_dt(), LocalDateTime.of(1, 1, 1, 0, 0,0))) {
//                    memberInfo.setFind_certi_dt(null);
//                };
//
//            if (Objects.equals(memberInfo.getMem_out_date(), new SimpleDateFormat("yyyy-MM-dd").parse("0001-01-01"))) {
//                memberInfo.setMem_out_date(null);
//            };
//
//
//            if (memberInfo.getPush_key_datetime().equals(null)) {
//                memberInfo.setPush_key_datetime(LocalDateTime.of(0, 0, 0, 0, 0));
//            }
//
//            if (memberInfo.getPw_mod_date() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setPw_mod_date(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (memberInfo.getWork_sdate() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setWork_sdate(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (memberInfo.getWork_edate() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setWork_edate(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (memberInfo.getLast_mem_log_date() == null) {
//                try {
//                    Date newDate = fomatter.parse("0000-00-00");
//                    memberInfo.setLast_mem_log_date(newDate);
//                } catch (ParseException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            String currentPassword = memberInfo.getENC_mem_pw();
//            String encryptedPassword = bCryptPasswordEncoder.encode(currentPassword);
//            memberInfo.setENC_mem_pw(encryptedPassword);
//        }
//        memberRepository.saveAll(memberInfos);
//        return memberInfos;
//        return memberInfos;
//    }

}
