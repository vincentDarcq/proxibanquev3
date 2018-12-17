package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Check;

public class ChequeDao extends AbstractDao<Check>{

	private static final ChequeDao INSTANCE = new ChequeDao();
	
	public static ChequeDao getInstance() {
		return ChequeDao.INSTANCE;
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
