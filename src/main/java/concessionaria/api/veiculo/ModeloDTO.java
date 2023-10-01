package concessionaria.api.veiculo;

import lombok.Data;

@Data
public class ModeloDTO {
    private String marca;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private String combustivel;
    private int portas;
    private boolean tetoSolar;
    private boolean arCondicionado;
}
