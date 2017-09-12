package persist;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.HibernateException;

import util.EntityManagerUtil;

public class AbstractRepository<T, ID extends Serializable>{

	private final EntityManager em;
	private Class<T> persistentClass;

	public AbstractRepository(Class<T> pPersistentClass) {
		this.em = EntityManagerUtil.getEntityManager();
		this.persistentClass = pPersistentClass;
	}

	public void save(T entity) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
		}
	}

	public void update(T entity) {
		try{
			this.em.getTransaction().begin();
			this.em.merge(entity);
			this.em.getTransaction().commit();
		}catch (Exception e) {
			this.em.getTransaction().rollback();
		}
	}

	public void delete(T entity) {
		try {
			this.em.getTransaction().begin();
			this.em.remove(entity);
			this.em.getTransaction().commit();
		} catch (Exception e){
			e.printStackTrace();
			this.em.getTransaction().rollback();
		}
	}

	public T findById(ID id) {
		T fEntity = null;
		try {
			fEntity = em.find(persistentClass, id);
		} catch (NoResultException e) {
			return null;
		} 	
		return fEntity;
	}

	public List<T> listAllEntity(Class<T> entity) {
		List<T> objects = null;
		try {
			Query query = em.createQuery("from " + entity.getName());
			objects = query.getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
		} 
		return objects;
	}

	public List<T> listAllEntityOrderBy(Class<T> entity, String fieldName) {
		List<T> objects = null;
		try {
			Query query = em.createQuery("from " + entity.getName() + " order by "
					+ fieldName);
			objects = query.getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
		} 
		return objects;
	}

}

