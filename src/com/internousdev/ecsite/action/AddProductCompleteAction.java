package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private String message;
	public String execute(){
		int i = buyItemDAO.addProduct(session.get("addItemName").toString(),session.get("addItemPrice").toString(),session.get("addItemStock").toString());
		if(i > 0){
			message = session.get("addItemName").toString() + "を追加しました。";
		}else{
			message = "商品の追加に失敗しました。";
		}
		return SUCCESS;
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
