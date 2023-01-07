package simpleWebApplication.UserServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simpleWebApplication.User.User;
import simpleWebApplication.User.User2;


@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public register() {

    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	        response.sendRedirect("registerNewUser.jsp");
    	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("Name");
		String surname=request.getParameter("Surname");
		String gender=request.getParameter("Gender");
		String birthdate=request.getParameter("Birthdate");
		String waddress=request.getParameter("Waddress");
		String haddress=request.getParameter("Haddress");
		User user = new User(uname,surname,gender,birthdate);
		User2 user2 = new User2(waddress,haddress);
		registerDao rDao = new registerDao();
	    rDao.insert(user,user2);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("registerNewUser.jsp");
        dispatcher.forward(request, response);
	}

}
