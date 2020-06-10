package br.com.garagem.controler;

import br.com.garagem.model.Fabricante;
import br.com.garagem.model.Pais;
import br.com.garagem.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;

    @GetMapping("/fabricante")
    public String pais(@RequestParam(defaultValue = "0") int page,
                       Model model){
        model.addAttribute("fabricante", fabricanteService.findAll(page));
        model.addAttribute("currentPage", page);
        return "fabricante";
    }

    @PostMapping("/fabricante/salvar")
    public String salvar(Fabricante f){
        fabricanteService.save(f);
        return "redirect:/fabricante";
    }

    @GetMapping("/fabricante/delete")
    public String delete(Integer id){
        fabricanteService.delete(id);
        return "redirect:/fabricante";
    }

    @GetMapping("/fabricante/findOne")
    @ResponseBody
    public Optional<Fabricante> findOne(Integer id){
        return fabricanteService.findById(id);
    }
}
