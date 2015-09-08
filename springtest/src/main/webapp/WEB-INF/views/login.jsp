<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>

<form action="loginAction" method="get">  

    username:<input type="text" name="username">  <br/>  
    password:<input type="text" name="password">  <br/>  
     <input type="hidden" name="hidden" value="登录" />
    <input type="submit" value="登录">  
    
</form>  



</body>
</html>