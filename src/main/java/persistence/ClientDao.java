package persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import metier.Client;


public class ClientDao extends AbstractDao<Client> {

	private static final ClientDao INSTANCE = new ClientDao();
	

	@Override
	public Client read(Integer id) {
		return this.read(id, new Client());		
	}


	@Override
	public List<Client> readAll() {
		List<Client> clients = new ArrayList<>();
		TypedQuery<Client> query = this.em.createQuery(SqlQueries.SELECT_ALL_CLIENTS, Client.class);
		clients.addAll(query.getResultList());
		return clients; 
	}


	public static ClientDao getInstance() {
		return ClientDao.INSTANCE;
	}
	
	public Client read(String lastname, String firstname) {
		Client client = null;
		TypedQuery<Client> query = this.em.createQuery(SqlQueries.SELECT_CLIENT_BY_NAME, Client.class);
		query.setParameter("lastname", lastname);
		query.setParameter("firstname", firstname);
		try {
		client= query.getSingleResult();
		} catch (PersistenceException e) {
	}
	
		return client;
	}
}
