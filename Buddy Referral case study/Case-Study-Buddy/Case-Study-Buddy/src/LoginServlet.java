

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techm.beans.Login;
import com.techm.dao.LoginDao;
import com.techm.dao.LoginDaoImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String m_username = request.getParameter("username");
		String m_password = request.getParameter("password");
		
		

		
		Login login=new Login(m_username, m_password);
		LoginDao loginDao = new LoginDaoImpl();
		String role = loginDao.validate(login);
		
		if(role.equals("SPOC")){
			RequestDispatcher rd = request.getRequestDispatcher("SpocPage.jsp");
			rd.forward(request, response);
			}
		else if(role.equals("Employee")) {
			RequestDispatcher rd = request.getRequestDispatcher("EmployeePage.jsp");
			rd.forward(request, response);
			
		}else{
			out.println("Login Unsuccessful");
		}
		}

}
