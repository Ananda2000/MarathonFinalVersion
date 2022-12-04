package com.My_marathon.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.My_marathon.Dao1.EmployeeDao;
import com.My_marathon.model.employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//employee emp1 = new employee();
	private EmployeeDao empdao = new EmployeeDao();
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/registration.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String mid_name = request.getParameter("mid_name");
	String Email_id = request.getParameter("emailid");
	String address = request.getParameter("address");
	String state = request.getParameter("state");
	String country = request.getParameter("country");
	String District = request.getParameter("District");
	String pincode = request.getParameter("pincode");
	String password = request.getParameter("password");
	String PhoneNumber = request.getParameter("PhoneNumber");
	
	
	employee emp = new employee();
	emp.setFirstname(firstname);

	System.out.println("The F name is ---"+firstname);
	emp.setLastname(lastname);
	System.out.println("The last name is ---"+lastname);
	emp.setMid_name(mid_name);
	emp.setEmail_id(Email_id);
	emp.setAddress(address);
	emp.setState(state);
	emp.setCountry(country);
	emp.setDistrict(District);
	emp.setPincode(pincode);
	emp.setPassword(password);
	emp.setPhoneNumber(PhoneNumber);

	try {
		empdao.registerEmployee(emp);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDetails.jsp");
	dispatcher.forward(request, response);

	}
}
