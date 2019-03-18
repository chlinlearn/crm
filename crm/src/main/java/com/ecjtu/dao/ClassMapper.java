package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Class;

public interface ClassMapper {
	List<Class> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}