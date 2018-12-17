package service;

import metier.Client;
import persistence.AccountDao;
import persistence.ClientDao;

public class CardService {

	private static final CardService INSTANCE = new CardService();
	private  AccountDao daoAccount;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static CardService getInstance() {
		return CardService.INSTANCE;
	}

	public CardService() {
		this.daoAccount = AccountDao.getInstance();
	}

	}
 
