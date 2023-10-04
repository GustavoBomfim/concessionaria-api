package concessionaria.api.proposta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PropostaRepository extends JpaRepository<Proposta, Integer > {
}
