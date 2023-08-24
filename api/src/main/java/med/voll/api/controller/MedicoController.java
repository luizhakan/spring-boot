package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastrar(@RequestBody String json) throws IOException {
        FileWriter escrita = new FileWriter("medico.json");
        escrita.write(json);
        escrita.close();
        System.out.println(json);
    }
}
