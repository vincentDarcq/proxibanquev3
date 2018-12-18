package service;

import persistence.ChequeDao;

/**
 * Classe gérant les services liés au chéquier.
 * 
 * @author Adminl
 *
 */
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

}