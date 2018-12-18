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

<<<<<<< HEAD
	private static final MySqlConnection INSTANCE = new MySqlConnection();

	/**
	 * méthode pour récupérer le singleton.
	 * 
	 * @return
=======
	/**
	 * Déclaration d'un singleton (instance unique) privé.
	 */
	private static final MySqlConnection INSTANCE = new MySqlConnection();

	/**
	 * @return MysqlConnection l'instance unique (singleton) de connexion BDD.
>>>>>>> 88ad1de5a2f0e6005891f96e327cd5c6083ad159
	 */
	public static MySqlConnection getInstance() {
		return MySqlConnection.INSTANCE;
	}

<<<<<<< HEAD
	private EntityManagerFactory EMF;

	/**
	 * Constructeur d'initialisation par défaut.
	 * 
=======
	/**
	 * Il est nécessaire de mémoriser quelque part l'instance unique de
	 * EntityManagerFactory.
	 */
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	/**
	 * Constructeur par défaut. Récupère l'instance d'EntityManagerFactory
	 * associée à notre unité de persistence 'blog' définie dans
	 * persistence.xml.
>>>>>>> 88ad1de5a2f0e6005891f96e327cd5c6083ad159
	 */
	public MySqlConnection() {
		this.entityManagerFactory = Persistence
				.createEntityManagerFactory("proxibanquev3");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}

	/**
<<<<<<< HEAD
	 * méthode retournant l'entity manager.
	 * 
	 * @return
=======
	 * @return EntityManager une instance capable d'effectuer les opérations
	 *         CRUD sur la base de données.
>>>>>>> 88ad1de5a2f0e6005891f96e327cd5c6083ad159
	 */
	public EntityManager getEntityManager() {
		return this.entityManager;
	}

}
