<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="UTF-8" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css" />
 

<script type="text/javascript" src="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/js/bootstrap.min.js"></script>

<link href="//netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.css" rel="stylesheet" type="text/css"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Add team page</title>
</head>
<body>
<h1>Add team page</h1>
<p>Here you can add a new team.</p>
<form:form method="POST" action="${pageContext.request.contextPath}/team/add.html" modelAttribute="team">
<!-- 
<table>
<tbody>
	<tr>
	
		<td>Name:</td>
		<td><form:input path="teamName" /></td>
	 -->
   <div class="input-group margin-bottom-sm">
  	<span class="input-group-addon"></span>
  	<form:input class="form-control" type="text" placeholder="team Name" path="teamName" />
  </div>
  
   <div class="input-group margin-bottom-sm">
  	<span class="input-group-addon"></span>
  	<form:input class="form-control" type="text" placeholder="점수" path="rating" />
  </div>
	 
	<button type="submit" class="btn btn-primary" value="추가하기">팀 등록</button>
	<!--  
	</tr>
	<tr>
		<td>Rating:</td>
		<td><form:input path="rating" /></td>
	</tr>
	<tr>
		<td><input type="submit" value="Add" /></td>
		<td></td>
	</tr>
</tbody>
</table>
-->	
</form:form>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>