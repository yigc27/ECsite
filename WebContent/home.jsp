<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style" content="text/css"/>
<meta http-equiv="Content-Scrypt-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="discription" content=""/>
<meta name="keywords" content=""/>
<title>Home画面</title>
<LINK REL="STYLESHEET" TYPE="TEXT/CSS" HREF="css/style.css">
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form cssClass="form" action="HomeAction">
				<s:submit cssClass="submit" value="商品購入"/>
			</s:form>
			<s:form cssClass="form" action="AdminAction">
				<s:submit cssClass="submit" value="管理者"/>
			</s:form>
			<s:if test="#session.login_user_id != null">
				<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
			</s:if>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
		<div align="right"><a href="<s:url action='ManagerLoginAction'/>">管理ページ</a></div>
	</div>
</body>
</html>