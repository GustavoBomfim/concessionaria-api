package concessionaria.api.controller;

import concessionaria.api.pessoa.ClienteRepository;
import concessionaria.api.proposta.Proposta;
import concessionaria.api.proposta.PropostaDTO;
import concessionaria.api.proposta.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/proposta")
public class PropostaController {
    @Autowired
    PropostaRepository propostaRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarProposta(@RequestBody PropostaDTO dto){
        propostaRepository.save(new Proposta(dto));
    }

    @GetMapping()
    public List<Proposta> buscarPropostas(){
        return propostaRepository.findAll();
    }
    @GetMapping(value = "/buscarPorId/{id}")
    public Optional<Proposta> buscarPropostaPorId(@PathVariable Integer id){
        return propostaRepository.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deletarPropostaPorId(@PathVariable Integer id){
        propostaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
