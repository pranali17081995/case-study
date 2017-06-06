package com.techm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techm.beans.Login;
import com.techm.util.JdbcConnection;

public class LoginDaoImpl implements LoginDao {

	public String validate(Login login) {
		Connection con = null;
		con = JdbcConnection.getConnection();
		PreparedStatement pst = null;
		ResultSet rs =null;
		String role = null;
		
		String query = "select * from login_details where username=? and password=?";
		try {
			pst = con.prepareStatement(query);
			
			pst.setString(1,login.getUsername());
			pst.setString(2, login.getPassword());
			rs = pst.executeQuery();
			if(rs.next()== true){
				role=rs.getString(3);
				return role;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return role;
	}

}