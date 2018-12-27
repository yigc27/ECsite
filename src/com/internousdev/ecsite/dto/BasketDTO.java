package com.internousdev.ecsite.dto;

public class BasketDTO {
	private String id;
	private String item_name;
	private String login_user_id;
	private String total_price;
	private String count;

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getItem_name(){
		return item_name;
	}

	public void setItem_name(String item_name){
		this.item_name = item_name;
	}

	public String getLogin_user_id(){
		return login_user_id;
	}

	public void setLogin_user_id(String login_user_id){
		this.login_user_id = login_user_id;
	}

	public String getTotal_price(){
		return total_price;
	}

	public void setTotal_price(String total_price){
		this.total_price = total_price;
	}

	public String getCount(){
		return count;
	}

	public void setCount(String count){
		this.count = count;
	}
}
