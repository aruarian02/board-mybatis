package com.demo.book.data.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardVO {
    private Long bno;
    private String title;
    private String content;
    private String memberEmail;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCnt;
}
