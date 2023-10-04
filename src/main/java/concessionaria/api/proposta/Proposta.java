package concessionaria.api.proposta;

import concessionaria.api.controller.ClienteController;
import concessionaria.api.controller.FuncionarioController;
import concessionaria.api.controller.VeiculoController;
import concessionaria.api.pessoa.Cliente;
import concessionaria.api.pessoa.Funcionario;
import concessionaria.api.veiculo.Veiculo;
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
    @Column(name = "FK_id_funcionario")
    private Long funcionario;
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

    public Cliente encontrarClientePorId(String id){
        ClienteController clienteController = new ClienteController();
        return clienteController.buscarClientePeloId(id);
    }

    public Funcionario encontrarFuncionarioPorId(Long id){
        FuncionarioController controller = new FuncionarioController();
        return controller.buscarFuncionarioPorId(id);
    }

    public Veiculo encontrarVeiculoPorId(String id){
        VeiculoController controller = new VeiculoController();
        return controller.buscarVeiculoPorId(id);
    }
}
