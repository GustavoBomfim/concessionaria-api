package concessionaria.api.model.entity;

import concessionaria.api.model.dto.ModeloDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class Modelo {
    private String marca;
    private String cor;
    @Column(name = "ano_fabricacao")
    private int anoFabricacao;
    @Column(name = "ano_modelo")
    private int anoModelo;
    private String combustivel;
    private int portas;
    @Column(name = "teto_solar")
    private boolean tetoSolar;
    @Column(name = "ar_condicionado")
    private boolean arCondicionado;


    public Modelo(ModeloDTO dto){
        this.setMarca(dto.getMarca());
        this.setCor(dto.getCor());
        this.setAnoFabricacao(dto.getAnoFabricacao());
        this.setAnoModelo(dto.getAnoModelo());
        this.setCombustivel(dto.getCombustivel());
        this.setPortas(dto.getPortas());
        this.setTetoSolar(dto.isTetoSolar());
        this.setArCondicionado(dto.isArCondicionado());
    }

}
