package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{
	private ItemListDAO itemListDAO = new ItemListDAO();
	private List<ItemInfoDTO> itemList = itemListDAO.getItemList();
	public String execute(){
		return SUCCESS;
	}

	public List<ItemInfoDTO> getItemList(){
		return itemList;
	}
}
