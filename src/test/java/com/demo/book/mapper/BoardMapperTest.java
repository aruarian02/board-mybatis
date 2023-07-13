package com.demo.book.mapper;

import com.demo.book.data.entity.Board;
import com.demo.book.data.util.Criteria;
import com.demo.book.data.vo.BoardVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardMapperTest {

    @Autowired
    BoardMapper boardMapper;

    @Test
    public void insertBoards() {
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            String randMemberEmail = "test" + ((int) (Math.random() * 100) + 1) + "@naver.com";
//
//            Board board = Board.builder()
//                    .title("Test title..." + i)
//                    .content("Test content..." + i)
//                    .memberEmail(randMemberEmail)
//                    .build();
//
//            boardMapper.insertBoard(board);
//        });
    }

    @Test
    public void getBoardList() {
        List<BoardVO> boardList = boardMapper.getBoardList();
        boardList.forEach(System.out::println);
    }

    @Test
    public void getBoardByBno() {
        BoardVO boardByBno = boardMapper.getBoardByBno(10L);
        System.out.println(boardByBno);
    }

    @Test
    public void getBoardListWithPaging() {
        Criteria criteria = new Criteria(1, 10);
        List<BoardVO> boardListWithPaging = boardMapper.getBoardListWithPaging(criteria);
        boardListWithPaging.forEach(System.out::println);
    }

    @Test
    public void updateBoard() {
        BoardVO boardByBno = boardMapper.getBoardByBno(100L);
        boardByBno.setTitle("Update title!");
        boardByBno.setContent("Update content!!!");

        boardMapper.updateBoard(boardByBno);
    }

    @Test
    public void removeBoard() {
        boardMapper.removeBoard(101L);
    }
}