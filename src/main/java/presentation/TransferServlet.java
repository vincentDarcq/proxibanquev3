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

/**
 * Classe qui gère la page web du transfert de compte à compte.
 * 
 * @author Adminl
 *
 */
public class TransferServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private AccountService accS = AccountService.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
		Client client = ClientService.getInstance().read(id);
		List<Account> accounts = this.accS.getAll(id);
		if (accounts.size() <= 1) {
			req.setAttribute("client", client);
			req.setAttribute("clientId", id);
			req.getServletContext().getRequestDispatcher("/WEB-INF/views/error_transfer.jsp").forward(req, resp);
		} else {
			req.setAttribute("accounts", accounts);
			req.setAttribute("client", client);
			req.setAttribute("clientId", id);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/transfer.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer compteCredite = Integer.parseInt(req.getParameter("compteACrediter"));
		Integer compteDebite = Integer.parseInt(req.getParameter("compteADebiter"));
		Integer clientId = Integer.parseInt(req.getParameter("id"));
		Float val = Float.parseFloat(req.getParameter("value"));

		Boolean transferOK = ClientService.getInstance().transfer(val, compteDebite, compteCredite, clientId);

		if (!transferOK) {
			req.setAttribute("transferRate", transferOK);
			req.setAttribute("clientId", clientId);
			req.setAttribute("value", val);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/transfer.jsp").forward(req, resp);
		} else {
			req.setAttribute("clientId", clientId);
			req.setAttribute("value", val);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/transfer_OK.jsp").forward(req, resp);
		}
	}

}
