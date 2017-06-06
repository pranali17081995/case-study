
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techm.beans.Job;
import com.techm.dao.JobDetails;
import com.techm.dao.JobDetailsImpl;

public class SpocServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SpocServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String jcode = request.getParameter("jobcode");
		int jcode1 = Integer.parseInt(jcode);
		String jskill = request.getParameter("skill");
		String yoe = request.getParameter("yearsofexp");
		int yoe1 = Integer.parseInt(yoe);
		String jloc = request.getParameter("location");
		String sname = request.getParameter("spocname");
		String smail = request.getParameter("spocmail");

		Job job1 = new Job(jcode1, jskill, yoe1, jloc, sname, smail);

		JobDetails addjob1 = new JobDetailsImpl();
		boolean flag = addjob1.addjob(job1);
		if (flag == true) {
			out.println("job added");
		} else {
			out.println("job cannot be added");
		}

	}

}
