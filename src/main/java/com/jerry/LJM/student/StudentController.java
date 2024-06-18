package com.jerry.LJM.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping("/student/list")
	public String getStudent() {
		System.out.println("리스트 가져오기.");

		return "student/list";
	}

	@RequestMapping("/weather/detail")
	public void getDetail() {

	}

	@RequestMapping(value = "/weather/add", method = RequestMethod.GET)
	public void add() {

	}

	@RequestMapping(value = "/weather/add", method = RequestMethod.POST)
	public void add2() {

	}
}
