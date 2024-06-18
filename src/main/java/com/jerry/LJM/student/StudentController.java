package com.jerry.LJM.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/student/list")
	public String getStudent(HttpServletRequest request) {
		System.out.println("리스트 가져오기.");
		List<StudentDTO> arDTO = studentService.getList();
		if (arDTO != null) {
			request.setAttribute("list", arDTO);
			return "student/list";
		} else {
			return "";
		}
	}

	@RequestMapping("/weather/detail")
	public void getDetail() {

	}

	@RequestMapping(value = "/weather/add", method = RequestMethod.GET)
	public void add() {

	}

//	@RequestMapping(value = "/weather/add", method = RequestMethod.POST)
//	public void add2() { }

}
