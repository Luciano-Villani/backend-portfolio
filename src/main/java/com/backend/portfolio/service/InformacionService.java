package com.backend.portfolio.service;

import com.backend.portfolio.model.Informacion;
import com.backend.portfolio.repository.InformacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InformacionService implements IInformacionService{
    
    @Autowired
    public InformacionRepository infoRepo;
    
    @Override
    public List<Informacion> verInformacion() {
       return infoRepo.findAll();
    }

    @Override
    public void crearInformacion(Informacion inf) {
        infoRepo.save(inf);
    }

    @Override
    public void borrarInformacion(Long id) {
        infoRepo.deleteById(id);
    }

    @Override
    public Informacion buscarInformacion(Long id) {
        return infoRepo.findById(id).orElse(null);
       
    }
    
    //agregado
    @Override
    public void actualizarInformacion(Informacion inf) {
        infoRepo.save(inf);
    }
//agregado
    @Override
    public Informacion verInformacion1() {
        return infoRepo.findFirstByOrderByIdAsc();
    }
  
}
