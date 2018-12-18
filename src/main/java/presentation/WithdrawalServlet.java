package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Account;
import service.AccountService;
import service.ClientService;

public class WithdrawalServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
		Account account = AccountService.getInstance().read(id);
		req.setAttribute("accounts", account);
		this.getServletContext().getRequestDispatcher("").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer accoundId = Integer.parseInt(req.getParameter("id"));
		Float val = Float.parseFloat(req.getParameter("value"));
		Boolean withdrawOK = ClientService.getInstance().withDraw(val, accoundId);
		if(!withdrawOK) {
			req.setAttribute("withdrawRate", withdrawOK);
			this.getServletContext().getRequestDispatcher("").forward(req, resp);			
		} else {
			this.getServletContext().getRequestDispatcher("").forward(req, resp);
		}	
	}
}
