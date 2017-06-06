import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SpocController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    String op;
    public SpocController() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		op=request.getParameter("op");
		 if(op.equals("adddetails")){
			RequestDispatcher rd = request.getRequestDispatcher("SpocAddDetails.html");
			rd.forward(request, response);
			
		}else if(op.equals("modifydetails")){
			RequestDispatcher rd = request.getRequestDispatcher("SpocModifyDetails.html");
			rd.forward(request, response);
		}else if(op.equals("deletedetails")){
			RequestDispatcher rd = request.getRequestDispatcher("SpocDeleteDetails.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("SpocLogin.html");
			rd.forward(request, response);
		}
		
		
	}

}