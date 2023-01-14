package com.backend.portfolio.service;

import com.backend.portfolio.model.HardSkills;
import java.util.List;


public interface IHardSkillsService {
    public List<HardSkills> verHardSkills();
    public void crearHardSkills (HardSkills skill);
    public void borrarHardSkills (Long id);
    public HardSkills buscarHardSkills (Long id);
    //agregado 
    public void actualizarHardSkills (HardSkills skill);
}
