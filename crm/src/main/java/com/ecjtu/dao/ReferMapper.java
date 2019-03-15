package com.ecjtu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecjtu.po.Refer;

@Repository
public interface ReferMapper {
	 //查找所有数据
    List<Refer> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Refer record);

    int insertSelective(Refer record);

    Refer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Refer record);

    int updateByPrimaryKey(Refer record);
    
}