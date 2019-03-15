package com.ecjtu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ecjtu.po.Department;
import java.util.List;
import com.ecjtu.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService DepartmentService;
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Department> departments = DepartmentService.selectAll();
		model.addAttribute("departments", departments);
		return "department";
	}
}