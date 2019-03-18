package com.ecjtu.dao;

import java.util.List;

import com.ecjtu.po.Consult;

public interface ConsultMapper {
	List<Consult> selectAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}