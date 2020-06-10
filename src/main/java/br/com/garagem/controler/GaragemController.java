package br.com.garagem.controler;

import br.com.garagem.model.Miniatura;
import br.com.garagem.service.MarcaService;
import br.com.garagem.service.MiniaturaService;
import br.com.garagem.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class GaragemController {

    @Autowired
    private MiniaturaService miniaturaService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/garagem")
    public String garagem(@RequestParam(defaultValue = "0") int page,
                        Model model){
        model.addAttribute("data", miniaturaService.findAll(page));
        model.addAttribute("currentPage", page);
        return "garagem";
    }

    @PostMapping("/save")
    public String save(Miniatura a){
        miniaturaService.save(a);
        return "redirect:/garagem";
    }

    @GetMapping("/delete")
    public String delete(Integer id){
        miniaturaService.delete(id);
        return "redirect:/garagem";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Miniatura> findOne(Integer id){
        return miniaturaService.findById(id);
    }

}
