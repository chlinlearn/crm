package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ecjtu.dao.ReferMapper;
import com.ecjtu.po.Refer;
import com.ecjtu.service.ReferService;

@Service
@Transactional
public class ReferServiceImpl implements ReferService{
	@Autowired
	private ReferMapper referMapper;
	
	public List<Refer> selectAll(){
		return this.referMapper.selectAll();
	}

}
