package com.internousdev.ecsite.dto;

public class ManagerDTO {
	private String login_id;
	private String password;
	private boolean loginFlg;
	public String getLogin_id(){
		return login_id;
	}
	public void setLogin_id(String login_id){
		this.login_id = login_id;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public boolean getLoginFlg(){
		return this.loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
}
