

package com.backend.portfolio.service;

import com.backend.portfolio.model.HardSkills;
import com.backend.portfolio.repository.HardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HardSkillsService implements IHardSkillsService{
    
    @Autowired
    public HardSkillsRepository hardSkillsRepo;
    
    @Override
    public List<HardSkills> verHardSkills() {
       return hardSkillsRepo.findAll();
    }

    @Override
    public void crearHardSkills(HardSkills skill) {
        hardSkillsRepo.save(skill);
    }

    @Override
    public void borrarHardSkills(Long id) {
       hardSkillsRepo.deleteById(id);
   }

    @Override
    public HardSkills buscarHardSkills(Long id) {
        return hardSkillsRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarHardSkills(HardSkills skill) {
        hardSkillsRepo.save(skill);
    }

  
}
