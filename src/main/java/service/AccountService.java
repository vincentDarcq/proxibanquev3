package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Account;
import metier.Card;
import metier.Cheque;
import metier.CurrentAccount;
import metier.SavingAccount;
import persistence.AccountDao;
import persistence.ClientDao;
import persistence.CardDao;
import persistence.ChequeDao;

public class AccountService {

	private static final AccountService INSTANCE = new AccountService();
<<<<<<< HEAD
	private  AccountDao daoAccount;

	private ClientDao clientDao;
	private CardDao CardDao;


=======
	private AccountDao daoAccount;
	private ClientDao clientDao;
	private CardDao CardDao;
	private ChequeDao CheckDao;
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7

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
		this.clientDao = ClientDao.getInstance();
	}

	/**
	 * Recup�re la liste de tous les Accounts suivis par le conseiller.
	 * 
	 * @return La liste des Accounts du conseiller.
	 */
	public List<Account> getAll(Integer idClient) {
		List<Account> accounts = new ArrayList<>();
		accounts = this.clientDao.read(idClient).getAccounts();
		return accounts;

	}
<<<<<<< HEAD
	
=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7

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
<<<<<<< HEAD
	/**
=======

>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
	public boolean linkNewCard(Integer accountId, String type) {
		boolean resultOk = true;
		Account account = this.daoAccount.read(accountId);
		// Si le compte avait déjà une carte et qu'elle a expirée.
		if (account.getCard() != null) {
			// On vérifie que la date d'expiration est bien dépassée.
			if (account.getCard().getExpirationDate().isBefore(LocalDate.now())) {
				// Retirer le lien entre l'ancienne carte et le compte.
				account.setCard(null);
				// Mettre à jour le compte pour que le lien n'existe plus en BDD.
				this.daoAccount.update(account);
			} else {
				// Sinon on indique qu'il ne faut pas créer de carte.
				resultOk = false;
			}
		}
		// Si il est possible d'ajouter une carte.
		if (resultOk) {
			// On prepare la nouvelle carte.
			Card newCard = new Card();
			newCard.setExpirationDate(LocalDate.now().plusMonths(3));
			newCard.setType(type);
			// On créé la carte en BDD pour avoir un id généré.
			newCard = this.CardDao.create(newCard);
			// On lie la nouvelle carte au compte.
			account.setCard(newCard);
			// On met à jour le compte avec le lien vers la nouvelle carte.
			this.daoAccount.update(account);
		}
		return resultOk;
	}
<<<<<<< HEAD
	**/
=======

	public boolean linkNewCheck(Integer accountId, String type) {
		boolean resultOk = true;
		Account account = this.daoAccount.read(accountId);
		if (account.getCheck() != null) {
			if (account.getCheck().getReceptionDate().isBefore(LocalDate.now())) {
				account.setCheck(null);
				this.daoAccount.update(account);
			} else {
				resultOk = false;
			}
		}
		if (resultOk) {
			Cheque newCheck = new Cheque();
			newCheck.setReceptionDate(LocalDate.now().plusMonths(3));
			newCheck = this.CheckDao.create(newCheck);
			account.setCheck(newCheck);
			this.daoAccount.update(account);
		}
		return resultOk;
	}
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
}
