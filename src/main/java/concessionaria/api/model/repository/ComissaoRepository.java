package concessionaria.api.model.repository;

import concessionaria.api.model.entity.Comissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComissaoRepository extends JpaRepository<Comissao, Integer> {
}
