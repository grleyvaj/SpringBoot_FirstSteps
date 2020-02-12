package cu.example.controller;

import cu.example.model.Persona;
import cu.example.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    IPersonaRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //logic here but should be in the service
        Persona persona = new Persona();
        persona.setIdPersona(2);
        persona.setNombre("Osmel");
        repo.save(persona);

        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/listar")
    public String greeting(Model model) {
        //logic here but should be in the service
        model.addAttribute("personas", repo.findAll());
        return "greeting";
    }

}
