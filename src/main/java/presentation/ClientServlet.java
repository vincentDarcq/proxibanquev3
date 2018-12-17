package presentation;

import java.io.IOException;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 0cce6fda43deeb1bbaacfaf1407394a627d27cda

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import metier.Account;
import metier.Client;
import service.AccountService;
import service.ClientService;

public class ClientServlet extends HttpServlet{

=======


public class ClientServlet extends HttpServlet{
>>>>>>> 0cce6fda43deeb1bbaacfaf1407394a627d27cda

	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
<<<<<<< HEAD
		Integer id = Integer.parseInt(req.getParameter("id"));
		List<Account> accounts = AccountService.getInstance().getAll();
		req.setAttribute("account", accounts);
		this.getServletContext().getRequestDispatcher("/tableau.jsp").forward(req, resp);
	}

	
 
}

=======
		super.doGet(req, resp);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/tableau.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
>>>>>>> 0cce6fda43deeb1bbaacfaf1407394a627d27cda
