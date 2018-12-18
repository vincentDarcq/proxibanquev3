package service;

import metier.Account;
import metier.Client;
import persistence.AccountDao;
import persistence.ClientDao;

public class ClientService {

	private static final ClientService INSTANCE = new ClientService();
	private ClientDao daoClient;
	private AccountDao daoAccount;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}

	public ClientService() {
		this.daoClient = ClientDao.getInstance();
	}

	public Client read(Integer id) {
		return this.daoClient.read(id);
	}

	public Client read(String lastname, String firstname) {
		return this.daoClient.read(lastname, firstname);
	}


	public boolean withDraw(float cash, Integer debitId) {
			boolean withDrawOK = true;
			Account compteDebite = this.daoAccount.read(debitId);
			if(cash > 300) {
				withDrawOK = false;
			}else if(compteDebite.getBalance() + cash <0) {
				withDrawOK = false;
			}else {
				compteDebite.setBalance(compteDebite.getBalance() + cash);
				this.daoAccount.update(compteDebite);
			}
			return withDrawOK;
		}
}

