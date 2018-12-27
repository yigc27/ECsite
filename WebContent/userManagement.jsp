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
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>ユーザー管理</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ユーザー管理</p>
		</div>
		<div>
			<s:if test="message != null">
				<p><s:property value="message"/></p>
			</s:if>
			<p><a href="<s:url action='AddUserAction'/>">ユーザーを追加する</a></p>
			<table>
				<s:iterator value="userList">
					<s:form action="DeleteUserAction">
						<tr>
							<td>
								ログインID
							</td>
							<td>
								<s:property value="loginId"/>
							</td>
						</tr>
						<tr>
							<td>
								ログインPASS
							</td>
							<td>
								<s:property value="loginPass"/>
							</td>
						</tr>
						<tr>
							<td>
								ユーザー名
							</td>
							<td>
								<s:property value="userName"/>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="hidden" value="<s:property value='loginId'/>" name="loginId"/>
								<s:submit cssClass="submit" value="削除する"/>
							</td>
						</tr>
						<tr><td><br></td></tr>
					</s:form>
				</s:iterator>
			</table>
			<p><a href="<s:url action='ManagerAction'/>">戻る</a></p>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>