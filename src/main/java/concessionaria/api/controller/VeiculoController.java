package concessionaria.api.controller;

import concessionaria.api.veiculo.Veiculo;
import concessionaria.api.veiculo.VeiculoDTO;
import concessionaria.api.veiculo.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarVeiculo(@RequestBody VeiculoDTO dto){
        veiculoRepository.save(new Veiculo(dto));
    }

    @GetMapping
    public List<Veiculo> buscarVeiculos(){
        return veiculoRepository.findAll();
    }
    @GetMapping(value = "/buscarVeiculosPorId/{id}")
    public Optional<Veiculo> buscarVeiculoPorId(@PathVariable String id){
        return veiculoRepository.findById(id);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity deletarVeiculoPorId(@PathVariable String id){
        veiculoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
