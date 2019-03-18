<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>

<link href="http://localhost:8092/crm/css/style.css" type="text/css" rel="stylesheet">
<link href="http://localhost:8092/crm/css/boot-crm.css" type="text/css" rel="stylesheet">
<script src="http://localhost:8092/crm/js/jquery-1.11.3.min.js">
</script>
<meta content="MSHTML 6.00.2600.0" name="GENERATOR">
<script>
// 判断是登录账号和密码是否为空
function check(){
    var usercode = $("#usercode").val();
    var password = $("#password").val();
    if(usercode=="" || password==""){
    	$("#message").text("账号或密码不能为空！");
        return false;
    }  
    return true;
}
</script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" background="./css/rightbg.jpg">
<div align="center">
<table border="0" width="440px" cellspacing="0" cellpadding="0" id="table1">
	<tbody><tr>
		<td height="193"></td>
	</tr>
	<tr>
   <td class="login_msg" width="400" align="center">
	 <!-- margin:0px auto; 控制当前标签居中 -->
	 <fieldset style="width: auto; margin: 0px auto;">
		  <legend>
		     <font style="font-size:25px" face="宋体">
		          欢迎使用学员CRM管理系统
		     </font>
		  </legend> 
		<font color="red">
			 
			 <span id="message"></span>
		</font>
		
		<form action="http://127.0.0.1:8080/CX-CRM/login.action" method="post" onsubmit="return check()">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
          账&nbsp;号：<input id="usercode" type="text" name="usercode">
          <br><br>
          密&nbsp;码：<input id="password" type="password" name="password">
          <br><br>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <center>
            <input type="submit" value="登录">&nbsp;&nbsp;
            <input type="reset" value="重置">
          </center>
		 </form>
	 </fieldset>
	</td>
	</tr>
</tbody></table>
</div>
</body>
</html>