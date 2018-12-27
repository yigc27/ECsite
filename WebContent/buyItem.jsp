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
<title>BuyItem画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style>
	.product{
		display: inline-block;
		width:30%;
		margin-right:auto;
	}
	#basket{
		background-color:lightblue;
		opacity:0.7;
		height:50px;
		line-height:50px;
		position:fixed;
		width:100%;
		bottom:0px;
		left:0px;
		margin:0px;
		font-size:20px;
		text-align:center;
	}
	#inbasket{
		background-color:white;
		opacity:1;
		width:200px;
		height:40px;
		line-height:40px;
		border: white 1px solid;
		border-radius:100px 100px 100px 100px;
		position:fixed;
		bottom:3px;
		left:70%;
		text-align:center;
		transition:all 500ms;
	}
	#inbasket:hover{
		background-color:#F0FAFF;
		border :lightblue 10px solid	;
	}
	#inbasket a{
		display:block;
		width:100%;
		height:100%;
		text-decoration:none;
		color:black;
	}
	.clear{
		clear:both;
	}
</style>
</head>
<body>
	<div id="basket">

	</div>
		<div id="inbasket">
			<a href="<s:url action='BuyItemAction'/>"><span>買い物かご</span>
			<s:property value="session.totalCount"/></a>
		</div>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
		<div>
			<s:if test="message !=null">
				<p><s:property value="message"/></p>
			</s:if>
			<s:iterator value="buyItemDTOList">
			<div class = product>
				<s:form action="BasketAction">
				<table>
					<tr>
						<td>
							<span>商品名</span>
						</td>
						<td>
							<s:property value="itemName"/><br>
						</td>
					</tr>
					<tr>
						<td>
							<span>値段</span>
						</td>
						<td>
							<s:property value="itemPrice"/><span>円</span>
						</td>
					</tr>
					<tr>
						<td>
							<span>在庫数</span>
						</td>
						<td>
							<s:property value="itemStock"/><span>個</span>
						</td>
					</tr>
					<tr>
						<td>
							<span>購入個数</span>
						</td>
						<td>
							<select name="count">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							<input type="hidden" name="id" value="<s:property value='id'/>"/>
							<s:submit class="submit" value="買い物かごに入れる"/>
						</td>
					</tr>
					</table>
					</s:form>
					</div>
					</s:iterator>
			</div>
			<div class="clear">
				<p>前画面に戻る場合は<a href='<s:url action = "GoHomeAction"/>'>こちら</a></p>
				<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
			</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>