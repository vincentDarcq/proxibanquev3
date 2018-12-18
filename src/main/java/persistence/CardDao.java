package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Card;

public class CardDao extends AbstractDao<Card> {

	private static final CardDao INSTANCE = new CardDao();
	
	public static CardDao getInstance() {
		return CardDao.INSTANCE;
	}

	@Override
	public List<Card> readAll() {
		List<Card> cards = new ArrayList<>();
		TypedQuery<Card> query = this.em.createQuery(SqlQueries.SELECT_ALL_CARDS, Card.class);
		cards.addAll(query.getResultList());
		return cards; 
	}

	@Override
	public Card create(Card entity) {
		return super.create(entity);
	}
	
	
	
	
}
