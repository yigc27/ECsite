<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content=""/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>商品追加確認画面</title>
<script type="text/javascript">
	function submitAction(url){
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>確認</p>
		</div>
		<div>
			<table>
				<tr>
					<td>
						商品名
					</td>
					<td>
						<s:property value="session.addItemName"/>
					</td>
				</tr>
				<tr>
					<td>
						価格
					</td>
					<td>
						<s:property value="session.addItemPrice"/>
					</td>
				</tr>
				<tr>
					<td>
						在庫数
					</td>
					<td>
						<s:property value="session.addItemStock"/>
					</td>
				</tr>
				<tr>
				<s:form>
					<td>
							<input type="button" class="submit" value="戻る" onclick="submitAction('AddProductAction')"/>
					</td>
					<td>
							<input type="button" class="submit" value="登録" onclick="submitAction('AddProductCompleteAction')"/>
					</td>
				</s:form>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>