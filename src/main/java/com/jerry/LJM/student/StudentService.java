package com.jerry.LJM.student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public void getList() {
		System.out.println("리스트를 가져옵니다.");
	}

	public void getDetail() {
		System.out.println("디테일을 가져옵니다.");
	}
}
