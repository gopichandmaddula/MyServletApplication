package trng.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by gopichand on 1/8/2017.
 */
public class MyServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private int hitCount;
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        hitCount=0;

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//response.getWriter().append("i am in do post");
        response.setContentType("text/html");
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "I am in do post and Total Number of Hits";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + hitCount + "</h2>\n" +
                "</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("I am in do get ")
                .append("<html> <body>")
                .append("<a href='/MyApplication/Login.html'> Click Me!! </a>")
                .append("</body></html>");

    }
}
