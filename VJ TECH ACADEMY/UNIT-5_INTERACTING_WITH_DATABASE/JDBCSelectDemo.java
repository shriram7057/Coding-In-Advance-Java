import java.sql.*;
class JDBCSelectDemo
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connection created successfully");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from vjtechacademy");
		System.out.println("Rollno\tName\tMarks");
		System.out.println("===========================");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		con.close();		
	}
}
/*
Driver loaded successfully
Connection created successfully
Rollno  Name    Marks
===========================
1010    vjtech  78
2020    Bajrne  88
3030    James   91
4040    Peter   99
5050    Lisa    71
6060    Rahul   67
*/