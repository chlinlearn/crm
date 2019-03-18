package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.StudentMapper;
import com.ecjtu.po.Student;
import com.ecjtu.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return this.studentMapper.selectAll();
	}
	
}
