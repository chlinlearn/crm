package com.ecjtu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecjtu.po.Job;
import com.ecjtu.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;
	
	@RequestMapping("/job")
	public String findAll(Model model) {
		List<Job> jobs = jobService.selectAll();
		model.addAttribute("jobs", jobs);
		return "job";
	}
}
