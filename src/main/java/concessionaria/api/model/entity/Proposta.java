package concessionaria.api.model.entity;

import concessionaria.api.model.dto.PropostaDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proposta")
@Table(name = "proposta")
public class Proposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "FK_cpf_cnpj")
    private String cliente;
    //@Column(name = "FK_id_funcionario")
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "FK_id_funcionario")
    private Funcionario funcionario;
    @Column(name = "chassi")
    private String veiculo;
    @Column(name = "status_pagamento")
    private String statusPagamento;

    public Proposta(PropostaDTO dto){
        this.setCliente(dto.getCliente());
        this.setFuncionario(dto.getFuncionario());
        this.setVeiculo(dto.getVeiculo());
        this.setStatusPagamento(dto.getStatusPagamento());
    }

}
