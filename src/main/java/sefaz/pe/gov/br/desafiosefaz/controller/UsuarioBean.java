package sefaz.pe.gov.br.desafiosefaz.controller;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import sefaz.pe.gov.br.desafiosefaz.model.Usuario;
import sefaz.pe.gov.br.desafiosefaz.services.UsuarioService;
import sefaz.pe.gov.br.desafiosefaz.util.FacesUtil;

/**
 *
 * @author Marcus Patriota
 */
@Model
public class UsuarioBean implements Serializable {
    
    @Inject
    private UsuarioService service;
    private Usuario usuario;
    private Usuario usuarioSelect;
    
    private List<Usuario> usuarios;

    public UsuarioBean() {
    }

    public void create() {
        this.service.create(usuario);
        FacesUtil.addSuccessMessage("Produto cadastrado com sucesso!");
    }

    public void update() {
        this.service.update(usuarioSelect);
        FacesUtil.addSuccessMessage("Produto editado com sucesso!");
    }

    public void delete() {
        this.service.delete(usuarioSelect);
        FacesUtil.addSuccessMessage("Produto deletado com sucesso!");
    }
    
    public UsuarioService getService() {
        return service;
    }

    public void setService(UsuarioService service) {
        this.service = service;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
