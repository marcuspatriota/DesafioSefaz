package sefaz.pe.gov.br.desafiosefaz.services;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sefaz.pe.gov.br.desafiosefaz.model.Usuario;

/**
 *
 * @author Marcus Patriota
 */
public class UsuarioServiceTest {
    
    public UsuarioServiceTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of create method, of class UsuarioService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Usuario entity = new Usuario();
        entity.setEmail("teste@teste.com");
        entity.setNome("Teste");
//        UsuarioService instance = new UsuarioService();
//        instance.create(entity);
        
    }

    /**
     * Test of delete method, of class UsuarioService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
//        Usuario entity = null;
//        UsuarioService instance = new UsuarioService();
//        instance.delete(entity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class UsuarioService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
//        Usuario entity = null;
//        UsuarioService instance = new UsuarioService();
//        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findById method, of class UsuarioService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
//        Long id = null;
//        UsuarioService instance = new UsuarioService();
//        Usuario expResult = null;
//        Usuario result = instance.findById(id);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findAll method, of class UsuarioService.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
//        UsuarioService instance = new UsuarioService();
//        List<Usuario> expResult = null;
//        List<Usuario> result = instance.findAll();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
