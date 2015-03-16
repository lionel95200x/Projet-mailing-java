

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out  = response.getWriter();
		out.println("<div style='padding: 20px; background-color: rgba(0,0,0,0.2); border: dashed 1px black;'>"
				+ "<form action=Servlet2 method=post>"
				+ "<input name='nom' style='height: 20px; border: none; border-radius: 5px;' type='text' placeholder='Nom'>"
				+ "<br/><br/>"
				+ "<input name='age' style='height: 20px; border: none; border-radius: 5px;' type='text' placeholder='Age'>"
				+ "<br/><br/>"
				+ "<input name='codepostal' style='height: 20px; border: none; border-radius: 5px;' type='text' placeholder='Code Postal ici'>"
				+ "<br/><br/>"
				+ "<input type='submit'>"
				+ "</form>"
				+ "</div>"); 
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
