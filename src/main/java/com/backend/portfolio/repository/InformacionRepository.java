package com.backend.portfolio.repository;

import com.backend.portfolio.model.Informacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InformacionRepository extends JpaRepository <Informacion, Long>{
    Informacion findFirstByOrderByIdAsc();
            
}


