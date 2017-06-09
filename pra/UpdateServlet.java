

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techm.util.JdbcConnection;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		Connection con=JdbcConnection.getConnection();
		HttpSession session=request.getSession(true); 
		String name2=(String) session.getAttribute("name1");
		String name=request.getParameter("status");
		if(name.equals("Selected"))
		{
			try {
				PreparedStatement pst=con.prepareStatement("update buddy set status ='"+name+"' where name='"+name2+"'");
				int rec=pst.executeUpdate();
				if(rec==1)
				{
					pw.print("Status updated successfully");
					RequestDispatcher rd=request.getRequestDispatcher("RewardServlet");
					rd.include(request, response);
				}
				else 
				{
					pw.print("Not updated");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (name.equals("Not Selected"))
		{
			try {
				PreparedStatement pst;
				pst = con.prepareStatement("update buddy set status ='"+name+"' where name='"+name2+"'");
				int rec=pst.executeUpdate();
				if(rec==1)
				{
					pw.print("Status updated successfully");
				}
				else
				{
					pw.print("Not updated");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		else 
		{
			

				try {
					PreparedStatement pst;
					pst = con.prepareStatement("update buddy set status ='"+name+"' where name='"+name2+"'");
					int rec=pst.executeUpdate();
					if(rec==1)
					{
						pw.print("Status updated successfully");
					}
					else
					{
						pw.print("Not updated");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
