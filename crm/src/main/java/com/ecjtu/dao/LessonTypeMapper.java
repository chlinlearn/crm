package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.LessonType;

public interface LessonTypeMapper {
	List<LessonType> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(LessonType record);

    int insertSelective(LessonType record);

    LessonType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LessonType record);

    int updateByPrimaryKey(LessonType record);
}