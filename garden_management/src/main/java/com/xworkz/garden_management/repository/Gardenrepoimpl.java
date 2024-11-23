package com.xworkz.garden_management.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.garden_management.dto.Gardendetailsdto;
import com.xworkz.garden_management.util.Gardendetailutil;

public class Gardenrepoimpl implements Gardenrepo {

	@Override
	public List<Gardendetailsdto> read() {
		List<Gardendetailsdto> list = new ArrayList<Gardendetailsdto>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(Gardendetailutil.JDBCURL,Gardendetailutil.USERNAME,Gardendetailutil.PASSWORD);
			String query = "select*from garden";
			Statement state = connect.createStatement();
			ResultSet res = state.executeQuery(query);
			while(res.next()) {
				Gardendetailsdto dto = new Gardendetailsdto();
				dto.setId(res.getInt(1));
				dto.setName(res.getString(2));
				dto.setSpace(res.getInt(3));
				dto.setPlants(res.getInt(4));
				dto.setCity(res.getString(5));
				list.add(dto);
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return list;
	}

	@Override
	public boolean save(Gardendetailsdto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(Gardendetailutil.JDBCURL,Gardendetailutil.USERNAME,Gardendetailutil.PASSWORD);
		    String query = "insert into garden(g_name,g_space,g_plants,g_city) values(?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1,dto.getName());
			statement.setInt(2, dto.getSpace());
			statement.setInt(3, dto.getPlants());
			statement.setString(4, dto.getCity());
			boolean result = statement.execute();
			if(!result) {
				System.out.println("Result is:"+result);
			}
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
		
	}

	@Override
	public boolean deleteById(int id) {
		try {
			Connection connect = DriverManager.getConnection(Gardendetailutil.JDBCURL,Gardendetailutil.USERNAME,Gardendetailutil.PASSWORD);
			String query = "delete from garden where id = ?";
			PreparedStatement statement = connect.prepareStatement(query);
			statement.setInt(1, id);
			if(!statement.execute()) {
				return true;
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public Gardendetailsdto searchById(int id) {
    try {
    	Connection conect = DriverManager.getConnection(Gardendetailutil.JDBCURL,Gardendetailutil.USERNAME,Gardendetailutil.PASSWORD);
          String query = "select * from garden where id = ?";
          PreparedStatement statement = conect.prepareStatement(query);
          statement.setInt(1, id);
          ResultSet result = statement.executeQuery();
          if(result.next()) {
        	  Gardendetailsdto dto = new Gardendetailsdto();
        	  dto.setId(result.getInt(1));
        	  dto.setName(result.getString(2));
        	  dto.setSpace(result.getInt(3));
        	  dto.setPlants(result.getInt(4));
        	  dto.setCity(result.getString(5));
        	  return dto;
          }
    }catch(SQLException e) {
    	System.out.println(e.getMessage());
    }
	return new Gardendetailsdto();
		
	}

	@Override
	public String updateById(int id, Gardendetailsdto dto) {
		try {
		Connection conect = DriverManager.getConnection(Gardendetailutil.JDBCURL,Gardendetailutil.USERNAME,Gardendetailutil.PASSWORD);
        String query = "update garden set g_name = ?,g_space=?,g_plants = ?,g_city = ? where id = ?";
        PreparedStatement statement = conect.prepareStatement(query);
        //statement.setInt(1, dto.getId());
        statement.setString(1,dto.getName());
        statement.setInt(2, dto.getSpace());
        statement.setInt(3, dto.getPlants());
        statement.setString(4, dto.getCity());
        statement.setInt(5, id);
        int set = statement.executeUpdate();
           return "Updated Successfully:"+set;
		}catch(SQLException e) {
			
		}
		return "Not updated";
	}
	}

