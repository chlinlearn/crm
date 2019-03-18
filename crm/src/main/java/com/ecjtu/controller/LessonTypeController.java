package com.ecjtu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecjtu.po.LessonType;
import com.ecjtu.service.LessonTypeService;

@Controller
public class LessonTypeController {

	@Autowired
	private LessonTypeService lessonTypeService;
	@RequestMapping("/lessontype")
	public String findAll(Model model) {
		List<LessonType> lessonTypes = lessonTypeService.selectAll();
		model.addAttribute("lessonTypes", lessonTypes);
		return "lessontype";
	}
}
