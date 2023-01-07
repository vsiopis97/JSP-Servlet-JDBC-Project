package simpleWebApplication.UserServlet;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;*/

import org.hibernate.Session;

import simpleWebApplication.HibernateConfig.HibernateConfig;
import simpleWebApplication.User.*;


public class registerDao {

	
    //JDBC way
	/*private String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
	private String dbuname = "root";
	private String dbpass = "1234567Stergios!";
	private String driver = "com.mysql.cj.jdbc.Driver";
	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(jdbcUrl, dbuname, dbpass);
			
		}
		catch(SQLException e) {
			e.printStackTrace();;
		}
		return con;
	}*/
	
	
	//Hibernate way
	public void insert(User user, User2 user2) {
        user.setUser2(user2);
		org.hibernate.Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
}
