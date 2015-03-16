
import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		
		codePostal(request.getParameter("codepostal"));
		
		out.println("<HTML>\n<BODY>\n" +
					"<H1>Recapitulatif des informations</H1>\n" +
					"<table border=1><tr><td>Nom</td><td>age</td><td>code postal</td></tr>"
					+ "<tr><td>" + request.getParameter("nom")+
					"</td><td>"
					+  request.getParameter("age") + "\n" +
					"</td><td>"
					+ request.getParameter("codepostal") + "\n" +
					"</td></tr></table>"+
					"</BODY>" + "<script> alert('salut');</script>" +
					"</HTML>");  
		
		out.flush();
	 
	}
	
	public void codePostal(String codepostal) throws IOException
	{
	
	}
}
