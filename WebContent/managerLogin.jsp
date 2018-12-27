<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="discription" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>管理者ログイン</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>管理者ログイン</p>
		</div>
		<div>
			<s:form action="ManagerAction">
				<s:textfield name="login_id"/>
				<s:password name="login_password"/>
				<s:submit cssClass="submit" value="ログイン"/>
			</s:form>
		</div>
		<p><a href="<s:url action='GoHomeAction'/>">戻る</a></p>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>