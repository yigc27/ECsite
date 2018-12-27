package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BasketDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	private List<BasketDTO> basketDTOList;
	private String pay;

	public String execute() throws SQLException{
		BasketDAO basketDAO = new BasketDAO();
		basketDTOList = basketDAO.getBasketDTOList(session.get("login_user_id").toString());
		for(BasketDTO dto:basketDTOList){
			buyItemCompleteDAO.buyItemInfo(dto.getId(), dto.getLogin_user_id(),dto.getTotal_price(), dto.getCount(), pay,dto.getItem_name());
		}
		basketDAO.empty(session.get("login_user_id").toString());
		return SUCCESS;
	}

	public String getPay(){
		return pay;
	}

	public void setPay(String pay){
		this.pay = pay;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
