package com.internousdev.ecsite.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private BasketDAO basketDAO = new BasketDAO();
	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
	private int totalCount = 0;

	public String execute(){
		String result = ERROR;
		session.put("totalCount",totalCount);
		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser", loginDTO);
		session.put("login_user_id", loginDTO.getLoginId());

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;
			buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		}
		totalCount = basketDAO.getTotalCount(String.valueOf(session.get("login_user_id")));
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public int getTotalCount(){
		return totalCount;
	}
}
