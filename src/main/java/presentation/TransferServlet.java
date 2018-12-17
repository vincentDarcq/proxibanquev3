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


public class TransferServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private AccountService accS = AccountService.getInstance();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        Integer id = Integer.parseInt(req.getParameter("id"));
        Client client = ClientService.getInstance().read(id);
        List<Account> accounts = this.accS.getAll(id);
        if (accounts.size() <= 1) {
            req.setAttribute("client", client);
            req.getServletContext().getRequestDispatcher("/WEB-INF/views/error_transfer.jsp").forward(req, resp);
        } else {
            req.setAttribute("accounts", accounts);
            req.setAttribute("client", client);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/transfer.jsp").forward(req, resp);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}