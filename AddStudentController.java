package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.CustomException;
import model.Student;
@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {

private static final long serialVersionUID = 1L;
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		   StudentController controller = new StudentController();
		   int id= Integer.parseInt(request.getParameter("id"));
		   String name = request.getParameter("name");
		   String dateOfBirth=request.getParameter("dob");
	       Double d=Double.parseDouble(request.getParameter("contact"));
	       long contactNumber =d.longValue();
	       try {
	    	 SimpleDateFormat userformat = new SimpleDateFormat("dd-MM-yyyy");
	    	 userformat.setLenient(false);
			 java.util.Date f=userformat.parse(dateOfBirth);
			 java.sql.Date date = new java.sql.Date(f.getTime());
			 controller.addStudent(id,name,date,contactNumber);
		} catch (ParseException e) {
			invokeCustomException();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       //java.sql.Date date = new java.sql.Date(f.getTime());
	      // controller.addStudent(id,name,date,contactNumber);
	          
	     response.sendRedirect("LoginPage");
		   
	}
   public static void invokeCustomException() {
	    try {
	      throw new CustomException();
	    } catch (CustomException e) {
	      System.out.println(e);
	    }
	  }
}
