package br.com.garagem.controler;

import br.com.garagem.model.Marca;
import br.com.garagem.model.Pais;
import br.com.garagem.service.MarcaService;
import br.com.garagem.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class MarcaController {

    @Autowired
    private PaisService paisService;

    @Autowired
    private MarcaService marcaService;

    @GetMapping("/marca")
    public String marca(@RequestParam(defaultValue = "0") int page,
                          Model model){
        model.addAttribute("pais_opt", paisService.findAllNoSorting());
        model.addAttribute("marca", marcaService.findAll(page));
        model.addAttribute("currentPage", page);
        return "marca";
    }

    @PostMapping("/marca/salvar")
    public String salvar(Marca m){
        marcaService.save(m);
        return "redirect:/marca";
    }

    @GetMapping("/marca/delete")
    public String delete(Integer id){
        marcaService.delete(id);
        return "redirect:/marca";
    }

    @GetMapping("/marca/findOne")
    @ResponseBody
    public Optional<Marca> findOne(Integer id){
        return marcaService.findById(id);
    }

}
