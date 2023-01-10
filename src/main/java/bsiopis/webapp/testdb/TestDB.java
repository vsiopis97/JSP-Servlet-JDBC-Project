package bsiopis.webapp.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "root";
		String pass = "1234567Stergios!";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + jdbcUrl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Connection successful");
			myConn.close();
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
