package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Cheque;

/**
 * Classe permettant l'accès à la BDD d'un cheque
 * 
 * @author Adminl
 *
 */
public class ChequeDao extends AbstractDao<Cheque> {

	private static final ChequeDao INSTANCE = new ChequeDao();

	/**
	 * méthode retournant le singleton.
	 * 
	 * @return
	 */
	public static ChequeDao getInstance() {
		return ChequeDao.INSTANCE;
	}

	/*
	 * Cette méthode retourne la liste des cheques d'un client.
	 */
	@Override
	public List<Cheque> readAll() {
		List<Cheque> Cheques = new ArrayList<>();
		TypedQuery<Cheque> query = this.em.createQuery(SqlQueries.SELECT_ALL_CHEQUES, Cheque.class);
		Cheques.addAll(query.getResultList());
		return Cheques;
	}

	/*
	 * Cette méthode n'est pas utilisée.
	 */
	@Override
	public Cheque create(Cheque entity) {
		return super.create(entity);
	}

	/*
	 * Cette méthode n'est pas utilisée.
	 */
	@Override
	public Cheque read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
