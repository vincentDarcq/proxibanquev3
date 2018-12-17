package service;


import metier.Client;
import persistence.ClientDao;


public class ClientService {

	private static final ClientService INSTANCE = new ClientService();
	private  ClientDao daoClient;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}

	public ClientService() {
		this.daoClient = ClientDao.getInstance();
	}

	
	public Client read(Integer id) {
		return this.daoClient.read(id);
	}
	
	public Client read(String lastname, String firstname) {
		return this.daoClient.read(lastname, firstname);
	}
	
	}

