import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/test")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
	String myParam="myparam";
	String paramValue=request.getParameter(myParam);
       PrintWriter out = response.getWriter();
		out.println("<html><body>");
	out.println("<p>"+paramValue+"</p>");
        out.println("<table><tr><th>Decimal</th><th>Hexadecimal</th><th>Octal</th><th>Binary</th></tr>");
		//conversion looks smt like this
		/*int binary[] = new int[40];    
		int index = 0;    
		while(decimal > 0){    
		binary[index++] = decimal%2;    
		decimal = decimal/2;    
		}    
		for(int i = index-1;i >= 0;i--){    
			System.out.print(binary[i]);    
		}    
		*/
		for (int i = 0; i<100;i++){
			out.println("<tr><th>"+i+"</th><th>"+Integer.toHexString(i)+"</th><th>"+Integer.toOctalString(i)+"</th><th>"+Integer.toBinaryString(i)+"</th></tr>");
		}
	
	
	out.println("</table></body></html>");
	}
}
