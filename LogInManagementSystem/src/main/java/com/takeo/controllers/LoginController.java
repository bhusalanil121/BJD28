package com.takeo.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.takeo.Dao.Impl.UserDaoImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String  userName = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		PrintWriter pr = response.getWriter();
		
		UserDaoImpl udi2 = new UserDaoImpl();
		
		boolean flag = udi2.verifyUserNameAndPassword(userName, pass);
		
		if(flag) {
			pr.print("Login Sucessfull");
		}else {
			pr.print("Login Failed");

		}
		

		
//		pr.print(userName + "   " + pass);
	}
		
	}


