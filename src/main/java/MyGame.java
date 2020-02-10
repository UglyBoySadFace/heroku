import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.util.Random;
import java.util.Date;


@WebServlet("/MyGame")
public class MyGame extends HttpServlet {
public long start = System.currentTimeMillis();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	start = System.currentTimeMillis();
        request.getRequestDispatcher("/WEB-INF/game.jsp").forward(request, response);  
	
}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String win = request.getParameter("button");
        if (win != null) {
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		PrintWriter out = response.getWriter();
		out.println("<h1>VÝHRA ZA: "+ timeElapsed +"MILISEKUND</h1>");
		System.out.println("win");
            	
        }
    }
}
