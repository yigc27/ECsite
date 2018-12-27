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
<title>商品一覧</title>
</head>
<body>
	<div id="header">
		<div id="top">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品一覧</p>
		</div>
		<div>
			<table>
				<s:iterator value="itemList">
					<tr>
						<td>
							商品名
						</td>
						<td>
							<s:property value="itemName"/>
						</td>
					</tr>
					<tr>
						 <td>
						 	価格
						 </td>
						 <td>
						 	<s:property value="itemPrice"/>
						 </td>
					</tr>
					<tr>
						<td>
							在庫数
						</td>
						<td>
							<s:property value="itemStock"/>
						</td>
					</tr>
					<tr><td><br></td></tr>
				</s:iterator>
			</table>
			<s:form action="ItemListDeleteConfirmAction">
				<s:submit cssClass="submit" value="削除"/>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>