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

public class CardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private AccountService accS = AccountService.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Integer id = Integer.parseInt(req.getParameter("id"));
		// Client client = ClientService.getInstance().read(id);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/Card.jsp").forward(req, resp);
		// resp.sendRedirect(this.getServletContext().getContextPath() +
		// "/WEB-INF/views/card.html?id=" + client.getId());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer accountId = Integer.parseInt(req.getParameter("id"));
		String type = req.getParameter("card");
		Boolean createOK = AccountService.getInstance().linkNewCard(accountId, type);
		if (!createOK) {
			req.setAttribute("createRate", createOK);
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/error.jsp").forward(req, resp);
		} else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/views/tableau.jsp").forward(req, resp);
		}

	}

}
