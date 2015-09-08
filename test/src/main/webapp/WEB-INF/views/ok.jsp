<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Username : ${username}
Password: ${password}

<h1>登陆成功请输入CarFactory！！！！</h1>
<form action="cfAction" method="get">  

    Car Factory:<input type="text" name="cfName">  <br/>  
     <input type="hidden" name="hidden" value="登录" />
    <input type="submit" value="登录">  
    
</form>
 </body>
</html>