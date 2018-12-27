package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dto.BasketDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private List<BasketDTO> basketDTOList;

	public String execute(){
		String result = SUCCESS;

		BasketDAO dao = new BasketDAO();
		basketDTOList =  dao.getBasketDTOList(session.get("login_user_id").toString());
		return result;
	}
	public List<BasketDTO> getBasketDTOList(){
		return basketDTOList;
	}

	public void setBasketDTOList(List<BasketDTO> basketDTOList){
		this.basketDTOList = basketDTOList;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}