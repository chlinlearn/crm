package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Post;

public interface PostMapper {
	List<Post> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}