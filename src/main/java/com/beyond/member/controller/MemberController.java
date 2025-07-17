package com.beyond.member.controller;

import com.beyond.member.dto.MemberCreateDto;
import com.beyond.member.dto.MemberListDto;
import com.beyond.member.service.MemberService;
import com.beyond.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequiredArgsConstructor    // Lombok의 어노테이션 중 하나로, final 키워드가 붙은 주입에만 생성자를 만들어줌
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;  // 서비스 주입 받기

    @PostMapping("/create")
    public ResponseEntity<String> save(@RequestBody MemberCreateDto memberCreateDto) {
        this.memberService.save(memberCreateDto);

        return (new ResponseEntity<>("회원가입 완료", HttpStatus.CREATED));
    }

    @GetMapping("/list")
    public List<MemberListDto> findAll() {
        List<MemberListDto> memberList = memberService.findAll();
        return (memberList);
    }
//    // 회원 목록 조회
//    @GetMapping("/list")
//    public ResponseEntity<CommonDTO> getUserList() {
//        List<UserDetailResDTO> userList = userService.getUserList();
//        return new ResponseEntity<>(new CommonDTO(
//                "유저 목록 조회 성공",
//                HttpStatus.OK.value(),
//                userList
//        ), HttpStatus.OK);
//    }
}
