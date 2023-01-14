

package com.backend.portfolio.service;

import com.backend.portfolio.model.Proyectos;
import com.backend.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProyectosService implements IProyectosService{
    
    @Autowired
    public ProyectosRepository proyeRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
       return proyeRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos pro) {
        proyeRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarProyecto(Proyectos pro) {
        proyeRepo.save(pro);
    }

  
}
