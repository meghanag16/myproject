package cookies;

	import java.io.*;
	import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	@SuppressWarnings("serial")
	public class cookieservlet2 extends HttpServlet {
	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Get the array of cookies from the request
	        Cookie[] cookies = request.getCookies();

	        String userName = null;

	        // Find the "userName" cookie
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                if ("userName".equals(cookie.getName())) {
	                    userName = cookie.getValue();
	                    break;
	                }
	            }
	        }

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head><title>Cookie Example</title></head>");
	        out.println("<body>");
	        
	        if (userName != null) {
	            out.println("<h2>Hello, " + userName + "!</h2>");
	        } else {
	            out.println("<h2>No user name found in the cookie.</h2>");
	        }
	        
	        out.println("</body>");
	        out.println("</html>");
	    }
	}



