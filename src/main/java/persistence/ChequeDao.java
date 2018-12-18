package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Cheque;

public class ChequeDao extends AbstractDao<Cheque>{

	private static final ChequeDao INSTANCE = new ChequeDao();
	
	public static ChequeDao getInstance() {
		return ChequeDao.INSTANCE;
	}

	@Override
	public List<Cheque> readAll() {
		List<Cheque> Cheques = new ArrayList<>();
		TypedQuery<Cheque> query = this.em.createQuery(SqlQueries.SELECT_ALL_CHEQUES, Cheque.class);
		Cheques.addAll(query.getResultList());
		return Cheques; 
	}

	@Override
	public Cheque create(Cheque entity) {
		return super.create(entity);
	}
	
	
	
}
