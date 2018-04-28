package hw3.hello.servlets;

import hw3.hello.wordladdercode.CreateWordladder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="wordladderServlet",value="/wordladder")
@EnableAutoConfiguration
public class WordladderServlet extends HttpServlet {
    /* This servlet is to get the data in the form(delivery from the form) */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in WordladderServlet"); /* For debug */

        String firstword = request.getParameter("firstword");
        String secondword = request.getParameter("secondword");
        System.out.println("firstword: "+firstword+" secondword:"+secondword); /* For debug */

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        CreateWordladder thewordladder = new CreateWordladder();
        String result = thewordladder.StringLadderGenerate(firstword,secondword);   /* Get the wordladder */
        System.out.println(result); /* For debug */

        out.write("<h1>");
        out.write(result);
        out.write("</h1>");
        out.write("<p><a href=\"/index\" th:href=\"@{/index}\">Back to home page</a></p>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
