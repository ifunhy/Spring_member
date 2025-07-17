package com.beyond.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDetailDto {
    private Long id;
    private String name;
    private String email;

//    public static memberFromEntity() {
//
//    }
}
