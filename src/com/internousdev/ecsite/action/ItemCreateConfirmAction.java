package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String message;
	private Map<String,Object> session;
	public String execute(){
		String result = ERROR;
		if((itemName != null) && (itemPrice.matches("\\d+")) && (itemStock.matches("\\d+"))){
				session.put("itemName", itemName);
				session.put("itemPrice", itemPrice);
				session.put("itemStock", itemStock);
				result = SUCCESS;
		}else{
			message="エラー:商品名、価格、在庫数を確認してください";
		}
		return result;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
