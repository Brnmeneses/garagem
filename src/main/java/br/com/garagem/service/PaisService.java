package br.com.garagem.service;

import br.com.garagem.model.Miniatura;
import br.com.garagem.model.Pais;
import br.com.garagem.model.repository.MiniaturaRepository;
import br.com.garagem.model.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaisService {

    @Autowired
    private PaisRepository repository;

    public Page<Pais> findAll(int page){
        Page<Pais> pais = repository.findAll(PageRequest.of(page, 5));
        return pais;
    }

    public List<Pais> findAllNoSorting(){
        List<Pais> pais = repository.findAll();
        return pais;
    }

    public void save(Pais pais) {
        repository.save(pais);
    }

    public void delete(Integer id){ repository.deleteById(id);}

    public Optional<Pais> findById(Integer id){
        return repository.findById(id);
    }

}
