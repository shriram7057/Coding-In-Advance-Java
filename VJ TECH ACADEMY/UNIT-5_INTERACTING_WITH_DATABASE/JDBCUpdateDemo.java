import java.sql.*;
class JDBCUpdateDemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connection established successfully");
		Statement stmt=con.createStatement();
		stmt.execute("update vjtechacademy set name='Dennis' where rollno=1010");
		System.out.println("Row updated successfully");
		con.close();
		System.out.println("Connection got closed");
	}
}