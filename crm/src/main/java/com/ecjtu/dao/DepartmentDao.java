package com.ecjtu.dao;

import java.util.List; 
import com.ecjtu.po.Department;

public interface DepartmentDao { 
    List<Department> selectAll(); 
}