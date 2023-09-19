package concessionaria.api.proposta;

import ch.qos.logback.core.net.server.Client;
import concessionaria.api.pessoa.Cliente;
import concessionaria.api.pessoa.Funcionario;
import concessionaria.api.veiculo.Veiculo;

public class Proposta {
    private int id;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;
    private String statusPagamento;
}
