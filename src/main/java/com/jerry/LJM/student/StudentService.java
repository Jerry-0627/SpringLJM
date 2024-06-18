package com.jerry.LJM.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<StudentDTO> getList() {
		System.out.println("Service에서 getList 실행");
		try {
			return studentDAO.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void getDetail() {
		System.out.println("디테일을 가져옵니다.");
	}
}
