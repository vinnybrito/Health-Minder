package br.com.fiap.HealthMinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.HealthMinder.model.PlanoRefeicao;

public interface PlanoRefeicaoRepository extends JpaRepository<PlanoRefeicao, Long> {
    
}
