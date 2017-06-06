

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techm.dao.JobDetails;
import com.techm.dao.JobDetailsImpl;

public class SpocDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SpocDeleteServlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String jcode = request.getParameter("jcode");
		int jcode1 = Integer.parseInt(jcode);
		
		JobDetails deletejob1 = new JobDetailsImpl();
		boolean flag = deletejob1.deleteJob(jcode1);
		if (flag == true) {
			out.println("job deleted");
		} else {
			out.println("job cannot be deleted");
		}
	}

	

}
