package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Student;

public interface StudentMapper {
	List<Student> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}