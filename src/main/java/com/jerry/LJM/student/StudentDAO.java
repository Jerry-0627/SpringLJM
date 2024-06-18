package com.jerry.LJM.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	public void getList() throws Exception {
		System.out.println("DAO 리스트");
		File file = new File("C:\\study", "student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String sb;
		while ((sb = br.readLine()) != null) {
			StringTokenizer stk = new StringTokenizer(sb, "-");
			while (true) {

			}
		}

	}
}
