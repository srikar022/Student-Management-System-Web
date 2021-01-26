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
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    AdminController acController;
    
    public void init() {
    	acController=new AdminController();
    }
 
    StudentController controller = new StudentController();
    protected void  doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
    	List<Student> list = controller.viewStudent();
		 
		 request.setAttribute("StudentList", list);
		   
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
	        dispatcher.forward(request, response);
        
    }
    	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        int result = acController.authenticate(username, password);	
				 if (result==1) {
					 List<Student> list = controller.viewStudent();
					 request.setAttribute("StudentList", list);
				        RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
				        dispatcher.forward(request, response);
		            } else {
		            
		            	String msg="Invalid Credentials";
		    			request.setAttribute("message", msg);
		    			RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
		    			rd.forward(request,response);
		              
		            }
	        }
	}
