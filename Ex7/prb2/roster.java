import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/RosterServlet")
public class RosterServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 String team = request.getParameter("team");
 out.println("<html>");
 out.println("<head><title>" + team + " Roster</title></head>");
 out.println("<body>");
 out.println("<h1>" + team + " Roster</h1>");
 out.println("<p>Roster information goes here...</p>");
 out.println("</body>");
 out.println("</html>");
 }
}
