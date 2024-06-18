package com.jerry.LJM.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {

	public List<StudentDTO> getList() throws Exception {
		System.out.println("DAO 리스트 실행 시작");
		ArrayList<StudentDTO> arDTO = new ArrayList<StudentDTO>();
		File file = new File("C:\\study", "student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String sb;

		while ((sb = br.readLine()) != null) {
			sb = sb.replace(",", "-");
			StringTokenizer stk = new StringTokenizer(sb, "-");

			while (stk.hasMoreTokens()) {
				StudentDTO studentdto = new StudentDTO();
				studentdto.setNum(Integer.parseInt(stk.nextToken().trim()));
				studentdto.setName(stk.nextToken().trim());
				studentdto.setKor(Integer.parseInt(stk.nextToken().trim()));
				studentdto.setEng(Integer.parseInt(stk.nextToken().trim()));
				studentdto.setMath(Integer.parseInt(stk.nextToken().trim()));
				studentdto.setToal(Integer.parseInt(stk.nextToken().trim()));
				studentdto.setAvg(Double.parseDouble(stk.nextToken().trim()));
				arDTO.add(studentdto);
			}
		}
		System.out.println("DAO 리스트 실행 완료");

		return arDTO;

	}
}
