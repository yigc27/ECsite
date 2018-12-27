<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>買い物かご</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
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
			<p>お買い物かご</p>
		</div>
		<div>
		<s:if test="basketDTOList == null || basketDTOList.size() > 0">
		<s:iterator value="basketDTOList">
			<table>
					<tr>
						<td>商品名</td>
						<td><s:property value="item_name"/></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="total_price"/></td>
					</tr>
					<tr>
						<td>購入個数</td>
						<td><s:property value="count"/></td>
					</tr>
					<tr>
						<td>
							<br>
						</td>
					</tr>
			</table>
		</s:iterator>
			<s:form>
					<tr>
						<td>
							<span>支払い方法</span>
						</td>
						<td>
							<input type="radio" name="pay" value="現金払い" checked="checked">現金払い
							<input type="radio" name="pay" value="クレジットカード">クレジットカード
						</td>
					</tr>
					<tr><td><br></td></tr>
					<tr>
						<td><input type="button" class="submit" value="戻る" onclick="submitAction('HomeAction')"/></td>
						<td><input type="button" class="submit" value="購入" onclick="submitAction('BuyItemConfirmAction')"/></td>
					</tr>
			</s:form>
			<p><a href="<s:url action='BasketEmptyAction'/>">買い物かごを空にする</a></p>
			</s:if>
			<s:if test="basketDTOList.size() <= 0">
				<p>買い物かごには何も入っていません。</p>
				<s:form>
					<p><input type="button" class="submit" value="戻る" onclick="submitAction('HomeAction')"/></p>
				</s:form>
			</s:if>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>