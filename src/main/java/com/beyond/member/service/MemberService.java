package com.beyond.member.service;

import com.beyond.member.dto.MemberCreateDto;
import com.beyond.member.dto.MemberListDto;
import com.beyond.member.repository.MemberJpaRepository;
import com.beyond.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
//        return (memberJpaRepository.findAll().stream().map(MemberListDto::listFromEntity).collect(Collectors.toList()));
//
//    }
    @Transactional(readOnly = true)
    public List<MemberListDto> findAll() {
        return memberJpaRepository.findAll()
                .stream()
                .map(MemberListDto::listFromEntity)
                .collect(Collectors.toList());
    }


//    @Transactional(readOnly = true)
//    public MemberDetailDto findById(Long id) {
//
//    }


}
