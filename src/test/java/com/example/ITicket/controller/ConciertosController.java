
package com.example.ITicket.controller;
import com.example.ITicket.entity.Concierto;
import com.example.ITicket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConciertosController {
    @Autowired
    
    private IConciertoService conciertoService;
    
    @GetMapping("/Conciertos")
    public String index(Model model){
    List<Concierto> listaConciertos=conciertoService.getAllConcierto();
    model.addAttribute("titulo","Conciertos");
    model.addAttribute("conciertos", listaConciertos);
    return "conciertos";
    }
    
    @GetMapping("/conciertosN")
    public String crearConcierto(Model model){
    model.addAttribute("concierto",new Concierto());
    //conciertoService.saveConcierto(concierto);
    return "crear";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(Concierto concierto){
    conciertoService.saveConcierto(concierto);
    return "redirect:/concierto";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto){
    conciertoService.delete(idConcierto);
    return "redirect:/concierto";
    }
}
