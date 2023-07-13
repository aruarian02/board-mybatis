package com.demo.book.data.vo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ReplyVO {
    private Long rno;
    private String content;
    private String memberEmail;
    private Long boardBno;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
