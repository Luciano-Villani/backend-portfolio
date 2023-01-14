

package com.backend.portfolio.service;

import com.backend.portfolio.model.SoftSkills;
import com.backend.portfolio.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SoftSkillsService implements ISoftSkillsService{
    
    @Autowired
    public SoftSkillsRepository softSkillsRepo;
    
    @Override
    public List<SoftSkills> verSoftSkills() {
       return softSkillsRepo.findAll();
    }

    @Override
    public void crearSoftSkills(SoftSkills skill) {
        softSkillsRepo.save(skill);
    }

    @Override
    public void borrarSoftSkills(Long id) {
       softSkillsRepo.deleteById(id);
   }

    @Override
    public SoftSkills buscarSoftSkills(Long id) {
        return softSkillsRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarSoftSkills(SoftSkills skill) {
        softSkillsRepo.save(skill);
    }

  
}
