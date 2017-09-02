package jrout.tutorial.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import jrout.tutorial.web.domain.Employee;
import jrout.tutorial.web.service.IEmployeeService;
import jrout.tutorial.web.service.impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet{
	private final static Logger logger = Logger.getLogger(EmployeeServlet.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		logger.info("Servlet Constructor...");
	}
	
	@Override
	public void init() throws ServletException {
		logger.info("Servlet Has been initialized...");
	}
	/*@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("Remote Host Requested URL "+ request.getRemoteHost() );
		String empIdStr = request.getParameter("empId");
		logger.info("Service method is invoked..."+ empIdStr);
		int empId = Integer.parseInt(empIdStr);
		// IEmployeeDAO employeeDao = new EmployeeDAOImpl();
		IEmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.fetchEmployee(empId);
		request.setAttribute("employee", employee);
		logger.debug("Employee Object has been set...");
		/*RequestDispatcher rdh = request.getRequestDispatcher("header.jsp");
		rdh.include(request, response);*/
		RequestDispatcher rdb = request.getRequestDispatcher("view.jsp");
		rdb.forward(request, response);
		
		/*PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Hello World</title>");
		out.print("</head>");
		out.print("<body>");

		out.print("<h1>First Name " + employee.getFirstName() + " </h1>");
		out.print("<h1>LastName " + employee.getLastName() + " </h1>");

		out.print("</body>");
		out.print("</html>");*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		logger.info("The Servlet is been destroyed...");
	}
}
