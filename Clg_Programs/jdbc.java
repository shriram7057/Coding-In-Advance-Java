import java.io.*;
import java.sql.*;
class JdbcExample {
    public static void main(String ar[]) throws Exception {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch, rno, n;
        String na;

        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the MySQL database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");

        do {
            System.out.println("DATABASE MANIPULATION USING JDBC");
            System.out.println("1. Insert\n2. Delete\n3. Update\n4. Display");
            System.out.println("Enter the choice:");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    System.out.println("Enter Id to Insert:");
                    rno = Integer.parseInt(br.readLine());
                    System.out.println("Enter name to Insert:");
                    na = br.readLine();

                    try {
                        pst = con.prepareStatement("INSERT INTO student_tab (id, name) VALUES (?, ?)");
                        pst.setInt(1, rno);
                        pst.setString(2, na);
                        n = pst.executeUpdate();
                        System.out.println(n + " row(s) Inserted!");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("Enter Id to Delete:");
                    rno = Integer.parseInt(br.readLine());

                    try {
                        pst = con.prepareStatement("DELETE FROM student_tab WHERE id = ?");
                        pst.setInt(1, rno);
                        n = pst.executeUpdate();
                        System.out.println(n + " row(s) Deleted!");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("Enter Id to Edit:");
                    rno = Integer.parseInt(br.readLine());
                    System.out.println("Enter new name to Edit:");
                    na = br.readLine();

                    try {
                        pst = con.prepareStatement("UPDATE student_tab SET name = ? WHERE id = ?");
                        pst.setString(1, na);
                        pst.setInt(2, rno);
                        n = pst.executeUpdate();
                        System.out.println(n + " row(s) Updated!");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        pst = con.prepareStatement("SELECT * FROM student_tab");
                        rs = pst.executeQuery();
                        System.out.println("ID\tNAME\n**********************");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (ch <= 4);

        // Close resources
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    }
}
