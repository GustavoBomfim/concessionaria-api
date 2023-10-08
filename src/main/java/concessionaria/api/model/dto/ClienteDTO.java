package concessionaria.api.model.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteDTO {
    @NotBlank
    private String cpfOuCnpj;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    @Email
    private String email;
    private String compras;
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
