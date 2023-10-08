package concessionaria.api.model.dto;

import concessionaria.api.model.entity.Funcionario;
import lombok.Data;

@Data
public class PropostaDTO {
    private String cliente;
    private Funcionario funcionario;
    private String veiculo;
    private String statusPagamento;
}
