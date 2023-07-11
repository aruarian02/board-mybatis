package com.demo.book.mapper;

import com.demo.book.data.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReplyMapper {
    void insertReply(Reply reply);
}
