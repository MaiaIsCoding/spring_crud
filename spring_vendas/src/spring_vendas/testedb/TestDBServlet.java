package spring_vendas.testedb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// variaveis da conexão
		String jdbcUrl = "jdbc:mysql://localhost:3306/api_rest?useSSL=false&serverTimezone=UTC";
		String user = "admindb";
		String pass = "admindb"; 
		String driver = "com.mysql.cj.jdbc.Driver";
		

		// testar conexão com o banco de dados
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: " + jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.println("Success!");
			
			myConn.close();
			
		}catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
