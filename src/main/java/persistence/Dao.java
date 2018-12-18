package persistence;

import java.util.List;

/**
 * Interface Data Access Object.
 * 
 * @author Adminl
 *
 * @param <T>
 */
public interface Dao<T> {

	/**
	 * Recupere les informations d'une id.
	 * 
	 * @param id
	 * @return
	 */
	public T read(Integer id);

	/**
	 * Recupere toutes les entit�s (lignes) d'une table
	 * 
	 * @return List<T> la liste de toutes les entites lues.
	 */
	public List<T> readAll();

	/**
	 * met � jour l'entite donne dans la BDD
	 * 
	 * @param entity l'entite � mettre a jour avec les nouvelles informations
	 * @return l'entite mise � jour
	 */
	public T update(T entity);

	/**
	 * Création d'une entité.
	 * 
	 * @param entity
	 * @return
	 */
	public T create(T entity);

	/**
	 * Suppression d'une entité.
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(Integer id);
}
