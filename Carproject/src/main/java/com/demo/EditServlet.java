package com.demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.cfg.*;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		int id = Integer.parseInt(request.getParameter("txtid"));
		
		Cars c1 = session.get(Cars.class ,id);
		
		Float  n = Float.parseFloat(request.getParameter("txtnumber"));
		String name = request.getParameter("txtname");
		
		c1.setnumber(n);
		c1.setName(name);;
		
		session.save(c1);
		session.beginTransaction().commit();
		
		RequestDispatcher rd = request.getRequestDispatcher("showemployees.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


}
