
package com.backend.portfolio.controller;


import com.backend.portfolio.model.Experiencia;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.backend.portfolio.service.IExperienciaService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
        
public class ExperienciaController {
    
  @Autowired
  private IExperienciaService expServ;
  
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias (){
        return expServ.verExperiencias();
        
    }
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/experiencia")
    public void actualizarExperiencia (@RequestBody Experiencia exp){
        expServ.actualizarExperiencia(exp);
}
}
