package com.hsbc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaxServlet
 */
public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /* for server side*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("txtname");
		double income = Double.parseDouble(request.getParameter("txtincome"));
		
		double  tax = 0;
		if(income > 1000000) {
			tax=(500000 * 0.1) + (income-100000)*0.15;
		}
		else if(income > 500000) {
			tax = (income - 500000)*0.1;
		}
		
		
		/*for client side*/
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 align= 'center'>Tax Calculation</h1>");
		out.println("<hr/>");
		out.println("<table cellpadding = '10' bgcolor='wheat' style = 'margin:0px auto'>");
		out.println("<tr><td>Name</td<td>" + name + "</td></tr>");
		out.println("<tr><td>Annual Income</td<td>" + income + "</td></tr>");
		out.println("<tr><td>Tax to be paid</td<td>" + tax + "</td></tr>");
		
		out.println("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}







