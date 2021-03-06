package persistence;

/**
 * Classe représentant les constantes de requête.
 * 
 * @author Adminl
 *
 */
public class SqlQueries {

	public static final String SELECT_ALL_CLIENTS = "SELECT c FROM Client c";
	public static final String SELECT_ALL_CARDS = "SELECT c FROM Card c";
	public static final String SELECT_ALL_ACCOUNTS = "SELECT a FROM Account a";
	public static final String SELECT_ALL_CHEQUES = "SELECT c FROM Cheque c";

	public static final String SELECT_CLIENT_BY_NAME = "SELECT c FROM Client c where lastname=:lastname and firstname=:firstname";
	public static final String SELECT_ACCOUNT_BY_ID = "SELECT a FROM Account a where id=:id";
}
