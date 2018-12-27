package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemCompleteDAO {
	private DBConnector dbConnector = new DBConnector();
	private DateUtil dateUtil = new DateUtil();
	private Connection connection = null;
	private String sql = "INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,item_name,insert_date) VALUES(?,?,?,?,?,?,?)";

	public void buyItemInfo(String item_transaction_id, String user_master_id, String total_price,String total_count,String pay,String item_name){
		try{
			Connection connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, total_price);
			preparedStatement.setString(3, total_count);
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);
			preparedStatement.setString(6, item_name);
			preparedStatement.setString(7, dateUtil.getDate());
			preparedStatement.execute();

			ItemStockDAO itemStockDAO = new ItemStockDAO();
			itemStockDAO.decreaseStock(item_transaction_id, total_count);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(connection != null) connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
