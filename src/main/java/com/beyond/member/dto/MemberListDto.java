package com.beyond.member.dto;

import com.beyond.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberListDto {
    private Long id;
    private String name;
    private String email;

    public static MemberListDto listFromEntity(Member member) {
        return (new MemberListDto(member.getId(), member.getName(), member.getEmail()));
    }
}
