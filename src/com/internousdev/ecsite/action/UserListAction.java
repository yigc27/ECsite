package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.UserInfoDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{
	private UserInfoDAO userInfoDAO = new UserInfoDAO();
	private List<UserInfoDTO> userList = userInfoDAO.getUserList();
	public String execute(){
		return SUCCESS;
	}

	public List<UserInfoDTO> getUserList(){
		return userList;
	}
}
