package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BasketDAO;
import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class BasketAction extends ActionSupport implements SessionAware{
	private String count;
	private String message;
	private String id;
	private Map<String,Object> session;
	private BasketDAO basketDAO = new BasketDAO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList;
	public String execute(){
		BuyItemDTO buyItemDTO = buyItemDAO.getOneItemInfo(id);
		if((buyItemDTO.getItemStock() - basketDAO.getCount(id, session.get("login_user_id").toString()) - Integer.parseInt(count)) >= 0){
			Integer total_price = Integer.parseInt(count) * Integer.parseInt(buyItemDTO.getItemPrice());
			basketDAO.intoBasket(
					id,
					buyItemDTO.getItemName(),
					session.get("login_user_id").toString(),
					total_price.toString(),
					count);
				message = buyItemDTO.getItemName() + "を" + count + "個買い物かごに追加しました。";
		}else{
			message = "在庫がありません";
		}
		int totalCount = basketDAO.getTotalCount(session.get("login_user_id").toString());
		session.put("totalCount", totalCount);
		buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		return SUCCESS;
	}

	public String getCount(){
		return count;
	}

	public void setCount(String count){
		this.count = count;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
}
