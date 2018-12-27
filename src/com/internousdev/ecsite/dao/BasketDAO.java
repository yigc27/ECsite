package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BasketDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BasketDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = null;
	private List<BasketDTO> busketDTOList = new ArrayList<BasketDTO>();

	public void intoBasket(String id,String item_name,String login_user_id,String total_price,String count){
		if(contain(id,login_user_id)){
			addItem(id,login_user_id,count);
		}else{
			newItem(id,item_name,login_user_id,total_price,count);
		}
	}

	public List<BasketDTO> getBasketDTOList(String login_user_id){
		String sql="SELECT * FROM shopping_basket WHERE login_user_id = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login_user_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				BasketDTO dto = new BasketDTO();
				dto.setId(resultSet.getString("id"));
				dto.setItem_name(resultSet.getString("item_name"));
				dto.setLogin_user_id(resultSet.getString("login_user_id"));
				dto.setTotal_price(resultSet.getString("total_price"));
				dto.setCount(resultSet.getString("count"));
				busketDTOList.add(dto);
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
		return busketDTOList;
	}

	public boolean contain(String id,String login_user_id){
		String sql = "SELECT * FROM shopping_basket WHERE id = ? AND login_user_id = ?";
		boolean result = false;
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, login_user_id);
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

	public void addItem(String id,String login_user_id,String count){
		String sql="UPDATE shopping_basket SET count = count + ? WHERE id = ? AND login_user_id = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, count);
			preparedStatement.setString(2, id);
			preparedStatement.setString(3, login_user_id);
			preparedStatement.execute();
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

	public void newItem(String id,String item_name,String login_user_id,String total_price,String count){
		String sql="INSERT INTO shopping_basket VALUES(?,?,?,?,?)";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, item_name);
			preparedStatement.setString(3, login_user_id);
			preparedStatement.setString(4, total_price);
			preparedStatement.setString(5, count);
			preparedStatement.execute();
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

	public void empty(String login_user_id){
		String sql = "DELETE FROM shopping_basket WHERE login_user_id = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login_user_id);
			preparedStatement.execute();
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

	public int getCount(String id,String login_user_id){
		String sql = "SELECT * FROM shopping_basket WHERE id = ? AND login_user_id = ?";
		int result = 0;
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, login_user_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				result = Integer.parseInt(resultSet.getString("count"));
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
		return result;
	}
	public int getTotalCount(String login_user_id){
		int result = 0;
		String sql = "SELECT SUM(count) FROM shopping_basket WHERE login_user_id = ?";
		try{
			connection = dbConnector.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login_user_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				result = resultSet.getInt("SUM(count)");
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
		return result;
	}
}
