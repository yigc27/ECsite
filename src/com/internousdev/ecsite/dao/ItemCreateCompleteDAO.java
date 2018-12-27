package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemCreateCompleteDAO {
	private Connection connection = null;
	public void createItem(String itemName,String itemPrice,String itemStock){
		String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock) VALUES(?,?,?)";
		try{
			DBConnector dbConnector = new DBConnector();
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2, itemPrice);
			preparedStatement.setString(3, itemStock);
			preparedStatement.executeUpdate();
		}catch(SQLException e){
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
