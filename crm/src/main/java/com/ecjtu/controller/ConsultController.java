package com.ecjtu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecjtu.dao.ConsultMapper;
import com.ecjtu.po.Consult;
import com.ecjtu.service.ConsultService;

@Controller
@RequestMapping("/consult")
public class ConsultController {

	@Autowired
	private ConsultService consultService;
	
	@RequestMapping("/findAll.action")
	public String findAll(Model model) {
		List<Consult> consults = consultService.selectAll();
		model.addAttribute("consults", consults);
		return "consult";
	}
}
