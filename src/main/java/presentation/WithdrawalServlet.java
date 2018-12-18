package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Account;
import metier.Client;
import service.AccountService;
import service.ClientService;

/**
 * Classe qui gère la page web pour un retrait.
 * 
 * @author Adminl
 *
 */
public class WithdrawalServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
		Account account = AccountService.getInstance().read(id);
		req.setAttribute("accounts", account);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/withdrawal.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer clientId = Integer.parseInt(req.getParameter("id"));
		Integer accoundId = Integer.parseInt(req.getParameter("accountId"));
		Float val = Float.parseFloat(req.getParameter("amount"));
		Boolean withdrawOK = ClientService.getInstance().withDraw(val, accoundId);
<<<<<<< HEAD
		if (!withdrawOK) {
			req.setAttribute("withdrawRate", withdrawOK);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/tableau.jsp").forward(req, resp);
		}
=======
		Client client  = ClientService.getInstance().read(clientId);
		if(!withdrawOK) {
			req.setAttribute("withdrawRate", withdrawOK);
			//this.getServletContext().getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);			
			resp.sendRedirect(this.getServletContext().getContextPath() + "/tableau.html?id=" + client.getId());
		} else {
			//this.getServletContext().getRequestDispatcher("/WEB-INF/views/withdrawal_OK.jsp").forward(req, resp);
			resp.sendRedirect(this.getServletContext().getContextPath() + "/tableau.html?id=" + client.getId());
		}	
>>>>>>> 88ad1de5a2f0e6005891f96e327cd5c6083ad159
	}
}
