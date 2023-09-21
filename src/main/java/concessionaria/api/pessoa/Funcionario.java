package concessionaria.api.pessoa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "funcionario")
@Entity(name = "Funcionario")
@Data
@EqualsAndHashCode(of = "id")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank @Email
    private String email;
    private String compras;
    @NotBlank @Column(name = "salario_base")
    private BigDecimal salarioBase;
    @NotBlank @Column(name = "percentual_comissao")
    private double percentualComissao;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @NotBlank @Column(name = "data_contratacao")
    private Date dataContratacao;
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
