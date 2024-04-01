import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserDetailsServlet")
public class UserDetailsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gender = request.getParameter("gender");
        String hobby = request.getParameter("hobby");

        // Database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String dbUser = "your_username";
        String dbPassword = "your_password";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "5525megha");
            // Prepare SQL statement
            String sql = "INSERT INTO user_details (gender, hobby) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, gender);
            statement.setString(2, hobby);

            // Execute the SQL statement
            statement.executeUpdate();

            // Close connections
            statement.close();
            con.close();

            // Redirect to success page
            response.sendRedirect("success.html");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred while processing your request.");
        }
    }
}
 {
    
}
