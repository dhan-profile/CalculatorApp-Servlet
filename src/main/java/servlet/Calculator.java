package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		int val1, val2;
		val1 = Integer.parseInt(request.getParameter("val1"));
		val2 = Integer.parseInt(request.getParameter("val2"));
		String str = request.getParameter("operation");
		
		if(str.equals("add")) {
			out.println("<h1>Addition is : "+ (val1+val2) +" </h1>");
		} else if(str.equals("sub")) {
			out.println("<h1>Sutraction is : "+ (val1-val2) +" </h1>");
		} else if(str.equals("mul")) {
			out.println("<h1>Multiplication is : "+ (val1*val2) +" </h1>");
		} else if(str.equals("div")) {
			out.println("<h1>Division is : "+ (val1/val2) +" </h1>");
		} else if(str.equals("mod")) {
			out.println("<h1>Modulus is : "+ (val1%val2) +" </h1>");
		}
		
	}

}
