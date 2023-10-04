package concessionaria.api.controller;

import concessionaria.api.pessoa.Funcionario;
import concessionaria.api.pessoa.FuncionarioDTO;
import concessionaria.api.pessoa.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping()
    public List<Funcionario> buscarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    @GetMapping(value = "/buscarPorId/{id}")
    public Funcionario buscarFuncionarioPorId(@PathVariable Long id){
        return funcionarioRepository.getReferenceById(id);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Funcionario> deletarFuncionarioPorId(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
