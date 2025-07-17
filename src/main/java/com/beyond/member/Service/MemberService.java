package com.beyond.member.Service;

import com.beyond.member.Dto.MemberCreateDto;
import com.beyond.member.Dto.MemberDetailDto;
import com.beyond.member.Dto.MemberListDto;
import com.beyond.member.Repository.MemberJpaRepository;
import com.beyond.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberJpaRepository memberJpaRepository;

    public void save(MemberCreateDto memberCreateDto) {
        Member member = memberCreateDto.memberToEntity();
        this.memberJpaRepository.save(member);
    }

//    @Transactional(readOnly = true)
//    public List<MemberListDto> findAll() {
//
//    }
//
//    @Transactional(readOnly = true)
//    public MemberDetailDto findById(Long id) {
//
//    }


}
