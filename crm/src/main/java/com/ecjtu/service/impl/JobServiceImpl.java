package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.JobMapper;
import com.ecjtu.po.Job;
import com.ecjtu.service.JobService;

@Service
@Transactional
public class JobServiceImpl implements JobService{

	@Autowired
	private JobMapper jobMapper;

	@Override
	public List<Job> selectAll() {
		// TODO Auto-generated method stub
		return this.jobMapper.selectAll();
	}
	
	
}
