package concessionaria.api.model.dto;

import lombok.Data;

@Data
public class PropostaDTO {
    private String cliente;
    private Long funcionario;
    private String veiculo;
    private String statusPagamento;
}
