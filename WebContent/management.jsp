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
<meta name="keywords" content="no"/>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>管理画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>管理画面</p>
		</div>
		<div>
			<p><a href="<s:url action='StockManagementAction'/>">在庫管理</a></p>
			<p><a href="<s:url action='ProductManagementAction'/>">商品管理</a></p>
			<p><a href="<s:url action='UserManagementAction'/>">ユーザー管理</a></p>
			<p><a href="<s:url action='LogoutAction'/>">ログアウト</a></p>
		</div>
	</div>
	<div id = "footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>