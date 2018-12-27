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
<title>在庫管理</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>在庫管理</p>
		</div>
		<div>
			<s:if test="message != null">
				<p><s:property value="message"/></p>
			</s:if>
			<s:iterator value="buyItemDTOList">
				<table>
					<tr>
						<td>
							<span>商品名</span>
						</td>
						<td>
							<span><s:property value="itemName"/></span>
						</td>
					</tr>
					<tr>
						<td>
							<span>在庫数</span>
						</td>
						<td>
							<span><s:property value="itemStock"/></span>
						</td>
					</tr>
					<s:form action="ReplenishAction">
						<tr>
							<td>
								<span>数量</span>
							</td>
							<td>
								<span><s:textfield name="rcount" size="3"/></span>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="hidden" name="itemName" value="<s:property value='itemName'/>"/>
								<input type="hidden" name="id" value="<s:property value='id'/>"/>
								<s:submit cssClass="submit" value="補充する"/>
							</td>
						</tr>
						<tr><td><br></td></tr>
					</s:form>
				</table>
			</s:iterator>
			<p><a href="<s:url action='ManagerAction'/>">戻る</a></p>
		</div>
	</div>
	<div id = "footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>