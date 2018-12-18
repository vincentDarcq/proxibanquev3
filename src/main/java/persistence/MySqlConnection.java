package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe permettant la connexion à la BDD.
 * 
 * @author Adminl
 *
 */
public class MySqlConnection {

	private static final MySqlConnection INSTANCE = new MySqlConnection();

	/**
	 * méthode pour récupérer le singleton.
	 * 
	 * @return
	 */
	public static MySqlConnection getInstance() {
		return MySqlConnection.INSTANCE;
	}

	private EntityManagerFactory EMF;

	/**
	 * Constructeur d'initialisation par défaut.
	 * 
	 */
	public MySqlConnection() {
		this.EMF = Persistence.createEntityManagerFactory("proxibanquev3");
	}

	/**
	 * méthode retournant l'entity manager.
	 * 
	 * @return
	 */
	public EntityManager getEntityManager() {
		return this.EMF.createEntityManager();
	}

}
