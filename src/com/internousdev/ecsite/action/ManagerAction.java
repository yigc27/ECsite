package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ManagerDAO;
import com.internousdev.ecsite.dto.ManagerDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport implements SessionAware{
	private String login_id;
	private String login_password;
	private Map<String, Object> session;
	public String execute() throws SQLException{
		String result = ERROR;
		ManagerDAO managerDAO = new ManagerDAO();
		ManagerDTO managerDTO = managerDAO.managerLogin(login_id, login_password);
		if(managerDTO.getLoginFlg()){
			session.put("manager_id", managerDTO.getLogin_id());
			session.put("managerDTO", managerDTO);
			result = SUCCESS;
		}else if(session.containsKey("manager_id")){
			result = SUCCESS;
		}
		return result;
	}

	public String getLogin_id(){
		return login_id;
	}

	public void setLogin_id(String login_id){
		this.login_id = login_id;
	}

	public String getLogin_password(){
		return login_password;
	}

	public void setLogin_password(String login_password){
		this.login_password = login_password;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
