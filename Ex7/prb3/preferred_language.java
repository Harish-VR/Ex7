import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class UserPreferenceServlet extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
 String name = request.getParameter("name");
 String email = request.getParameter("email");
 String language = request.getParameter("language");
 Cookie nameCookie = new Cookie("name", name);
 Cookie emailCookie = new Cookie("email", email);
 Cookie languageCookie = new Cookie("language", language);
 nameCookie.setMaxAge(24 * 60 * 60);
 emailCookie.setMaxAge(24 * 60 * 60);
 languageCookie.setMaxAge(24 * 60 * 60);
 response.addCookie(nameCookie);
 response.addCookie(emailCookie);
 response.addCookie(languageCookie);
 response.sendRedirect("GreetingServlet");
 }
}
