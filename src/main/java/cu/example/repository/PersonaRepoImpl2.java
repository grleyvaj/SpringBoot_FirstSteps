package cu.example.repository;

import cu.example.DemoConsoleApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersonaRepo {
    private static Logger LOG = LoggerFactory.getLogger(DemoConsoleApplication.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("Se registró a otra" + nombre);
    }
}
