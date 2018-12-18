package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountService;

/**
 * Classe qui gère la page web d'ajout d'une carte bancaire.
 * 
 * @author Adminl
 *
 */
public class CardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/*
	 * méthode qui gère la requête http et dirige vers la page demandée.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/Card.jsp").forward(req, resp);
	}

	/*
	 * méthode qui récupère des données saisies par l'utilisateur et envoie sur la
	 * page web demandée avec ces données.
	 */
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
