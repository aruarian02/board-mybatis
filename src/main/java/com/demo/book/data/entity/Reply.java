package com.demo.book.data.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reply {
    private Long rno;
    private String content;
    private String memberEmail;
    private Long boardBno;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
