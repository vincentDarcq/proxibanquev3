package service;

import java.util.ArrayList;
import java.util.List;

import metier.Account;
import metier.CurrentAccount;
import metier.SavingAccount;
import persistence.AccountDao;
import persistence.ClientDao;

public class AccountService {
	
	private static final AccountService INSTANCE = new AccountService();
	private  AccountDao daoAccount;
	private  ClientDao clientDao;


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
		this.clientDao = clientDao.getInstance();	}

	/**
	 * Recup�re la liste de tous les Accounts suivis par le conseiller.
	 * 
	 * @return La liste des Accounts du conseiller.
	 */
	public List<Account> getAll() {
		return this.daoAccount.readAll();
	}	
	
	public List<Account> getAll(Integer idClient) {
        List<Account> accounts = new ArrayList<>();

        accounts = this.clientDao.read(idClient).getAccounts();

        return accounts;

    }
	
	
	public Account read(Integer id) {
		return this.daoAccount.read(id);
	}
	
	public List<Account> getAllSavingAccounts(Integer idClient) {
		List<Account> SavingAccounts = new ArrayList<>();

		List<Account> accounts = new ArrayList<>();
		accounts = this.clientDao.read(idClient).getAccounts();

		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccounts.add(account);
			}
		}
		return SavingAccounts;
	}

	/**
	 * Recup�re la liste des comptes courant d'un client.
	 * 
	 * @param idClient L'id du client dont on veut les comptes courant.
	 * @return La liste des comptes courant du client.
	 */
	public List<Account> getAllCurrentAccounts(Integer idClient) {
		List<Account> CurrentAccounts = new ArrayList<>();

		List<Account> accounts = new ArrayList<>();
		accounts = this.clientDao.read(idClient).getAccounts();

		for (Account account : accounts) {
			if (account instanceof CurrentAccount) {
				CurrentAccounts.add(account);
			}
		}
		return CurrentAccounts;
	}
	
	public AccountDao getDao() {
		return this.daoAccount;
	}

	
}	
