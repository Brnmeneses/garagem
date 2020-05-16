package br.com.garagem;

import br.com.garagem.model.Miniatura;
import br.com.garagem.model.repository.MiniaturaRepository;
import br.com.garagem.service.MiniaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GaragemApplication implements CommandLineRunner {

	@Autowired
	private MiniaturaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(GaragemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		repository.deleteAll();
		repository.save(new Miniatura("CHEVROLET", "CORSA"));
		repository.save(new Miniatura("CHEVROLET", "CELTA"));
		repository.save(new Miniatura("CHEVROLET", "ONIX"));
		repository.save(new Miniatura("CHEVROLET", "S-10"));
		repository.save(new Miniatura("CHEVROLET", "OMEGA"));
		repository.save(new Miniatura("CHEVROLET", "TRACKER"));
		repository.save(new Miniatura("FIAT", "TORO"));
		repository.save(new Miniatura("FIAT", "STRADA"));
		repository.save(new Miniatura("FIAT", "FREEMONT"));
		repository.save(new Miniatura("FIAT", "PUNTO"));
		repository.save(new Miniatura("FIAT", "SIENA"));
		repository.save(new Miniatura("FIAT", "UNO"));
		repository.save(new Miniatura("VOLKSWAGEN", "FUSCA"));
		repository.save(new Miniatura("VOLKSWAGEN", "BRASILIA"));
		repository.save(new Miniatura("VOLKSWAGEN", "VARIANT"));
		repository.save(new Miniatura("VOLKSWAGEN", "VOYAGE"));
		repository.save(new Miniatura("VOLKSWAGEN", "POLO"));
		repository.save(new Miniatura("VOLKSWAGEN", "GOL"));
		repository.save(new Miniatura("VOLKSWAGEN", "FOX"));
		repository.save(new Miniatura("VOLKSWAGEN", "UP"));
		repository.save(new Miniatura("FORD", "FOCUS"));
		repository.save(new Miniatura("FORD", "ESCORT"));
		repository.save(new Miniatura("FORD", "DEL-REY"));
		repository.save(new Miniatura("FORD", "RANGER"));
		repository.save(new Miniatura("FORD", "F-250"));
		repository.save(new Miniatura("FORD", "KA"));
		repository.save(new Miniatura("FORD", "ECOSPORT"));
		repository.save(new Miniatura("FORD", "FIESTA"));
		repository.save(new Miniatura("RENAULT", "SANDERO"));
		repository.save(new Miniatura("RENAULT", "LOGAN"));
		repository.save(new Miniatura("RENAULT", "CLIO"));
		repository.save(new Miniatura("HYUNDAI", "HB20"));
		repository.save(new Miniatura("HYUNDAI", "I30"));
		repository.save(new Miniatura("HYUNDAI", "TUCSON"));
		repository.save(new Miniatura("TOYOTA", "COROLLA"));
		repository.save(new Miniatura("TOYOTA", "HILUX"));
		repository.save(new Miniatura("TOYOTA", "ETIOS"));
		*/
	}
}
