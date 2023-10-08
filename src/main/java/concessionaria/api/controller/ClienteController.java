package concessionaria.api.controller;

import concessionaria.api.model.entity.Cliente;
import concessionaria.api.model.dto.ClienteDTO;
import concessionaria.api.model.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity cadastrarCliente(@RequestBody @Valid ClienteDTO clienteDTO){
        return ResponseEntity.ok(clienteRepository.save(new Cliente(clienteDTO)));
    }

    @GetMapping()
    public List<Cliente> allClientes(){
        return clienteRepository.findAll();
    }
    @GetMapping(value = "/buscarPorId/{cpfOuCnpj}")
    public Cliente buscarClientePeloId(@PathVariable String cpfOuCnpj){
        return clienteRepository.getReferenceById(cpfOuCnpj);
    }
    @DeleteMapping("/{cpfOuCnpj}")
    public ResponseEntity deletarClientePeloId(@PathVariable String cpfOuCnpj){
        clienteRepository.deleteById(cpfOuCnpj);
        return ResponseEntity.noContent().build();
    }
}
