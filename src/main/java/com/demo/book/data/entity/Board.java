package com.demo.book.data.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    private Long bno;
    private String title;
    private String content;
    private String memberEmail;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
