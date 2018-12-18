package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Card;

/**
 * Classe permettant l'accès à la BDD d'une carte bancaire.
 * 
 * @author Adminl
 *
 */
public class CardDao extends AbstractDao<Card> {

	private static final CardDao INSTANCE = new CardDao();

	/**
	 * Méthode retournant le singleton
	 * 
	 * @return
	 */
	public static CardDao getInstance() {
		return CardDao.INSTANCE;
	}

	/*
	 * Méthode retournant la liste de cartes bancaires d'un client.
	 */
	@Override
	public List<Card> readAll() {
		List<Card> cards = new ArrayList<>();
		TypedQuery<Card> query = this.em.createQuery(SqlQueries.SELECT_ALL_CARDS, Card.class);
		cards.addAll(query.getResultList());
		return cards;
	}

	/*
	 * Méthode permettant de créer une carte.
	 */
	@Override
	public Card create(Card entity) {
		return super.create(entity);
	}

	/*
	 * Cette méthode ne retourne rien.
	 */
	@Override
	public Card read(Integer id) {
		return null;
	}

}
