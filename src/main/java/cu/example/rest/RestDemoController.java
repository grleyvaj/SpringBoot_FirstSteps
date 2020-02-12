package cu.example.rest;

import cu.example.model.Person;
import cu.example.repository.IPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

    @Autowired
    private IPersonRepo repo;

    @GetMapping
    public List<Person> listar(){
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Person per){
        repo.save(per);
    }

    @PutMapping
    public void modificar(@RequestBody Person per){
        repo.save(per);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
