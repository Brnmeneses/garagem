package br.com.garagem.service;

import br.com.garagem.model.Fabricante;
import br.com.garagem.model.Modelo;
import br.com.garagem.model.repository.ModeloRepository;
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
public class ModeloService {

    @Autowired
    private ModeloRepository repository;

    public Page<Modelo> findAll(int page){
        Page<Modelo> modelo = repository.findAll(PageRequest.of(page, 5));
        return modelo;
    }

    public List<Modelo> findAllNoSorting(){
        List<Modelo> modelo = repository.findAll();
        return modelo;
    }

    public List<Modelo> findOrderByNomeAsc(){
        List<Modelo> modelo = repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        return modelo;
    }

    public void save(Modelo modelo) {
        repository.save(modelo);
    }

    public void delete(Integer id){ repository.deleteById(id);}

    public Optional<Modelo> findById(Integer id){
        return repository.findById(id);
    }

}
