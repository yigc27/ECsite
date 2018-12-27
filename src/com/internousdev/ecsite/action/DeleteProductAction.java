package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class DeleteProductAction extends ActionSupport{
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList;
	private String id;
	private String message;
	public String execute(){
		int result = buyItemDAO.deleteProduct(id);
		if(result > 0){
			message = "商品を削除しました。";
		}else{
			message= "商品の削除に失敗しました。";
		}
		buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		return SUCCESS;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getMessage(){
		return message;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
}
