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
<title>商品追加</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品追加</p>
		</div>
		<div>
		<s:if test="message != null">
			<s:property value="message"/>
		</s:if>
			<s:form action="AddProductConfirmAction">
				<table>
					<tr>
						<td>
							商品名
						</td>
						<td>
							<s:textfield name="itemName"/>
						</td>
					</tr>
					<tr>
						<td>
							価格
						</td>
						<td>
							<s:textfield name="itemPrice"/>
						</td>
					</tr>
					<tr>
						<td>
							在庫数
						</td>
						<td>
							<s:textfield name="itemStock"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<s:submit cssClass="submit" value="登録"/>
						</td>
					</tr>
				</table>
			</s:form>
			<p><a href="<s:url action='ProductManagementAction'/>">戻る</a></p>
		</div>
	</div>
</body>
</html>