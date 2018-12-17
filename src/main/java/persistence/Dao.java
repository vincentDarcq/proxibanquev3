package persistence;

import java.util.List;

public interface Dao <T>{

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
	public T create(T entity);
	public boolean delete(Integer id);
}
