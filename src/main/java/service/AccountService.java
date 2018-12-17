package service;

import java.util.List;

import metier.Account;
import persistence.AccountDao;

public class AccountService {
	
	private static final AccountService INSTANCE = new AccountService();
	private  AccountDao daoAccount;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static AccountService getInstance() {
		return AccountService.INSTANCE;
	}

	public AccountService() {
		this.daoAccount = AccountDao.getInstance();
	}

	/**
	 * Recup�re la liste de tous les Accounts suivis par le conseiller.
	 * 
	 * @return La liste des Accounts du conseiller.
	 */
	public List<Account> getAll() {
		return this.daoAccount.readAll();
	}	
	
	public Account read(Integer id) {
		return this.daoAccount.read(id);
	}
	
}	
