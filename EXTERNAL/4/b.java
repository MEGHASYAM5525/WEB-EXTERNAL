import java.sql.*;
import java.util.*;

public class b {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.Oracledriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "5525megha");
        Scanner sc = new Scanner(System.in);

        String uname = sc.next();
        String passwd = sc.next();
        String phno = sc.next();
        String email = sc.next();

        PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?, ?, ?, ?)");
        ps.setString(1, uname);
        ps.setString(2, passwd);
        ps.setString(3, phno);
        ps.setString(4, email);

        int n = ps.executeUpdate();

        if(n >= 0) {
            System.out.println("SUCCESSFULLY INSERTED!");
        }
    }
}
