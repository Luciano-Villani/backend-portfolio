
package com.backend.portfolio.controller;



import com.backend.portfolio.service.ISoftSkillsService;
import com.backend.portfolio.model.SoftSkills;
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
        
public class SoftSkillsController {
    
  @Autowired
  private ISoftSkillsService softSkillsServ;
  
    @PostMapping ("/new/softskill")
    public void agregarSoftSkills (@RequestBody SoftSkills skills){
        softSkillsServ.crearSoftSkills(skills);
    }
    @GetMapping ("/ver/softskills")
    @ResponseBody
    public List<SoftSkills> verSoftSkills (){
        return softSkillsServ.verSoftSkills();
        
    }
    @DeleteMapping("delete/softskill/{id}")
    public void borrarSoftSkills (@PathVariable Long id){
        softSkillsServ.borrarSoftSkills(id);
        
        //agregado mio
    }
    @PutMapping ("/actualizar/softskill")
    public void actualizarHardSkills (@RequestBody SoftSkills skills){
        softSkillsServ.actualizarSoftSkills(skills);
}
}
