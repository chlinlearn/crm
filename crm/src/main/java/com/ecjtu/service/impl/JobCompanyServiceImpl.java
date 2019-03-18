package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.JobCompanyMapper;
import com.ecjtu.po.JobCompany;
import com.ecjtu.service.JobCompanyService;

@Service
@Transactional
public class JobCompanyServiceImpl implements JobCompanyService{

	@Autowired
	private JobCompanyMapper jobCompanyMapper;
	
	public List<JobCompany> selectAll(){
		return this.jobCompanyMapper.selectAll();
	}
}
