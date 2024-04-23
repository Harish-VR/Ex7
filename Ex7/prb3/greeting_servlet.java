import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class GreetingServlet extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
 Cookie[] cookies = request.getCookies();
 String name = "";
 String email = "";
 String language = "";
 if (cookies != null) {
 for (Cookie cookie : cookies) {
 if (cookie.getName().equals("name")) {
 name = cookie.getValue();
 } else if (cookie.getName().equals("email")) {
 email = cookie.getValue();
 } else if (cookie.getName().equals("language")) {
 language = cookie.getValue();
 }
 }
 }
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html><head><title>Greeting Page</title></head><body>");
 out.println("<h2>Greeting</h2>");
 out.println("<p>Welcome, " + name + "!</p>");
 out.println("<p>Your email address is: " + email + "</p>");
 out.println("<p>Your preferred language is: " + language + "</p>");
 out.println("<p><a href='index.html'>Update Preferences</a></p>");
 out.println("</body></html>");
 }
}