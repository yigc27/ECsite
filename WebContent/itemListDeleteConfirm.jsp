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
<title>削除確認</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>削除確認</p>
		</div>
		<div>
			<p>全商品を削除します。よろしいですか？</p>
			<table>
				<tr>
					<td>
						<s:form action="ItemListDeleteCompleteAction">
							<s:submit cssClass="submit" value="ＯＫ"/>
						</s:form>
					</td>
					<td>
						<s:form action="ItemListAction">
							<s:submit cssClass="submit" value="キャンセル"/>
						</s:form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>