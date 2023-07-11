package com.demo.book.mapper;

import com.demo.book.data.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    void insertMember(@Param("member")Member member);
}
