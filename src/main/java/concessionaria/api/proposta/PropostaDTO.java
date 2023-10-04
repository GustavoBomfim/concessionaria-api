package concessionaria.api.proposta;

import concessionaria.api.pessoa.Cliente;
import concessionaria.api.pessoa.ClienteRepository;
import concessionaria.api.pessoa.Funcionario;
import concessionaria.api.veiculo.Veiculo;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class PropostaDTO {
    private String cliente;
    private Long funcionario;
    private String veiculo;
    private String statusPagamento;
}
