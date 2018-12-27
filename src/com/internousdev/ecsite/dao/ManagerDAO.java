package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ManagerDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ManagerDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ManagerDTO managerDTO = new ManagerDTO();

	public ManagerDTO managerLogin(String login_id,String password){
		String sql = "SELECT * FROM manager_login WHERE login_id = ? AND password = ?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, login_id);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				managerDTO.setLogin_id(resultSet.getString("login_id"));
				managerDTO.setPassword(resultSet.getString("password"));
				if(!(resultSet.getString("login_id").equals(null))){
					managerDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return managerDTO;
	}
}
