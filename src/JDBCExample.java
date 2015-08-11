import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String sql = "select * from student where id = 2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery(sql);
		if(rs.next())
			System.out.println("ID: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Marks: "+rs.getInt(3)+" Grade: "+rs.getString(4));
		/*while(rs.next()){
			System.out.println("ID: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Marks: "+rs.getInt(3)+" Grade: "+rs.getString(4));
		}*/
	}
}
