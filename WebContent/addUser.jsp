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
<title>ユーザー追加</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ユーザー追加</p>
		</div>
		<div>
		<s:if test="message != null">
			<s:property value="message"/>
		</s:if>
			<s:form action="AddUserConfirmAction">
				<table>
					<tr>
						<td>
							ログインID
						</td>
						<td>
							<s:textfield name="loginId"/>
						</td>
					</tr>
					<tr>
						<td>
							ログインPASS
						</td>
						<td>
							<s:textfield name="loginPass"/>
						</td>
					</tr>
					<tr>
						<td>
							ユーザー名
						</td>
						<td>
							<s:textfield name="userName"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<s:submit value="登録" cssClass="submit"/>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
	<p><a href="<s:url action='UserManagementAction'/>">戻る</a></p>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>