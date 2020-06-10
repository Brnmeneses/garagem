package br.com.garagem.service;

import br.com.garagem.model.Mini;
import br.com.garagem.model.repository.MiniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MiniService {

    @Autowired
    private MiniRepository repository;

    public Page<Mini> findAll(int page){
        Page<Mini> mini = repository.findAll(PageRequest.of(page, 10));
        return mini;
    }

    public void save(Mini mini) {
        repository.save(mini);
    }

    public void delete(Integer id){ repository.deleteById(id);}

    public Optional<Mini> findById(Integer id){
        return repository.findById(id);
    }

}
