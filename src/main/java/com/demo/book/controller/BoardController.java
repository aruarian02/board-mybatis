package com.demo.book.controller;

import com.demo.book.data.util.Criteria;
import com.demo.book.data.vo.BoardVO;
import com.demo.book.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@Log4j2
public class BoardController {

    private final BoardMapper mapper;

    @Autowired
    public BoardController(BoardMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<BoardVO>> index(Criteria criteria) {
        log.info("index...");
        List<BoardVO> boardList = mapper.getBoardListWithPaging(criteria);

        return ResponseEntity.ok(boardList);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(BoardVO boardVO) {
        log.info("register...");

        mapper.insertBoard(boardVO);
        return ResponseEntity.ok().body("");
    }

    @GetMapping({"/get", "/modify"})
    public ResponseEntity<BoardVO> get(@RequestParam("bno") Long bno, Criteria criteria) {
        log.info("/get or modify");

        BoardVO boardByBno = mapper.getBoardByBno(bno);

        return ResponseEntity.ok(boardByBno);
    }

    @PostMapping("/modify")
    public ResponseEntity<?> modify(BoardVO boardVO, Criteria criteria) {
        log.info("modify...");

        mapper.updateBoard(boardVO);

        return ResponseEntity.ok().body("");
    }

    @PostMapping("/remove")
    public ResponseEntity<?> remove(@RequestParam("bno") Long bno, Criteria criteria) {
        log.info("remove...." + bno);

        mapper.removeBoard(bno);

        return ResponseEntity.ok().body("");
    }
}
