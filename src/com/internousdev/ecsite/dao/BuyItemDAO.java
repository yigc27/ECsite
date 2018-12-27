package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = null;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "SELECT id,item_name,item_price,item_stock FROM item_info_transaction";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return buyItemDTO;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		String sql = "SELECT id,item_name,item_price,item_stock FROM item_info_transaction";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(resultSet.getInt("Id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getInt("item_stock"));
				buyItemDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return buyItemDTOList;
	}

	public BuyItemDTO getOneItemInfo(String id){
		String sql = "SELECT id,item_name,item_price,item_stock FROM item_info_transaction WHERE id = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return buyItemDTO;
	}

	public int deleteProduct(String id){
		String sql = "DELETE FROM item_info_transaction WHERE id = ?";
		int result = 0;
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public boolean existItem(String itemName){
		boolean result = false;
		String sql="SELECT * FROM item_info_transaction WHERE item_name = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,itemName);
			ResultSet resultSet = preparedStatement.executeQuery();
			result = resultSet.next();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

	public int addProduct(String itemName,String itemPrice,String itemStock){
		String sql="INSERT INTO item_info_transaction(item_name,item_price,item_stock) VALUES(?,?,?)";
		int result = 0;
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2, itemPrice);
			preparedStatement.setString(3, itemStock);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
