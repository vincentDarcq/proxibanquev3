package service;

<<<<<<< HEAD
=======


>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
import metier.Account;
import metier.Client;
import persistence.AccountDao;
import persistence.ClientDao;

public class ClientService {

<<<<<<< HEAD
	private static final ClientService INSTANCE = new ClientService(AccountDao.getInstance(), ClientDao.getInstance());
	private ClientDao daoClient;
=======
	private static final ClientService INSTANCE = new ClientService();
	private ClientDao daoClient;

>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
	private AccountDao daoAccount;

	/**
	 * Retourne le singleton de la classe.
	 * 
	 * @return Le singleton.
	 */
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}

	public ClientService() {
		
	}
	public ClientService(AccountDao daoAccount, ClientDao daoClient) {
		this.daoClient = daoClient;
		this.daoAccount = daoAccount;
	}

	public Client read(Integer id) {
		return this.daoClient.read(id);
	}

	public Client read(String lastname, String firstname) {
		return this.daoClient.read(lastname, firstname);
	}
<<<<<<< HEAD

=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7


	public boolean withDraw(float cash, Integer debitId) {
			boolean withDrawOK = true;
			Account compteDebite = this.daoAccount.read(debitId);
			if(cash > 300) {
				withDrawOK = false;
			}else if(compteDebite.getBalance() + cash <0) {
				withDrawOK = false;
			}else {
				compteDebite.setBalance(compteDebite.getBalance() + cash);
				this.daoAccount.update(compteDebite);
			}
			return withDrawOK;
		}

<<<<<<< HEAD

=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
	
	public boolean transfer(Float value, Integer debitId, Integer creditId, Integer clientId) {
		boolean transferOK = true;
		Client client = this.daoClient.read(clientId);
		Account compteDebite = client.getAccountById(debitId);
		Account compteCredite = client.getAccountById(creditId);
		if (compteDebite.getId() == compteCredite.getId()) {
			return transferOK;
		} else if (compteDebite.getBalance() - value < 0) {
			transferOK = false;
			return transferOK;
		} else if (value > 900) {
			transferOK = false;
			return transferOK;
		}
		
		else {
			compteCredite.setBalance(compteCredite.getBalance() + value);
			this.daoAccount.update(compteCredite);

			compteDebite.setBalance(compteDebite.getBalance() - value);
			this.daoAccount.update(compteDebite);

			return transferOK;
		}
	}

	
	}
<<<<<<< HEAD


=======
>>>>>>> 4f275f2d613b1f913bd07a0038126198588705e7
