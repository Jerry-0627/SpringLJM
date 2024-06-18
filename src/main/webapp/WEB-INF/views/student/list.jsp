<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>student list</h1>
	<table  class="tbl">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>총합</th>
				<th>평균</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${requestScope.list}" var="student">
				<tr>
					<td><a href="./detail?num=${pageScope.student.num}">${pageScope.student.num}</a></td>
					<td> ${pageScope.student.name} </td>
					<td> ${pageScope.student.kor} </td>
					<td> ${pageScope.student.eng} </td>
					<td> ${pageScope.student.math} </td>
					<td> ${pageScope.student.toal} </td>
			<!-- HTml은 엘리먼트로 구성, 엘리먼트는 태그명, 컨텐츠(태그 사이에 있는거), 어트리뷰트로 구성되어 있다. -->
					<!-- pageScope.student.getnum 해도 되지만 getter의 이름을 쓰자. -->
					<td> ${pageScope.student.avg} </td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>