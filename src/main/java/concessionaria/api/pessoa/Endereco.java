package concessionaria.api.pessoa;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Endereco {
    @NotBlank
    private String uf;
    @NotBlank
    private String cidade;
    @NotBlank
    private String cep;
    @NotBlank
    private String numero;
    private String complemento;
}
