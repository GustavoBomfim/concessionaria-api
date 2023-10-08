package concessionaria.api.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import concessionaria.api.model.dto.FuncionarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "funcionario")
@Entity(name = "Funcionario")
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank @Email
    private String email;
    private String compras;
    @NotNull @Column(name = "salario_base")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal salarioBase;
    @NotNull @Column(name = "percentual_comissao")
    private double percentualComissao;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @NotNull
    @Column(name = "data_contratacao") @DateTimeFormat(pattern = "yyyy-MM-dd")
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

    public Funcionario(FuncionarioDTO dto){
        this.setCpfOuCnpj(dto.getCpfOuCnpj());
        this.setNome(dto.getNome());
        this.setTelefone(dto.getTelefone());
        this.setEmail(dto.getEmail());
        this.setCompras(dto.getCompras());
        this.setSalarioBase(dto.getSalarioBase());
        this.setPercentualComissao(dto.getPercentualComissao());
        this.setCargo(dto.getCargo());
        this.setDataContratacao(dto.getDataContratacao());
        this.setUf(dto.getUf());
        this.setCidade(dto.getCidade());
        this.setCep(dto.getCep());
        this.setNumero(dto.getNumero());
        this.setComplemento(dto.getComplemento());
    }

}
