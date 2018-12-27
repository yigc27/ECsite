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
<title>商品新規登録確認画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品新規登録確認画面</p>
		</div>
		<div>
			<table>
				<tr>
					<td>
						商品名
					</td>
					<td>
						<s:property value="session.itemName"/>
					</td>
				</tr>
				<tr>
					<td>
						価格
					</td>
					<td>
						<s:property value="session.itemPrice"/>
					</td>
				</tr>
				<tr>
					<td>
						在庫数
					</td>
					<td>
						<s:property value="session.itemStock"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<s:form action="ItemCreateCompleteAction">
							<s:submit class="submit" value="完了"/>
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>