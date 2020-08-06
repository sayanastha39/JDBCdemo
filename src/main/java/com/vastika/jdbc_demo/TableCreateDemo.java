package com.vastika.jdbc_demo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class TableCreateDemo {
	
	public static final String SQL= "create table user_tbl(id int not null auto_increment, user_name varchar(50),password varchar(50),primary key(id)); ";
	
	public static void main(String[] args) {
		 
		try (
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			){
			st.executeUpdate(SQL);
			System.out.println("Table created!!");
		} catch (SQLException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
	}

}
