package com.backend.portfolio.controller;

import com.backend.portfolio.model.RedesSociales;
import com.backend.portfolio.service.IRedesSocialesService;
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
        
public class RedesController {
    
    
    
  @Autowired
  private IRedesSocialesService redesServ;
  
  
    @PostMapping ("/new/red")
    public void agregarRedes (@RequestBody RedesSociales reds){
        
        redesServ.crearRedes(reds);
    }
    @GetMapping ("/ver/redes")
    @ResponseBody
    public List<RedesSociales> verRedes (){
        return redesServ.verRedes();
        
    }
    @DeleteMapping("delete/redes/{id}")
    public void borrarRedes (@PathVariable Long id){
        redesServ.borrarRedes(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/red")
    public void actualizarRedes (@RequestBody RedesSociales reds){
        redesServ.actualizarRedes(reds);
}
}
