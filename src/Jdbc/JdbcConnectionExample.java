package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//register driver class
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");//create connection object
		Statement statementmt = conn.createStatement();//create statement, statement is responsible for executing queries
		//dropDatabase(statementmt);
		//createDatabase(statementmt);
		createTable(statementmt);
		insertIntoTeachers(statementmt);
		selectFromTeachers(statementmt);
		//dropDatabase(statementmt);
		
	}
	public static void createDatabase(Statement stmt) throws SQLException{
		String sql = "Create database teachers";
		int rs = stmt.executeUpdate(sql);
		System.out.println("Created "+ " " + rs + "database");
	}
	public static void createTable(Statement stmt) throws SQLException{
		String sql = "CREATE TABLE teacher"+ "( id INT NOT NULL,"+"name VARCHAR(45) NULL,"+"department VARCHAR(45) NULL)";
		int rs = stmt.executeUpdate(sql);
		System.out.println("Created "+ " " + rs + "table");
		
	}
	public static void insertIntoTeachers(Statement stmt) throws SQLException{
		String sql = "INSERT INTO teacher "+ "VALUES (1, 'Geena', 'Computer')";
		stmt.executeUpdate(sql);
		System.out.println("Inserted into teachers");
	}
	public static void selectFromTeachers(Statement stmt) throws SQLException{
		String sql = "select * from teacher";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "  +  rs.getString(3));
		}
	}
	public static void dropDatabase(Statement stmt) throws SQLException{
		String sql = "drop database teachers";
		stmt.executeUpdate(sql);
	}
}
