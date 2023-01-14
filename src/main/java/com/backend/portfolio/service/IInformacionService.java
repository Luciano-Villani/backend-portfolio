
package com.backend.portfolio.service;

import com.backend.portfolio.model.Informacion;
import java.util.List;


public interface IInformacionService {
    public List<Informacion> verInformacion();
    public void crearInformacion (Informacion inf);
    public void borrarInformacion (Long id);
    public Informacion buscarInformacion (Long id);
    public Informacion verInformacion1 ();
    //agregado 
    public void actualizarInformacion (Informacion inf);
}

