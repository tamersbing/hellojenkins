package org.baboo;

// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorldServlet extends HttpServlet {
 
  private String message;
  // private String password="mypassword";

  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello GE Healthcare, from servlet in Tomcat after autocompile and git update to github ... time for a demo for CP";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
  }
 // some comment 
  public void destroy()
  {
      // do nothing.
  }
}
