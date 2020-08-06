package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtil;
import com.vastika.jdbc_demo.util.QueryUtil;

public class UpdateDemo {

	public static void main(String[] args) {
		try (
				Connection con = DBUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.UPDATE_SQL);
				){
				ps.setString(1, "hari");
				ps.setString(2, "pass");
				ps.setInt(3, 4);
				ps.executeUpdate();
				System.out.println("Data updated!!");
			} catch (SQLException | ClassNotFoundException e) { 
				e.printStackTrace();
			}
	}

}
