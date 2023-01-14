
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    //agregado 
    public void actualizarExperiencia (Experiencia exp);
}
