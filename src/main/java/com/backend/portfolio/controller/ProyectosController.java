
package com.backend.portfolio.controller;



import com.backend.portfolio.model.Proyectos;
import com.backend.portfolio.service.IProyectosService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
        
public class ProyectosController {
    
  @Autowired
  private IProyectosService proyeServ;
  
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyectos proye){
        proyeServ.crearProyecto(proye);
    }
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos (){
        return proyeServ.verProyectos();
        
    }
    @DeleteMapping("delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyeServ.borrarProyecto(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/proyecto")
    public void actualizarProyecto (@RequestBody Proyectos proye){
        proyeServ.actualizarProyecto(proye);
}
}
