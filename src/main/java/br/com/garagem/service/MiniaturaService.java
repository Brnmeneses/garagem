package br.com.garagem.service;

import br.com.garagem.model.Miniatura;
import br.com.garagem.model.repository.MiniaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MiniaturaService {

    @Autowired
    private MiniaturaRepository repository;

    public Page<Miniatura> findAll(int page){
        Page<Miniatura> alunos = repository.findAll(PageRequest.of(page, 5));
        return alunos;
    }

    public void save(Miniatura miniatura) {
        repository.save(miniatura);
    }

    public void delete(Integer id){ repository.deleteById(id);}

    public Optional<Miniatura> findById(Integer id){
        return repository.findById(id);
    }





    /*public Optional<Miniatura> findById(Integer id){
        return repository.findById(id);
    }*/

    /*
        public Iterable<Miniatura> findAll() {
        Iterable<Miniatura> miniaturas = repository.findAll();
        return miniaturas;
    }

    public Miniatura findById(Long id) {
        Optional<Miniatura> miniaturas = repository.findById(id);
        return miniaturas.get();
    }

    public Optional<Miniatura> findByIdTeste(Long id) {
        Optional<Miniatura> miniaturas = repository.findById(id);
        return miniaturas;
    }


    public Iterable<Miniatura> find(String marca, String modelo) {

        if (marca.isEmpty() && modelo.isEmpty()) {
            Iterable<Miniatura> miniaturas = repository.findAll();
            return miniaturas;
        } else if (!marca.isEmpty() && modelo.isEmpty()) {
            Iterable<Miniatura> miniaturas = repository.findByMarca(marca);
            return miniaturas;
        } else if (marca.isEmpty() && !modelo.isEmpty()) {
            Iterable<Miniatura> miniaturas = repository.findByModelo(modelo);
            return miniaturas;
        } else {
            Iterable<Miniatura> miniaturas = repository.findByMarcaAndModelo(marca, modelo);
            return miniaturas;
        }
    }
*/

}
