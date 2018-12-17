package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import metier.Card;
import metier.Client;

public class CardDao extends AbstractDao<Card> {

	private static final ClientDao INSTANCE = new ClientDao();

	@Override
	public List<Card> readAll() {
		List<Card> cards = new ArrayList<>();
		TypedQuery<Card> query = this.em.createQuery(SqlQueries.SELECT_ALL_CARDS, Card.class);
		cards.addAll(query.getResultList());
		return cards; 
	}

	@Override
	public Card create(Card entity) {
		// TODO Auto-generated method stub
		return super.create(entity);
	}
	
	
	
	
}
