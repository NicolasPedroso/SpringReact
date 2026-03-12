package br.ufpr.sislamir.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpr.sislamir.model.Solicitante;

public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer>{
    
    Optional<Solicitante> findByEmail(String email);
    Optional<Solicitante> findByTokenConfirmacaoEmail(String token);

}