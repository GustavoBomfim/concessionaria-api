package concessionaria.api.controller;

import concessionaria.api.veiculo.Veiculo;
import concessionaria.api.veiculo.VeiculoDTO;
import concessionaria.api.veiculo.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;

    @PostMapping(value = "/cadastrar")
    public void cadastrarVeiculo(@RequestBody VeiculoDTO dto){
        veiculoRepository.save(new Veiculo(dto));
    }
}
