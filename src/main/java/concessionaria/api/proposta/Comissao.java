package concessionaria.api.proposta;

import concessionaria.api.pessoa.Funcionario;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "comissao")
@Entity(name = "Comissao")
public class Comissao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "FK_id_proposta")
    private int proposta;
    @Column(name = "FK_id_funcionario")
    private Long funcionario;

    public Comissao(ComissaoDTO dto){
        this.setProposta(dto.getProposta());
        this.setFuncionario(dto.getFuncionario());
    }
}
