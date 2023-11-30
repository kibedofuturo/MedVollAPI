package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @RequestMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println("Dados dos pacientes: " + dados);
    }
}
