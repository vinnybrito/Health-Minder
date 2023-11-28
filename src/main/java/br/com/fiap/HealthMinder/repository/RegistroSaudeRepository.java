package br.com.fiap.HealthMinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.HealthMinder.model.RegistroSaude;

public interface RegistroSaudeRepository extends JpaRepository<RegistroSaude, Long> {
    
}
