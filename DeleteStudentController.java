package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

/**
 * Servlet implementation class DeleteStudentController
 */
@WebServlet("/DeleteStudentController")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */ StudentController controller = new StudentController();
	 
	        
	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		  
		   int id = Integer.parseInt(request.getParameter("id"));
		  int result = controller.removeStudent(id);
		  if(result==1)
		  {
			
  		  response.sendRedirect("LoginPage");
		  }
		  else
		  {
			  String msg="Delete Unsuccesfully";
	  			request.setAttribute("message", msg);
	  			RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
	  			rd.forward(request,response);
	  		  response.sendRedirect("LoginPage");
		  }	
	}
}
