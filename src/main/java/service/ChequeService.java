package service;

import metier.Cheque;
import persistence.ChequeDao;

public class ChequeService {

	private static final ChequeService INSTANCE = new ChequeService();
	private ChequeDao daoCheck;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static ChequeService getInstance() {
		return ChequeService.INSTANCE;
	}

	public ChequeService() {
		this.daoCheck = ChequeDao.getInstance();
	}

	public Cheque getType(Integer id) {
		return this.daoCheck.read(id);
	}

}