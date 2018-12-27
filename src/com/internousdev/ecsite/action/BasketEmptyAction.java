package com.internousdev.ecsite.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dto.BasketDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BasketEmptyAction extends ActionSupport implements SessionAware{
	public Map<String ,Object> session;
	private BasketDAO basketDAO = new BasketDAO();
	private List<BasketDTO> basketDTOList;

	public String execute(){
		basketDAO.empty(session.get("login_user_id").toString());
		basketDTOList = basketDAO.getBasketDTOList(session.get("login_user_id").toString());
		return SUCCESS;
	}

	public List<BasketDTO> getBasketDTOList(){
		return basketDTOList;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
