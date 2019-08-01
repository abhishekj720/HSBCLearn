package com.hsbc.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuizServlet
 */
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ans1=request.getParameter("ques1");
		String ans2=request.getParameter("ques2");
		String ans3=request.getParameter("ques3");
		String ans4=request.getParameter("ques4");
		String res="fail";
		int score=0;
		if(ans1.equals("4"))++score;
		if(ans2.equals("1"))++score;
		if(ans3.equals("4"))++score;
		if(ans4.equals("8"))++score;
		
		if(score>=3)
			res="pass";
		request.setAttribute("result", res);
		request.setAttribute("score", score);
		
		RequestDispatcher rd=request.getRequestDispatcher("QuizResult.jsp");
		rd.forward(request, response);
	}

}
