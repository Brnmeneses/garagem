package br.com.garagem.model.repository;

import br.com.garagem.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {

    Optional<Fabricante> findByNomeLike(@Param("nome") String pesquisa);

}
