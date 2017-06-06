package com.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mysql.jdbc.Connection;


public class pool extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public pool() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InitialContext icontext;
		
		try {
			icontext= new InitialContext();
			DataSource ds = (DataSource)icontext.lookup("MyDS");
			java.sql.Connection con = ds.getConnection();
			System.out.println("got the conn from pool: "+con);
			PrintWriter pw=response.getWriter();
			pw.print("got the conn from pool: "+con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
