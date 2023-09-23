package concessionaria.api.controller;

import concessionaria.api.pessoa.Funcionario;
import concessionaria.api.pessoa.FuncionarioDTO;
import concessionaria.api.pessoa.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarFuncionario(@RequestBody  FuncionarioDTO dto){
        Funcionario funcionario = new Funcionario(dto);
        funcionarioRepository.save(funcionario);
    }
}
