package br.com.garagem.service;

import br.com.garagem.model.Fabricante;
import br.com.garagem.model.Pais;
import br.com.garagem.model.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FabricanteService {

    @Autowired
    private FabricanteRepository repository;

    public Page<Fabricante> findAll(int page) {
        Page<Fabricante> fabricante = repository.findAll(PageRequest.of(page, 5));
        return fabricante;
    }

    public List<Fabricante> findAllNoSorting(){
        List<Fabricante> fabricante = repository.findAll();
        return fabricante;
    }

    public List<Fabricante> findOrderByNomeAsc(){
        List<Fabricante> fabricante = repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return fabricante;
    }

    public Optional<Fabricante> pesquisar(int page, String pesquisa) {
        Optional<Fabricante> fabricante = repository.findByNomeLike(pesquisa);
        return fabricante;
    }

    public void save(Fabricante fabricante) {
        repository.save(fabricante);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Optional<Fabricante> findById(Integer id) {
        return repository.findById(id);
    }

}
