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
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style type="text/css">
	#left{
		display:inline-block;
		margin-right: 50px;
		width:300px;
		height:300px;
		border:1px solid black;
	}
	#right{
		display:inline-block;
		border:1px solid black;
		width:300px;
		height:300px;
	}


	h2 {
		position: relative;
		bottom:15px;
		background-color:white;
		width:100px;
		margin: 0 auto;
		font-weight:normal;
	}
</style>
<title>管理者画面</title>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>
		<div>
			<div id="left">
				<h2>商品</h2>
				<s:form action="ItemCreateAction" cssClass="form">
					<s:submit value="新規登録" cssClass="submit"/>
				</s:form>
				<s:form action="ItemListAction" cssClass="form">
					<s:submit value="一覧" cssClass="submit"/>
				</s:form>
			</div>
			<div id="right">
				<h2>ユーザー</h2>
				<s:form action="UserCreateAction" cssClass="form">
					<s:submit value="新規登録" cssClass="submit"/>
				</s:form>
				<s:form action="UserListAction" cssClass="form">
					<s:submit value="一覧" cssClass="submit"/>
				</s:form>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</head>
<body>

</body>
</html>