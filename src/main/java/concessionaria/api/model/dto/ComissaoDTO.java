package concessionaria.api.model.dto;

import concessionaria.api.model.entity.Funcionario;
import lombok.Data;

@Data
public class ComissaoDTO {
    private int id;
    private int proposta;
    private Funcionario funcionario;
}
