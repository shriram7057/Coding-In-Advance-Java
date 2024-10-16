import java.sql.*;
class JDBCInsertDemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connection established successfully");
		Statement stmt=con.createStatement();
		stmt.execute("insert into vjtechacademy values(8080,'Mohan',90)");
		System.out.println("Row inserted successfully");
		con.close();
		System.out.println("Connection got closed");
	}
}