package lk.harshana.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lk.harshana.controller.CustomerController;
import lk.harshana.model.Customer;

@WebServlet("/login")
public class LoginDao extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		List<Customer> list = CustomerController.getCustomerList(username);
		Iterator<Customer> iterator = list.iterator();
		
		if(list.isEmpty()) {
			out.println("<b>login error </b> : username and password dismatch");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
		else if(list.size() > 1) {
			out.println("<b>login error </b> : serveral usernames logical error");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
		else {
			while(iterator.hasNext()) {
				Customer customer = iterator.next();
				if(password.equals(customer.getPassword()) && username.equals(customer.getUsername())) {
					HttpSession session = req.getSession();
					session.setAttribute("user", customer.getName());
					resp.sendRedirect("http://localhost:8080/online-banking/welcome.jsp");
				}	
				else {
					out.println("<b>login error </b> : username and password dismatch");
					RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
					rd.include(req, resp);
				}
			}
		}
	}

	
}
