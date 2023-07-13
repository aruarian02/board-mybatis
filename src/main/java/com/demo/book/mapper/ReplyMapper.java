package com.demo.book.mapper;

import com.demo.book.data.vo.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ReplyMapper {
    void insertReply(ReplyVO replyVO);
    void deleteByRno(Long rno);
    List<ReplyVO> getList(Long bno);
    Optional<ReplyVO> getReply(Long rno);
    void update(ReplyVO replyVO);
}
