package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.JobCompany;

public interface JobCompanyMapper {
	List<JobCompany> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(JobCompany record);

    int insertSelective(JobCompany record);

    JobCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobCompany record);

    int updateByPrimaryKey(JobCompany record);
}