package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import metier.Account;

/**
 * Classe permettant l'accès à la BDD d'un compte
 * 
 * @author Adminl
 *
 */
public class AccountDao extends AbstractDao<Account> {

	private static final AccountDao INSTANCE = new AccountDao();

	/**
	 * méthode retournant le singleton.
	 * 
	 * @return
	 */
	public static AccountDao getInstance() {
		return AccountDao.INSTANCE;
	}

	/*
	 * Méthode retournant la liste de tous les comptes
	 */
	@Override
	public List<Account> readAll() {
		List<Account> accounts = new ArrayList<>();
		TypedQuery<Account> query = this.em.createQuery(SqlQueries.SELECT_ALL_ACCOUNTS, Account.class);
		accounts.addAll(query.getResultList());
		return accounts;
	}

	/*
	 * Méthode perméttant de créer un objet.
	 */
	@Override
	public Account create(Account entity) {
		return super.create(entity);
	}

	/*
	 * Méthode retournant le compte d'un client.
	 */
	@Override
	public Account read(Integer id) {
		Account account = new Account();
		TypedQuery<Account> query = this.em.createQuery(SqlQueries.SELECT_ACCOUNT_BY_ID, Account.class);
		query.setParameter("id", id);
		try {
			account = query.getSingleResult();
		} catch (PersistenceException e) {
		}
		return account;
	}

}
