package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.LessonTypeMapper;
import com.ecjtu.po.LessonType;
import com.ecjtu.service.LessonTypeService;

@Service
@Transactional
public class LessonTypeServiceImpl implements LessonTypeService{

	@Autowired
	private LessonTypeMapper lessonTypeMapper;
	@Override
	public List<LessonType> selectAll() {
		// TODO Auto-generated method stub
		return this.lessonTypeMapper.selectAll();
	}

}
