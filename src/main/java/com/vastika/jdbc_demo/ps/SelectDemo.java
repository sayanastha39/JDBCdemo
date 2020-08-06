package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class SelectDemo {
	
	public static void main(String[] args) {
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.LIST_SQL);
				){
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					System.out.println("id is: "+ rs.getInt("id")); //based on index
					System.out.println("username is: "+ rs.getString(2));
					System.out.println("password is: "+ rs.getString("password"));
					System.out.println("===========");
				}
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
	}

	
}
