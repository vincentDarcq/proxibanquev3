package service;

import metier.Card;
import persistence.CardDao;

/**
 * Classe comprenant les méthodes de lecture d'une carte bancaire.
 * 
 * @author Adminl
 *
 */
public class CardService {

	private static final CardService INSTANCE = new CardService();
	private CardDao daoCard;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static CardService getInstance() {
		return CardService.INSTANCE;
	}

	/**
	 * Constructeur d'initialisation par défaut.
	 * 
	 */
	public CardService() {
		this.daoCard = CardDao.getInstance();
	}

	/**
	 * Méthode donnant le type d'une carte bancaire.
	 * 
	 * @param id
	 * @return
	 */
	public Card getType(Integer id) {
		return this.daoCard.read(id);
	}

}
