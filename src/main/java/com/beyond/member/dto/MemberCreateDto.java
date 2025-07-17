package com.beyond.member.dto;

import com.beyond.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberCreateDto {
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member memberToEntity() {
        return (new Member(this.name, this.email, this.password));
    }
}