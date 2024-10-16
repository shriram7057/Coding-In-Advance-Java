import java.sql.*;
class JDBCConnectionDemo
{
    public static void main(String args[])throws Exception
    {
        Class.forName("Oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded Succesfully!");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        System.out.println("Connection established succesfully!");
        con.close();
        System.out.println("Connection Closed!");

    }
}