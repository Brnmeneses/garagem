package br.com.garagem.controler;

import br.com.garagem.model.Miniatura;
import br.com.garagem.model.Pais;
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
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/pais")
    public String pais(@RequestParam(defaultValue = "0") int page,
                          Model model){
        model.addAttribute("pais", paisService.findAll(page));
        model.addAttribute("currentPage", page);
        return "pais";
    }

    @PostMapping("/pais/salvar")
    public String salvar(Pais p){
        paisService.save(p);
        return "redirect:/pais";
    }

    @GetMapping("/pais/delete")
    public String delete(Integer id){
        paisService.delete(id);
        return "redirect:/pais";
    }

    @GetMapping("/pais/findOne")
    @ResponseBody
    public Optional<Pais> findOne(Integer id){
        return paisService.findById(id);
    }

}
