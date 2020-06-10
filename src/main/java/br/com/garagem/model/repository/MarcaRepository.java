package br.com.garagem.model.repository;

import br.com.garagem.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
