package com.internousdev.ecsite.action;
import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{
	UserListDeleteCompleteDAO userListDeleteCompleteDAO = new UserListDeleteCompleteDAO();
	public String execute(){
		userListDeleteCompleteDAO.delete();
		return SUCCESS;
	}
}
