package com.takeo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.takeo.Dao.Impl.UserDaoImpl;
import com.takeo.model.User;

/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String useName = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		User addUser= new User(firstName, lastName, email, useName, pass);
		UserDaoImpl udi = new UserDaoImpl();
		PrintWriter pr = response.getWriter();
		int val = udi.register(addUser); 
		if(val == 0) {
			pr.print("Unsucessfull");
		}else {
			pr.print("Sucessfull");
		}
		
//		pr.print(firstName+ "  "+ lastName + "  "+ useName + "  "+ email + "  "+ pass );
	}

}
