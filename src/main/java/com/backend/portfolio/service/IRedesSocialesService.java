
package com.backend.portfolio.service;

import com.backend.portfolio.model.RedesSociales;
import java.util.List;


public interface IRedesSocialesService {
    public List<RedesSociales> verRedes();
    public void crearRedes (RedesSociales red);
    public void borrarRedes (Long id);
    public RedesSociales buscarRedes (Long id);
    //agregado 
    public void actualizarRedes (RedesSociales red);
}
