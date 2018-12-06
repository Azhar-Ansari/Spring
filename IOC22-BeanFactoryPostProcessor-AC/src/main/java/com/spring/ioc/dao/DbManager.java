package com.spring.ioc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.ioc.bean.DataSourceManager;

public class DbManager {
	
	private DataSourceManager dsSourceManager;
	
	public DbManager(DataSourceManager dsSourceManager) {
		this.dsSourceManager = dsSourceManager;
	}

	public String getName(int id) {
		String name = "";
		try {
			Connection connection = DriverManager.getConnection(dsSourceManager.getUrl(), dsSourceManager.getUsername(), dsSourceManager.getPassword());
			PreparedStatement preparedStatement = connection.prepareStatement("select * from test where id=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				name = resultSet.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
}
