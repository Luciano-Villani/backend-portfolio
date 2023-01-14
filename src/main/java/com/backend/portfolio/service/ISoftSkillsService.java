package com.backend.portfolio.service;

import com.backend.portfolio.model.SoftSkills;
import java.util.List;


public interface ISoftSkillsService {
    public List<SoftSkills> verSoftSkills();
    public void crearSoftSkills (SoftSkills skill);
    public void borrarSoftSkills (Long id);
    public SoftSkills buscarSoftSkills (Long id);
    //agregado 
    public void actualizarSoftSkills (SoftSkills skill);
}
