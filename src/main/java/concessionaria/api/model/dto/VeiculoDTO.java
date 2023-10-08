package concessionaria.api.model.dto;

import concessionaria.api.model.dto.ModeloDTO;
import lombok.Data;

@Data
public class VeiculoDTO {
    private String chassi;
    private String placa;
    private Boolean disponivel;
    private Double preco;
    private ModeloDTO modelo;
}
