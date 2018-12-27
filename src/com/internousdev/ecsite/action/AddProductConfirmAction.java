package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String message;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private Map<String,Object> session;

	public String execute(){
		String result = ERROR;
		if(!(itemName.isEmpty()) && (itemPrice.matches("\\d+")) && (itemStock.matches("\\d+"))){
			if(buyItemDAO.existItem(itemName) == false){
				session.put("addItemName", itemName);
				session.put("addItemPrice", itemPrice);
				session.put("addItemStock", itemStock);
				result = SUCCESS;
			}else{
				message = "エラー:既に同名の商品が存在します";
			}
		}else{
			message = "エラー:商品名、価格、在庫数を確認してください";
		}
		return result;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getMessage(){
		return message;
	}
}
