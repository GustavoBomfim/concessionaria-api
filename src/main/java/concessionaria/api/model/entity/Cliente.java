package concessionaria.api.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import concessionaria.api.model.dto.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "Cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "cpfOuCnpj")
public class Cliente {
    @Id @Column(name = "cpf_cnpj", columnDefinition = "VARCHAR(12) DEFAULT 'valorpadrao'")
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


    public Cliente(ClienteDTO dto){
        this.setCpfOuCnpj(dto.getCpfOuCnpj());
        this.setNome(dto.getNome());
        this.setTelefone(dto.getTelefone());
        this.setEmail(dto.getEmail());
        this.setCompras(dto.getCompras());
        this.setUf(dto.getUf());
        this.setCidade(dto.getCidade());
        this.setCep(dto.getCep());
        this.setNumero(dto.getNumero());
        this.setComplemento(dto.getComplemento());
    }

}
