<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>등록 정보 확인하기</h1>
<table >
<c:forEach items="${memberList.list}" var="member" varStatus="s">
<tr>
<th>순서</th>
<th>State</th>
<th>Name</th>
<th>Age</th>
<th>Addr</th>
</tr>
<tr>
<td>${s.count}</td>
<td>${member.state}</td>
<td>${member.name}</td>
<td>${member.age}</td>
<td>${member.addr}</td>
</tr>

</c:forEach>


</table>
</body>
</html>