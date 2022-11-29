package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.Repo.StudentRepo;
import com.web.model.Student1;

import ch.qos.logback.core.model.Model;

@Controller
public class StudentController {
	@Autowired
	private StudentRepo stdRepo;
	@RequestMapping("/")
	public String home() 
	{
		return "StudentRegistor";
	}
	@RequestMapping("/StudentSave")
	public String StudentSave(@RequestParam Integer sid,@RequestParam String name,
			@RequestParam String marks,@RequestParam String subjects,@RequestParam String semester,Student1 std,Model M) {
	Student1 s1 =stdRepo.save(std);
	return "success";
	}
	
}