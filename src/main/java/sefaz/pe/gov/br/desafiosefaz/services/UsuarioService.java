package sefaz.pe.gov.br.desafiosefaz.services;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import sefaz.pe.gov.br.desafiosefaz.dao.UsuarioDao;
import sefaz.pe.gov.br.desafiosefaz.model.Usuario;
import sefaz.pe.gov.br.desafiosefaz.interfaces.UsuarioDaoIF;

/**
 *
 * @author Marcus Patriota
 */
public class UsuarioService implements Serializable{
    
    @Inject
    private UsuarioDao dao;

    public UsuarioService() {
    }
        
    public void create(Usuario entity) {
       dao.create(entity);
    }

    public void delete(Usuario entity){
        dao.delete(entity);
    }

    public void update(Usuario entity){
        dao.update(entity);
    }

    public Usuario findById(Long id){
        return dao.findById(id);
    }
    
    public List<Usuario> findAll() {
        return dao.findAll();
    }
    
}
