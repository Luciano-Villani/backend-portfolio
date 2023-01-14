
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectosRepository  extends JpaRepository <Proyectos, Long>{
    
}
