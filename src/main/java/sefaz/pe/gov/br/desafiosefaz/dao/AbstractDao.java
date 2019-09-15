package sefaz.pe.gov.br.desafiosefaz.dao;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sefaz.pe.gov.br.desafiosefaz.interfaces.AbstractDaoIF;

/**
 *
 * @author marcu
 * @param <T> Class of entity
 */
public abstract class AbstractDao<T> implements AbstractDaoIF<T>{
    
    @Inject
    private EntityManager entityManager;
    private Class<T> entity;

    public AbstractDao(Class<T> entityClass) {
        this.entity = entityClass;
    }

    @Override
    public void create(T entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        
    }

    @Override
    public void delete(T entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public T findById(Long id) {
        return entityManager.find(entity, id);
    }

    @Override
    public List<T> findAll() {

        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entity));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Class<T> getEntity() {
        return entity;
    }

    public void setEntity(Class<T> entity) {
        this.entity = entity;
    }
    
   public T findByLoginl(String user, String password) {
        //Criador de consultas b aseadas em Criteria
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        //Query Criteria
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entity);
        
        Root<T> login = criteriaQuery.from(entity);
        TypedQuery<T> typedQuery = getEntityManager().createQuery(criteriaQuery);
        
        criteriaQuery.where(criteriaBuilder.equal(login.get("login"), user));
        criteriaQuery.where(criteriaBuilder.equal(login.get("password"), password));
        
      
        return typedQuery.getSingleResult();
    }
}
