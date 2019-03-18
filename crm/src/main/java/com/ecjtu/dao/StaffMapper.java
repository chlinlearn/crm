package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Staff;

public interface StaffMapper {
	List<Staff> selectAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}