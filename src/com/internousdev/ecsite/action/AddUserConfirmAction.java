package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;
public class AddUserConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private String loginId;
	private String loginPass;
	private String userName;
	private String message;
	private UserInfoDAO userInfoDAO = new UserInfoDAO();
	public String execute(){
		String result = ERROR;
		if(!(loginId.isEmpty() | loginPass.isEmpty() | userName.isEmpty())){
			if(userInfoDAO.existUser(loginId) == false){
				session.put("addLoginId", loginId);
				session.put("addLoginPass", loginPass);
				session.put("addUserName", userName);
				result = SUCCESS;
			}else{
				message = "エラー:そのログインIDは既に使用されています";
			}
		}else{
			message = "エラー:ログインID、ログインPASS、ユーザー名を確認してください";
		}
		return result;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public void setLoginPass(String loginPass){
		this.loginPass = loginPass;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public String getMessage(){
		return message;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
