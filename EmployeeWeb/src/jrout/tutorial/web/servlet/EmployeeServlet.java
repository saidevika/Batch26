package jrout.tutorial.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.web.dao.IEmployeeDAO;
import jrout.tutorial.web.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.web.domain.Employee;
import jrout.tutorial.web.service.IEmployeeService;
import jrout.tutorial.web.service.impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empIdStr = request.getParameter("empId");
		int empId = Integer.parseInt(empIdStr);
//		IEmployeeDAO employeeDao = new EmployeeDAOImpl();
		IEmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.fetchEmployee(empId);
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Hello World</title>");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<h1>First Name "+employee.getFirstName()+" </h1>");
		out.print("<h1>LastName "+employee.getLastName()+" </h1>");

		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
