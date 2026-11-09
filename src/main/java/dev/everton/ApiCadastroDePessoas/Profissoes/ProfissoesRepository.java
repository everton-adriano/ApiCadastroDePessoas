package dev.everton.ApiCadastroDePessoas.Profissoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissoesRepository extends JpaRepository<ProfissoesModel, Long> {
    
}
