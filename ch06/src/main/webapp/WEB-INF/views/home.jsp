<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css" />
 

<script type="text/javascript" src="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/js/bootstrap.min.js"></script>

<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="Content-Type" content="text/html; UTF-8" />
    <title>Spring Hibernate Gradle Example</title>
</head>
<body>
<h1>Team 관리</h1>
<p>
    ${message}<br/>
    <a href="${pageContext.request.contextPath}/team/add.html"><button class="btn btn-danger"><i class="icon-plus"></i> 팀 추가하기</button></a><br/>
    <a href="${pageContext.request.contextPath}/team/list.html"><button class="btn btn-info"><i class="icon-th-list"></i> 팀 목록보기</button></a><br/>
</p>
</body>
</html>