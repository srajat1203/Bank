

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("firstname");
		//System.out.println(name);
		String comment = request.getParameter("comment");
		//System.out.println(comment);
		String car = request.getParameter("car");
		//System.out.println(car);
		
		
		
		
		
		
		
  response.setContentType("text/html");
 	     
  request.setAttribute("name",name);
  request.setAttribute("comment",comment);
  request.setAttribute("car",car);
  
	      getServletContext()
	      	.getRequestDispatcher("/output.jsp")
	      	.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
