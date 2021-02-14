package TossCoin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GenerateRandom.RandomNumberGenerate;

/**
 * Servlet implementation class CoinTossServlet Right click on project --->
 * Properties ---> Java Build Path ---> Add Library... ---> Server Runtime --->
 * Apache Tomcat ----> Finish.
 * 
 */
@WebServlet("/CoinTossServlet")
public class CoinTossServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int count = 1;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int n = RandomNumberGenerate.RandomNumberGenerateNumber();
			System.out.println("value= "+n+", count : "+count );
			String content;
          if(count==10) resp.sendRedirect("Final.html");
			if (n % 2 == 0) {
				content = "Head";
			} else {
				content = "Tail";
			}
			PrintWriter writer = resp.getWriter();
			String htmlRespone = "<html>";
			htmlRespone += "<h2 style=\"color:Orange\"> Your Result is: " + content + "</h2>";
			htmlRespone += "<body style=\"color:white;background-color:green\">" + "<form action=\"CoinTossServlet\">"
					+ "  <input type=\"submit\" value=\"Toss\"/>" + "</form>"+"<h6>Your number of chances left: "+(10-count)+ "</body>" + "</html>";
           count++;
			writer.println(htmlRespone);
		} catch (Exception e) {

			 resp.sendRedirect("Final.html");

		}

	}

}
