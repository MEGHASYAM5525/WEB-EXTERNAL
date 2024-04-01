import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "5525megha");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String uname = sc.next();

        CallableStatement cs = con.prepareCall("{call get_phno(?, ?)}");
        cs.setString(1, uname);
        cs.registerOutParameter(2, java.sql.Types.VARCHAR);

        cs.execute();

        String phno = cs.getString(2);

        if (phno != null) {
            System.out.println("Mobile number: " + phno);
        } else {
            System.out.println("User not found or mobile number not available");
        }
    }
}
