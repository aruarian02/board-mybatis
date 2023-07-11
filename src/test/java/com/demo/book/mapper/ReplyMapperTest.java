package com.demo.book.mapper;

import com.demo.book.data.entity.Reply;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReplyMapperTest {

    @Autowired
    ReplyMapper replyMapper;

    @Test
    public void insertReply() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            long randBoardBno = (long) (Math.random() * 100) + 1;
            String randMemberEmail = "test" + ((int) (Math.random() * 100) + 1) + "@naver.com";

            Reply reply = Reply.builder()
                    .content("Test Content..." + i)
                    .boardBno(randBoardBno)
                    .memberEmail(randMemberEmail)
                    .build();

            replyMapper.insertReply(reply);
        });
    }

}