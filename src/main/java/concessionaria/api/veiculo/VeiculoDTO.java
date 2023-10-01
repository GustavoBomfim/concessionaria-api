package concessionaria.api.veiculo;

import lombok.Data;

@Data
public class VeiculoDTO {
    private String chassi;
    private String placa;
    private Boolean disponivel;
    private Double preco;
    private ModeloDTO modelo;
}
