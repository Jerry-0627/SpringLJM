package com.jerry.LJM.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	private File file;
	
	public StudentDAO() {
		this.file = new File("C:\\study\\student.txt");		
	}

	public void getList() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String info = br.readLine();
		String[] infos = null;
		List<StudentDTO> sDTOs = new ArrayList<StudentDTO>();
		
		while(info != null) {
			infos = info.split(",");
			if(info.length() < 5) break;
		}
	}

}
