package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.StaffMapper;
import com.ecjtu.po.Staff;
import com.ecjtu.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffMapper staffMapper;

	@Override
	public List<Staff> selectAll() {
		// TODO Auto-generated method stub
		return this.staffMapper.selectAll();
	}
	
	
}
