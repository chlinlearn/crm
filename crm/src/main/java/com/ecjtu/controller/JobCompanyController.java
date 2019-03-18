package com.ecjtu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecjtu.po.JobCompany;
import com.ecjtu.service.JobCompanyService;

@Controller
@RequestMapping("/jobcompany")
public class JobCompanyController {

	@Autowired
	private JobCompanyService jobCompanyService;
	@RequestMapping("/findAll.action")
	public String findAll(Model model) {
		List<JobCompany> jobCompanies = jobCompanyService.selectAll();
		model.addAttribute("jobCompanies", jobCompanies);
		return "jobcompany";
	}
}
