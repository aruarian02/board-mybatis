package com.demo.book.mapper;

import com.demo.book.data.entity.Reply;
import com.demo.book.data.vo.ReplyVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
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

            ReplyVO replyVO = ReplyVO.builder()
                    .content("Test Content..." + i)
                    .boardBno(randBoardBno)
                    .memberEmail(randMemberEmail)
                    .build();

            replyMapper.insertReply(replyVO);
        });
    }

    @Test
    public void deleteByRno() {
        replyMapper.deleteByRno(100L);
    }

    @Test
    public void getReplyList() {
        Long bno = 20L;
        List<ReplyVO> replyList = replyMapper.getList(bno);
        replyList.forEach(System.out::println);
    }

    @Test
    public void getReply() {
        Long rno = 42L;
        Optional<ReplyVO> optReply = replyMapper.getReply(rno);

        if (optReply.isPresent()) {
            ReplyVO replyVO = optReply.get();

            System.out.println(replyVO);
        }
    }

    @Test
    public void updateReply() {
        Long rno = 42L;
        Optional<ReplyVO> optReply = replyMapper.getReply(rno);

        if (optReply.isPresent()) {
            ReplyVO replyVO = optReply.get();
            replyVO.setContent("Update Reply!!!");

            replyMapper.update(replyVO);
        }

    }
}