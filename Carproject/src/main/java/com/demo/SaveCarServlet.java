package com.demo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class SaveCarDetails*/

@WebServlet("/SaveCarServlet")
public class SaveCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveCarServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		float n=Float.parseFloat(request.getParameter("txtnumber"));
		String s=request.getParameter("txtname");
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		Session sess =factory.openSession();
		
		Cars e1 = new Cars(n,s);
		sess.save(e1);
		Transaction transaction =sess.beginTransaction();
		transaction.commit();
		//System.out.println("Record added");	
		RequestDispatcher rd = request.getRequestDispatcher("Showcars.jsp");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
