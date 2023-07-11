package com.demo.book.data.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private String email;
    private String password;
    private String name;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
