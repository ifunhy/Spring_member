package com.beyond.member.Controller;

import com.beyond.member.Dto.MemberCreateDto;
import com.beyond.member.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
