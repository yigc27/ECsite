package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemStockDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public void decreaseStock(String id,String total_count){
		String sql = "UPDATE item_info_transaction SET item_stock = item_stock - ? WHERE id = ?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,total_count);
			preparedStatement.setString(2, id);
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	public void increaseStock(String id,String increase_count){
		String sql = "UPDATE item_info_transaction SET item_stock = item_stock + ? WHERE id = ?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,increase_count);
			preparedStatement.setString(2, id);
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
