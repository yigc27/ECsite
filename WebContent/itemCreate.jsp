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
<meta name="discripiton" content=""/>
<meta name="keywords" content=""/>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>商品新規登録</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品新規登録</p>
		</div>
		<div>
			<s:if test="message != null">
				<s:property value="message"/>
			</s:if>
			<s:form action = "ItemCreateConfirmAction">
				<table>
					<tr>
						<td>
							<label>商品名</label>
						</td>
						<td>
							<s:textfield name="itemName"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>価格</label>
						</td>
						<td>
							<s:textfield name="itemPrice"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>在庫数</label>
						</td>
						<td>
							<s:textfield name="itemStock"/>
						</td>
					</tr>
					<tr>
						<td>
							<s:submit class="submit" value="登録"/>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>