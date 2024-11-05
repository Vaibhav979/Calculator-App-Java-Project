package MyPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		char symbol = str3.charAt(0);
		double result = 0;
		switch(symbol) {
		case '+':
			result = num1 + num2;
			break;
			
		case '*':
			result = num1*num2;
			break;
			
		case '/':
			result = num1/num2;
			break;
			
		case '-':
			result = num1-num2;
			break;	
		}
		response.sendRedirect("index.jsp?ans="+result);
//		response.sendRedirect("https://youtube.com/playlist?list=PLhvdldYcnZMku_viVb2tU7NuW5DZxwIfw&si=4JITivrHgK9YJDJo");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("MyServlet2");
//		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Do post is calling");
	}

}
