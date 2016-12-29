package org.feng.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>");
		out.println("Welcome Page");
		out.println("</title><head>");
		out.println("<body>");
		out.println("欢迎欢迎，热烈欢迎");
		for(int i=0;i<10;i++) {
			out.println("<h1>"+i+"</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
