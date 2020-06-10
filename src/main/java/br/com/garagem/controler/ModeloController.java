package br.com.garagem.controler;

import br.com.garagem.model.Marca;
import br.com.garagem.model.Modelo;
import br.com.garagem.service.MarcaService;
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
public class ModeloController {

    @Autowired
    private MarcaService marcaService;

    @Autowired
    private ModeloService modeloService;

    @GetMapping("/modelo")
    public String modelo(@RequestParam(defaultValue = "0") int page,
                        Model model){
        model.addAttribute("marca_id", marcaService.findOrderByNomeAsc());
        model.addAttribute("modelo", modeloService.findAll(page));
        model.addAttribute("currentPage", page);
        return "modelo";
    }

    @PostMapping("/modelo/salvar")
    public String salvar(Modelo m){
        modeloService.save(m);
        return "redirect:/modelo";
    }

    @GetMapping("/modelo/delete")
    public String delete(Integer id){
        modeloService.delete(id);
        return "redirect:/modelo";
    }

    @GetMapping("/modelo/findOne")
    @ResponseBody
    public Optional<Modelo> findOne(Integer id){
        return modeloService.findById(id);
    }

}
