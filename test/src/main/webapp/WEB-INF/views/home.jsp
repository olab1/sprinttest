<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div style="margin-top:82px;text-align: center;">
<div id="navigation">
<ul>

<li><a href="#">首页</a>
<li><a href="#">新闻资讯</a>
<li><a href="#">公告</a>
<li><a href="#">客户支持</a>
</ul>
</div>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<img src="/resources/img_files/jinbanner_02_fcvz.jpg" />
<img src="<c:url value="/resources/img_files/jinbanner_02_fcvz.jpg" />"/>
<form action="loginAction" method="get">  

    username:<input type="text" name="username">  <br/>  
    password:<input type="text" name="password">  <br/>  
     <input type="hidden" name="hidden" value="登录" />
    <input type="submit" value="登录">  
    
</form>
</div>
</body>
</html>
