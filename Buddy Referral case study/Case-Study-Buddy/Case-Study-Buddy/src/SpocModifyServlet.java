

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techm.beans.Job;
import com.techm.dao.JobDetails;
import com.techm.dao.JobDetailsImpl;

public class SpocModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SpocModifyServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String jcode = request.getParameter("jcode");
		int jcode1 = Integer.parseInt(jcode);
		String jskill = request.getParameter("skill");
		String yoe = request.getParameter("yoe");
		int yoe1 = Integer.parseInt(yoe);
		String jloc = request.getParameter("location");
		String sname = request.getParameter("sname");
		String smail = request.getParameter("smail");
		
		Job job1=new Job(jcode1, jskill, yoe1, jloc, sname, smail);
		JobDetails modifyjob1 = new JobDetailsImpl();
		boolean flag = modifyjob1.modifyJob(job1);
		if (flag == true) {
			out.println("job modified");
		} else {
			out.println("job cannot be modified");
		}

	}


}
