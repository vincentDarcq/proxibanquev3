package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MySqlConnection {

private static final MySqlConnection INSTANCE = new MySqlConnection();
	
	public static MySqlConnection getInstance() {
		return MySqlConnection.INSTANCE;
	}
	
	private EntityManagerFactory EMF;
	
	public MySqlConnection() {
		this.EMF = Persistence.createEntityManagerFactory("proxibanquev3");
	}

	public EntityManager getEntityManager() {
		return this.EMF.createEntityManager();
	}
	
}
