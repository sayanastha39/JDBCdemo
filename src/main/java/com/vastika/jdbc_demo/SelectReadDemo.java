package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class SelectReadDemo {
	
	public static final String SQL= "select * from user_tbl; ";
	
	public static void main(String[] args) {
		 
		try (
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			){
			ResultSet rs = st.executeQuery(SQL);
			//read until there is data
			while(rs.next()) {
				System.out.println("id is: "+ rs.getInt("id")); //based on index
				System.out.println("username is: "+ rs.getString(2));
				System.out.println("password is: "+ rs.getString("password"));
				System.out.println("===========");
			}
			
			System.out.println("Read data!!");
		} catch (SQLException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
	}

}
