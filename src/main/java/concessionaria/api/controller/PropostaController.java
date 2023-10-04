package concessionaria.api.controller;

import concessionaria.api.pessoa.ClienteRepository;
import concessionaria.api.proposta.Proposta;
import concessionaria.api.proposta.PropostaDTO;
import concessionaria.api.proposta.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/proposta")
public class PropostaController {
    @Autowired
    PropostaRepository propostaRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarProposta(@RequestBody PropostaDTO dto){
        propostaRepository.save(new Proposta(dto));
    }
}
