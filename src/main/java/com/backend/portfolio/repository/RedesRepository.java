
package com.backend.portfolio.repository;

import com.backend.portfolio.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesRepository extends JpaRepository <RedesSociales, Long>{
    
}


