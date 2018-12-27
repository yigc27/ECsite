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
<title>商品管理</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品管理</p>
		</div>
		<div>
			<s:if test="message != null">
				<p><s:property value="message"/></p>
			</s:if>
			<p><a href="<s:url action='AddProductAction'/>">商品を追加する</a></p>
		</div>
		<div>
			<table>
				<s:iterator value="buyItemDTOList">
					<s:form action="DeleteProductAction">
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
								在庫
							</td>
							<td>
								<s:property value="itemStock"/>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="hidden" value="<s:property value='id'/>" name="id"/>
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
</body>
</html>