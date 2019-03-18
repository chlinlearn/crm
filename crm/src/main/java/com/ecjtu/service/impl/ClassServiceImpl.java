package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.ClassMapper;
import com.ecjtu.po.Class;
import com.ecjtu.service.ClassService;

@Service
@Transactional
public class ClassServiceImpl implements ClassService{
	@Autowired
	private ClassMapper classMapper;
	
	public List<Class> selectAll(){
		return this.classMapper.selectAll();
	}

}
