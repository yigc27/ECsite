package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.ItemStockDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReplenishAction extends ActionSupport{
	private String rcount;
	private String message;
	private String id;
	private String itemName;
	private List<BuyItemDTO> buyItemDTOList;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	public String execute(){
		if(rcount.matches("\\d+")){
			ItemStockDAO itemStockDAO = new ItemStockDAO();
			itemStockDAO.increaseStock(id, rcount);
			message = itemName + "を" + rcount + "個補充しました。";
		}else{
			message = "エラー:半角数字で入力してください";
		}
		buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		return SUCCESS;
	}
	public String getMessage(){
		return message;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setRcount(String rcount){
		this.rcount = rcount;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}
}
