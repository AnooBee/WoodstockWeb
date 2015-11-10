package com.anup.woodstock.web.servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Redirect
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String reqStr = request.getQueryString();
		System.out.println("reqSTR..."+ reqStr);
		System.out.println("Request URI: "+ request.getRequestURI());
		System.out.println("RequestPath..."+ request.getPathInfo());
		//Validate short URL
		//Go to DB to get longURL
		response.setStatus(HttpServletResponse.SC_FOUND); // SC_FOUND = 302
		response.sendRedirect("http://www.metlife.com");
		
		//TODO check why changing redirect location doesnt immediately change in browser - browser cache?
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//TODO should POST be made unusable? POST is for postprocessing form data, GET for pre-processing requests
	}

}
