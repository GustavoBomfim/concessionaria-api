package concessionaria.api.pessoa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "cliente")
@Entity(name = "Cliente")
@Data
@EqualsAndHashCode(of = "cpfOuCnpj")
public class Cliente {
    @Id @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    @Email
    private String email;
    private String compras;
    @Embedded
    private Endereco endereco;
}
