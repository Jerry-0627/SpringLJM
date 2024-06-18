package com.jerry.LJM.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/student/list")
	public String getStudent() {
		System.out.println("리스트 가져오기.");

		return "student/list";
	}
}
