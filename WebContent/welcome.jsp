<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th {
	height: 50px;
}
tbody{
text-align:center;
}


</style>
</head>
<body>
	<div style="margin-top: 40px; margin-right: 150px; margin-left: 150px;">
		<table>
			<thead>
				<tr style="background-color: #E0E0E1;">
					<th>ID</th>
					<th>NAME</th>
					<th>EMAIL</th>
					<th>CITY</th>
				</tr>
			</thead>


			<h3>All Records:</h3>
			<s:iterator value="list">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="city" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>