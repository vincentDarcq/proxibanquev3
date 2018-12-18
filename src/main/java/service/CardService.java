package service;

import metier.Card;
import persistence.CardDao;

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

	public CardService() {
		this.daoCard = CardDao.getInstance();
	}

	public Card getType(Integer id) {
		return this.daoCard.read(id);
	}

}
