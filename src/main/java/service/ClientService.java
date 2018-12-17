package service;

import java.util.List;

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

	/**
	 * Recup�re la liste de tous les clients suivis par le conseiller.
	 * 
	 * @return La liste des clients du conseiller.
	 */
	public List<Client> getAll() {
		return this.daoClient.readAll();
	}	
	
	public Client read(Integer id) {
		return this.daoClient.read(id);
	}
	}

