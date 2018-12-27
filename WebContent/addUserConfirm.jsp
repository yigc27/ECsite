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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<title>ユーザー追加確認</title>
<script type="text/javascript">
	function submitAction(url){
		$('form').attr('action',url);
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
			<p>ユーザー追加確認</p>
		</div>
		<table>
			<tr>
				<td>
					ログインID
				</td>
				<td>
					<s:property value="session.addLoginId"/>
				</td>
			</tr>
			<tr>
				<td>
					ログインPASS
				</td>
				<td>
					<s:property value="session.addLoginPass"/>
				</td>
			</tr>
			<tr>
				<td>
					ユーザー名
				</td>
				<td>
					<s:property value="session.addUserName"/>
				</td>
			</tr>
			<tr>
				<s:form>
					<td>
						<input type="button" class="submit" value="戻る" onclick="submitAction('AddUserAction')"/>
					</td>
					<td>
						<input type="button" class="submit" value="登録" onclick="submitAction('AddUserCompleteAction')"/>
					</td>
				</s:form>
			</tr>
		</table>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>