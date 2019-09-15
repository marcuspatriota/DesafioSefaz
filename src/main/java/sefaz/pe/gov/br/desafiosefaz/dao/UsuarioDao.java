package sefaz.pe.gov.br.desafiosefaz.dao;

import sefaz.pe.gov.br.desafiosefaz.interfaces.UsuarioDaoIF;
import sefaz.pe.gov.br.desafiosefaz.model.Usuario;

/**
 *
 * @author Marcus Patriota
 */
public class UsuarioDao extends AbstractDao<Usuario> implements UsuarioDaoIF{
    
    public UsuarioDao(Class<Usuario> entityClass) {
        super(entityClass);
    }
    
}
