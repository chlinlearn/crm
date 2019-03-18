package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Job;

public interface JobMapper {
	List<Job> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}