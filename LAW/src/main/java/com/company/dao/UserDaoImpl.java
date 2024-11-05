package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User isValidUser(String username, String password) {
		String query = "select * from users where name = ? and password = ?";
		try(Connection connection = DBUtil.getConnection();
				PreparedStatement pstm = connection.prepareStatement(query)){
			pstm.setString(1, username);
			pstm.setString(2, password);
			
			ResultSet resultSet = pstm.executeQuery();
			if(resultSet.next()) {
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String role = resultSet.getString("role");
				return new User(username, email, password, role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		String query = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";
		try(Connection connection = DBUtil.getConnection();
				PreparedStatement pstm = connection.prepareStatement(query)){
			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getEmail());
			pstm.setString(3, user.getPassword());
			pstm.setString(4, user.getRole());
			
			int rows = pstm.executeUpdate(); //shoot
			return rows>0;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
