package com.demo.book.mapper;

import com.demo.book.data.entity.Board;
import com.demo.book.data.util.Criteria;
import com.demo.book.data.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insertBoard(Board board);
    List<BoardVO> getBoardList();
    BoardVO getBoardByBno(Long bno);
    List<BoardVO> getBoardListWithPaging(@Param("c") Criteria criteria);
}
