package concessionaria.api.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import concessionaria.api.model.entity.Cargo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class FuncionarioDTO {

    @NotBlank
    private String nome;
    @NotBlank
    @Column(name = "cpf_cnpj")
    private String cpfOuCnpj;
    @NotBlank
    private String telefone;
    @NotBlank @Email
    private String email;
    private String compras;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Double salarioBase;
    @NotNull
    private double percentualComissao;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @NotNull @DateTimeFormat(pattern = "yyyy-MM-dd")
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
