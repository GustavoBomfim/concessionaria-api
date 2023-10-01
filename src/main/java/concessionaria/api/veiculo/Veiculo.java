package concessionaria.api.veiculo;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "veiculo")
@Entity(name = "Veiculo")
@Data
@NoArgsConstructor
public class Veiculo {
    @Id
    private String chassi;
    private String placa;
    private Boolean disponivel;
    private Double preco;
    @Embedded
    private Modelo modelo;


    public Veiculo(VeiculoDTO dto){
        this.setChassi(dto.getChassi());
        this.setPlaca(dto.getPlaca());
        this.setDisponivel(dto.getDisponivel());
        this.setPreco(dto.getPreco());
        this.modelo = new Modelo(dto.getModelo()); //Todo criar um construtor na classe Modelo

    }


}
