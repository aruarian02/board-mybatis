package com.demo.book.mapper;

import com.demo.book.data.util.Criteria;
import com.demo.book.data.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insertBoard(BoardVO boardVO);
    void updateBoard(BoardVO boardVO);
    void removeBoard(@Param("bno") Long bno);
    List<BoardVO> getBoardList();
    BoardVO getBoardByBno(Long bno);
    List<BoardVO> getBoardListWithPaging(@Param("c") Criteria criteria);
}
