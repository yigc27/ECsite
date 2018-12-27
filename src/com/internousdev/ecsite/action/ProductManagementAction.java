package com.internousdev.ecsite.action;

import java.util.List;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductManagementAction extends ActionSupport{
	private List<BuyItemDTO> buyItemDTOList;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	public String execute(){
		buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		return SUCCESS;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
}
