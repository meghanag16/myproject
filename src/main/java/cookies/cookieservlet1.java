package cookies;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class cookieservlet1 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");

        // Create a new cookie
        Cookie cookie = new Cookie("userName", userName);

        // Set the cookie's max age (in seconds)
        cookie.setMaxAge(60 * 60 * 24); // Cookie will expire in 24 hours

        // Add the cookie to the response
        response.addCookie(cookie);

        // Redirect to another page (index.html or another servlet)
        response.sendRedirect("index.html");
    }
}



