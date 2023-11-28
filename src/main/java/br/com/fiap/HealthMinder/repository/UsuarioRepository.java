package br.com.fiap.HealthMinder.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.HealthMinder.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Page<Usuario> findByTipoSanguineoContainingIgnoreCase(String busca, Pageable pageRequest);

}
