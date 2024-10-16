import java.sql.*;
class JDBCCreateDemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connection established successfully");
		Statement stmt=con.createStatement();
		stmt.execute("create table MSBTE(rollno number(5),name varchar(10),marks number(3))");
		System.out.println("Table created successfully");
		con.close();
		System.out.println("Connection got closed");
	}
}