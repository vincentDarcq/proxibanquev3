package service;

import metier.Account;
import metier.Client;
import persistence.AccountDao;
import persistence.ClientDao;

/**
 * Classe gérant les options possibles du client sur l'application.
 * 
 * @author Adminl
 *
 */
public class ClientService {

	private static final ClientService INSTANCE = new ClientService(AccountDao.getInstance(), ClientDao.getInstance());
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

	/**
	 * Constructeur d'initialisation par défaut.
	 */
	public ClientService() {

	}

	/**
	 * Constructeur d'initialisation avec attributs.
	 * 
	 * @param daoAccount
	 * @param daoClient
	 */
	public ClientService(AccountDao daoAccount, ClientDao daoClient) {
		this.daoClient = daoClient;
		this.daoAccount = daoAccount;
	}

	/**
	 * Méthode retournant les informations d'un client par son Id.
	 * 
	 * @param id
	 * @return
	 */
	public Client read(Integer id) {
		return this.daoClient.read(id);
	}

	/**
	 * Méthode retournant les informations d'un client par son prénom et son nom.
	 * 
	 * @param lastname
	 * @param firstname
	 * @return
	 */
	public Client read(String lastname, String firstname) {
		return this.daoClient.read(lastname, firstname);
	}

	/**
	 * Méthode permettant d'effectuer un retrait.
	 * 
	 * @param cash
	 * @param debitId
	 * @return
	 */
	public boolean withDraw(float cash, Integer debitId) {
			boolean withDrawOK = true;
			Account compteDebite = this.daoAccount.read(debitId);
			if(cash > 300) {
				withDrawOK = false;
			}else if(compteDebite.getBalance() - cash <0) {
				withDrawOK = false;
			}else {
				compteDebite.setBalance(compteDebite.getBalance() - cash);
				this.daoAccount.update(compteDebite);
			}
			return withDrawOK;
	}

	/**
	 * Méthode permettant d'effectuer un virement.
	 * 
	 * @param value
	 * @param debitId
	 * @param creditId
	 * @param clientId
	 * @return
	 */
	public boolean transfer(Float value, Integer debitId, Integer creditId, Integer clientId) {
		boolean transferOK = true;
		Client client = this.daoClient.read(clientId);
		Account compteDebite = client.getAccountById(debitId);
		Account compteCredite = client.getAccountById(creditId);
		if (compteDebite.getId() == compteCredite.getId()) {
			return transferOK;
		} else if (compteDebite.getBalance() - value < 0) {
			transferOK = false;
			return transferOK;
		} else if (value > 900) {
			transferOK = false;
			return transferOK;
		}

		else {
			compteCredite.setBalance(compteCredite.getBalance() + value);
			this.daoAccount.update(compteCredite);
			System.out.println(value);

			compteDebite.setBalance(compteDebite.getBalance() - value);
			this.daoAccount.update(compteDebite);

			return transferOK;
		}

	}

}
