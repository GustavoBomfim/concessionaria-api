package concessionaria.api.model.repository;

import concessionaria.api.model.entity.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta, Integer > {
}
