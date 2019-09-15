package sefaz.pe.gov.br.desafiosefaz.interfaces;

import java.util.List;

/**
 * @author Marcus Vinicius
 * @param <T> Class of entity
 */
public interface AbstractDaoIF <T> {
    public void create(T entity);
    public void delete(T entity);
    public void update(T entity);
    public List<T> findAll();
    public T findById(Long id);
}
