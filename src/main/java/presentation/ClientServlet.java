package presentation;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import metier.Account;
import metier.Client;
<<<<<<< HEAD
=======
import service.AccountService;
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7


import service.ClientService;

public class ClientServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
<<<<<<< HEAD

=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
		List<Account> accounts = ClientService.getInstance().read(id).getAccounts();
		Client client = ClientService.getInstance().read(id);
		req.setAttribute("accountList", accounts);
		req.setAttribute("client", client);

		List<Account> currentAccounts= AccountService.getInstance().getAllCurrentAccounts(id);
		List<Account> savingAccounts= AccountService.getInstance().getAllSavingAccounts(id);
		req.setAttribute("currentAccounts",currentAccounts);
		req.setAttribute("savingAccounts",savingAccounts);
		req.setAttribute("id",id);
		req.setAttribute("client",client);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/tableau.jsp").forward(req, resp);
	}
 
}

	