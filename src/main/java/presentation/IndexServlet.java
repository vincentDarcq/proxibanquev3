package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Client;
import service.ClientService;





public class IndexServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Client client = new Client();
		String name = req.getParameter("lastname");
		String [] array = name.split(" ");
<<<<<<< HEAD
		String lastname = array[0];
		String firstname = array[1];
		Client client = ClientService.getInstance().read(lastname, firstname);
		
		if (client == null) {
			client = ClientService.getInstance().read(firstname, lastname);
			if (client == null) {
				this.getServletContext().getRequestDispatcher("/error.jsp").forward(req, resp);
			}
		}
		
		resp.sendRedirect(this.getServletContext().getContextPath() + "/tableau.html?id=" + client.getId());
=======
		client.setLastname(array[0]);
		client.setFirstname(array[1]);
		ClientService service = ClientService.getInstance();
		resp.sendRedirect(this.getServletContext().getContextPath() + "/customer.html");
>>>>>>> 0cce6fda43deeb1bbaacfaf1407394a627d27cda
	}
 
}
