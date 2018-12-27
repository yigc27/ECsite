package com.internousdev.ecsite.action;
import java.util.List;

import com.internousdev.ecsite.dao.UserInfoDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport{
	private String loginId;
	private UserInfoDAO userInfoDAO = new UserInfoDAO();
	private String message;
	private List<UserInfoDTO> userList = userInfoDAO.getUserList();

	public String execute(){
		int result = userInfoDAO.deleteUser(loginId);
		if(result > 0){
			message = "ユーザーの削除に成功しました。";
		}else{
			message = "ユーザーの削除に失敗しました。";
		}
		return SUCCESS;
	}

	public String getMessage(){
		return message;
	}

	public List<UserInfoDTO> getUserList(){
		return userList;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
}
