package concessionaria.api.controller;

import concessionaria.api.proposta.Comissao;
import concessionaria.api.proposta.ComissaoDTO;
import concessionaria.api.proposta.ComissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/comissao")
public class ComissaoController {

    @Autowired
    ComissaoRepository comissaoRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrar(@RequestBody ComissaoDTO comissaoDTO){
        comissaoRepository.save(new Comissao(comissaoDTO));
    }

    @GetMapping()
    public List<Comissao> buscarComissoes(){
        return comissaoRepository.findAll();
    }

    @GetMapping(value = "/buscarPorId/{id}")
    public Optional<Comissao> buscarComissaoPorId(@PathVariable Integer id){
        return comissaoRepository.findById(id);
    }

    @DeleteMapping("/deletarPorId/{id}")
    public ResponseEntity<Comissao> deletarComissaoPorId(@PathVariable Integer id){
        comissaoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
