package com.niit.loginapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.loginapp.dao.UserDAO;
import com.niit.loginapp.dao.UserDAO1;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("calling doGet method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		System.out.println("calling doPost method");
		
		String userName=(String) request.getParameter("userName");
		String password=(String) request.getParameter("password");
		
		//create the instance of UserDAO
		
		UserDAO1 userDAO=new UserDAO1();
		
		//call Validation method
		//declare one RequestDispatcher
		
		RequestDispatcher dispatcher;
		try {
			if(userDAO.isValidUser(userName, password))
			{
				dispatcher=request.getRequestDispatcher("Home.jsp");
				dispatcher.forward(request,response);
				
			}
			else
			{
				dispatcher=request.getRequestDispatcher("Login.jsp");
				PrintWriter writer=response.getWriter();
				writer.println("invalid credentials.please try again...");
				dispatcher.include(request,response);
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
