package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Account;
import metier.Check;

public class CheckDao extends AbstractDao<Check>{

	private static final CheckDao INSTANCE = new CheckDao();
	
	public static CheckDao getInstance() {
		return CheckDao.INSTANCE;
	}

	@Override
	public List<Check> readAll() {
		List<Check> checks = new ArrayList<>();
		TypedQuery<Check> query = this.em.createQuery(SqlQueries.SELECT_ALL_CHECKS, Check.class);
		checks.addAll(query.getResultList());
		return checks; 
	}

	@Override
	public Check create(Check entity) {
		// TODO Auto-generated method stub
		return super.create(entity);
	}
	
	
	
}
