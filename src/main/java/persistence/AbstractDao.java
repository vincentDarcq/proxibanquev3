package persistence;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * Classe abstraite permettant l'accès à la base de donnée. Elle implémente
 * l'interface Dao.
 * 
 * @author Adminl
 *
 * @param <T>
 */
public abstract class AbstractDao<T> implements Dao<T> {

	protected EntityManager em;

	/**
	 * Constructeur d'initialisation.
	 */
	public AbstractDao() {
		this.em = MySqlConnection.getInstance().getEntityManager();
	}

	/**
	 * Méthode retournant les informations d'un objet passé en paramètre avec son
	 * id.
	 * 
	 * @param id
	 * @param entity
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected T read(Integer id, T entity) {
		T result = null;
		result = (T) this.em.find(entity.getClass(), id);
		return result;
	}

	/*
	 * méthode ne retournant rien.
	 */
	@Override
	public List<T> readAll() {
		return null;
	}

	/*
	 * Méthode retournant un objet mis à jour.
	 * 
	 */
	@Override
	public T update(T entity) {
		this.em.getTransaction().begin();
		this.em.merge(entity);
		this.em.getTransaction().commit();
		return entity;
	}

	/*
	 * Méthode retournant un objet créer.
	 * 
	 */
	@Override
	public T create(T entity) {
		this.em.getTransaction().begin();
		this.em.persist(entity);
		this.em.getTransaction().commit();
		return entity;
	}

	/*
	 * Méthode retournant true après avoir supprimé un objet.
	 * 
	 */
	@Override
	public boolean delete(Integer id) {
		this.em.getTransaction().begin();
		T entity = this.read(id);
		this.em.remove(entity);
		this.em.getTransaction().commit();
		return true;
	}

}
