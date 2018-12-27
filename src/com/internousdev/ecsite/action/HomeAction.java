package com.internousdev.ecsite.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	BuyItemDAO buyItemDAO = new BuyItemDAO();
	List<BuyItemDTO> buyItemDTOList;
	BasketDAO basketDAO = new BasketDAO();
	private int totalCount = 0;

	public String execute(){
		basketDAO.getTotalCount(String.valueOf(session.get("login_user_id")));
		session.put("totalCount", totalCount);
		String result="login";
		if(session.containsKey("login_user_id")){
			buyItemDTOList = buyItemDAO.getBuyItemDTOList();
			result = SUCCESS;
		}
		return result;
	}
		public void setSession(Map<String, Object> session){
			this.session = session;
		}

		public Map<String, Object> getSession(){
			return this.session;
		}

		public List<BuyItemDTO> getBuyItemDTOList(){
			return buyItemDTOList;
		}

		public int getTotalCount(){
			return totalCount;
		}
}

