import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class b {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "5525megha");

        Scanner sc = new Scanner(System.in);
        String rollno = sc.next();
        String new_phno = sc.next();

        PreparedStatement ps = con.prepareStatement("UPDATE lab_students SET phno=? WHERE rollno=?");
        ps.setString(1, new_phno);
        ps.setString(2, rollno);

        int n = ps.executeUpdate();

        if(n >= 0) {
            System.out.println("SUCCESSFULLY MODIFIED!");
        }
    }
}

