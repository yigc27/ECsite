package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
	public String execute(){
		userCreateCompleteDAO.createUser(session.get("addLoginId").toString(), session.get("addLoginPass").toString(), session.get("addUserName").toString());
		return SUCCESS;
	}
	public Map<String,Object> getSessiion(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
