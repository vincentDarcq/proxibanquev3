package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Cheque;
import service.AccountService;
import service.ChequeService;

public class CreateCardServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer id = Integer.parseInt(req.getParameter("id"));
		Cheque check = ChequeService.getInstance().getType(id);
		req.setAttribute("check", check);
		this.getServletContext().getRequestDispatcher("").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer accountId = Integer.parseInt(req.getParameter("id"));
		String type = req.getParameter("type");
		Boolean createOK = AccountService.getInstance().linkNewCard(accountId, type);
		if (!createOK) {
			req.setAttribute("createRate", createOK);
			this.getServletContext().getRequestDispatcher("").forward(req, resp);
		} else {
			this.getServletContext().getRequestDispatcher("").forward(req, resp);
		}

	}
}
