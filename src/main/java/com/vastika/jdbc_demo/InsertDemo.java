package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtil;

public class InsertDemo {

	public static final String SQL= "insert into user_tbl( user_name ,password ) values ('sayana', 'pass'); ";
	
	public static void main(String[] args) {
		 
		try (
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			){
			st.executeUpdate(SQL);
			System.out.println("Data inserted!!");
		} catch (SQLException | ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
	}

}
