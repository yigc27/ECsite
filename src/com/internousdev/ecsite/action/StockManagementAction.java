package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
public class StockManagementAction extends ActionSupport{
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList;
	public String execute(){
		buyItemDTOList = buyItemDAO.getBuyItemDTOList();
		return SUCCESS;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return  buyItemDTOList;
	}
}
