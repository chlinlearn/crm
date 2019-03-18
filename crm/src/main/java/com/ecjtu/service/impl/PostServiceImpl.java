package com.ecjtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjtu.dao.PostMapper;
import com.ecjtu.po.Post;
import com.ecjtu.service.PostService;

@Service
@Transactional
public class PostServiceImpl implements PostService{
	@Autowired
	private PostMapper postMapper;
	
	@Override
	public List<Post> selectAll() {
		// TODO Auto-generated method stub
		return this.postMapper.selectAll();
	}
	
}
