package com.imobAchat.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.imobAchat.dao.UserDao;
import com.imobAchat.dao.UserDaoLocal;
import com.imobAchat.model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	/*@EJB 
	private UserDaoLocal userDao;
    */
	
	@Autowired
	private UserDao ud;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(){
    	SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext (this);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*List<User> users = ud.findAll();
		Iterator<User> ite = users.iterator();
		while(ite.hasNext()){
			response.getWriter().append(ite.next().toString() + "\n\n");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());*/
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
