package com.jerry.LJM.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudentDAO {

	public void getList() throws Exception {
		File file = new File("c:\\study\\student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str1 = br.readLine();
	}

}
