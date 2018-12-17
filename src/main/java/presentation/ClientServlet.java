package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Account;
import metier.Client;
import service.AccountService;
import service.ClientService;

public class ClientServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		List<Account> accounts = AccountService.getInstance().getAll();
		req.setAttribute("account", accounts);
		this.getServletContext().getRequestDispatcher("/tableau.jsp").forward(req, resp);
	}

	
 
}

