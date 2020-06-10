package br.com.garagem.service;

import br.com.garagem.model.Marca;
import br.com.garagem.model.Modelo;
import br.com.garagem.model.Pais;
import br.com.garagem.model.repository.MarcaRepository;
import br.com.garagem.model.repository.PaisRepository;
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
public class MarcaService {

    @Autowired
    private MarcaRepository repository;

    public Page<Marca> findAll(int page){
        Page<Marca> marca = repository.findAll(PageRequest.of(page, 5));
        return marca;
    }

    public List<Marca> findAllNoSorting(){
        List<Marca> marca = repository.findAll();
        return marca;
    }

    public List<Marca> findOrderByNomeAsc(){
        List<Marca> marca = repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return marca;
    }

    public void save(Marca marca) {
        repository.save(marca);
    }

    public void delete(Integer id){ repository.deleteById(id);}

    public Optional<Marca> findById(Integer id){
        return repository.findById(id);
    }

}
