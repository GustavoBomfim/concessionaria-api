package concessionaria.api.proposta;

import lombok.Data;

@Data
public class ComissaoDTO {
    private int id;
    private int proposta;
    private Long funcionario;
}
