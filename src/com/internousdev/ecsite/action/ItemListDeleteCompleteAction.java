package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{
	private ItemListDeleteCompleteDAO  itemListDeleteCompleteDAO = new ItemListDeleteCompleteDAO();
	public String execute(){
		itemListDeleteCompleteDAO.delete();
		return SUCCESS;
	}
}
