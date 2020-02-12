package cu.example;

import static org.junit.Assert.assertTrue;

import cu.example.model.Usuario;
import cu.example.repository.IUsuarioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class DemoWebApplicationTest {

    @Autowired
    private IUsuarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest(){
        Usuario usuario = new Usuario();
        usuario.setId(4);
        usuario.setNombre("Gloria");
        usuario.setClave(encoder.encode("123"));

        Usuario retorno = repository.save(usuario);

        assertTrue(retorno.getClave().equalsIgnoreCase(usuario.getClave()));
    }
}
