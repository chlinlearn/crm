package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.ConsultMapper;
import com.ecjtu.po.Consult;
import com.ecjtu.service.ConsultService;

@Service
@Transactional
public class ConsultServiceImpl implements ConsultService{
	@Autowired
	private ConsultMapper consultMapper;
	
	public List<Consult> selectAll(){
		return this.consultMapper.selectAll();
	}
}
