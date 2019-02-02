package nl.persoonlijk.hva;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/Servlet",  urlPatterns={ "/test.html" })


public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("voornaam");
        String password = request.getParameter("achternaam");

        System.out.println(username + " " +  password);


        PrintWriter out = response.getWriter();
        if (username.equals("Gianni") &&  password.equals("wachtwoord")) {
            response.sendRedirect("home.html");
        } else {
            response.sendRedirect("index.html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('deadbeef');");
            out.println("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
