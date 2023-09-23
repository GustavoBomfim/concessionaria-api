package concessionaria.api.controller;

import concessionaria.api.pessoa.Cliente;
import concessionaria.api.pessoa.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarCliente(@RequestBody @Valid Cliente cliente){
        if(cliente.getCpfOuCnpj() == null){
            cliente.setCpfOuCnpj("valor padrao");
        }
        clienteRepository.save(cliente);
    }

    @GetMapping()
    public List<Cliente> allClientes(){
        return clienteRepository.findAll();
    }
    @GetMapping(value = "/buscarPorId/{cpfOuCnpj}")
    public Cliente buscarClientePeloId(@PathVariable String cpfOuCnpj){
        return clienteRepository.getReferenceById(cpfOuCnpj);
    }
}
