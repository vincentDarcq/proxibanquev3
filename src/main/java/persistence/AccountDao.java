package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Account;

public class AccountDao extends AbstractDao<Account>{

	private static final AccountDao INSTANCE = new AccountDao();
	
	@Override
	public List<Account> readAll() {
		List<Account> accounts = new ArrayList<>();
		TypedQuery<Account> query = this.em.createQuery(SqlQueries.SELECT_ALL_ACCOUNTS, Account.class);
		accounts.addAll(query.getResultList());
		return accounts; 
	}

	@Override
	public Account create(Account entity) {
		return super.create(entity);
	}

	public static AccountDao getInstance() {
		return AccountDao.INSTANCE;
	}
	
}
