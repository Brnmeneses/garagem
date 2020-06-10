package br.com.garagem.controler;

import br.com.garagem.model.Mini;
import br.com.garagem.model.Modelo;
import br.com.garagem.service.FabricanteService;
import br.com.garagem.service.MiniService;
import br.com.garagem.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class MiniController {

    @Autowired
    private FabricanteService fabricanteService;

    @Autowired
    private ModeloService modeloService;

    @Autowired
    private MiniService miniaturaService;

    @GetMapping("/miniatura")
    public String modelo(@RequestParam(defaultValue = "0") int page,
                         Model model){
        model.addAttribute("fabricante_id", fabricanteService.findOrderByNomeAsc());
        model.addAttribute("modelo_id", modeloService.findOrderByNomeAsc());
        model.addAttribute("miniatura", miniaturaService.findAll(page));
        model.addAttribute("currentPage", page);
        return "miniatura";
    }

    @PostMapping("/miniatura/salvar")
    public String salvar(Mini m){
        miniaturaService.save(m);
        return "redirect:/miniatura";
    }

    @GetMapping("/miniatura/delete")
    public String delete(Integer id){
        miniaturaService.delete(id);
        return "redirect:/miniatura";
    }

    @GetMapping("/miniatura/findOne")
    @ResponseBody
    public Optional<Mini> findOne(Integer id){
        return miniaturaService.findById(id);
    }

}
