package med.voll.api.controller;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import med.voll.api.medico.DadosCadastroMedico;
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
    public void cadastrar(@RequestBody DadosCadastroMedico dados) throws IOException {
        System.out.printf("NOME: %s\n", dados.nome());
        System.out.printf("EMAIL: %s\n", dados.email());
        System.out.printf("CRM: %s\n", dados.crm());
        System.out.printf("ENDEREÇO: %s, %s, %s, %s - %s - %s",
                dados.endereco().logradouro(), dados.endereco().numero(),
                dados.endereco().bairro(),
                dados.endereco().cidade(), dados.endereco().uf(),
                dados.endereco());

    }
}
