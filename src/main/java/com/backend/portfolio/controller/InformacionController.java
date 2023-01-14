
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Informacion;
import com.backend.portfolio.service.IInformacionService;
import java.util.List;
//import static org.hibernate.criterion.Projections.id;
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
        

public class InformacionController {
    
  @Autowired
  private IInformacionService infoServ;
  
  
    @PostMapping ("/new/informacion")
    public void agregarInformacion (@RequestBody Informacion infos){
        
        infoServ.crearInformacion(infos);
    }
    @GetMapping ("/ver/informacion")
    @ResponseBody
    public List<Informacion> verInformacion (){
        return infoServ.verInformacion();
        
    }
    @DeleteMapping("/delete/informacion/{id}")
    public void borrarInformacion (@PathVariable Long id){
        infoServ.borrarInformacion(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/informacion")
    public void actualizarInformacion (@RequestBody Informacion infos){
        infoServ.actualizarInformacion(infos);
        
    }  //agregado mio  
    @GetMapping ("/ver/informacion1")
    @ResponseBody  
     public Informacion verInformacion1 (){
        return infoServ.verInformacion1 ();
        
    }
}

