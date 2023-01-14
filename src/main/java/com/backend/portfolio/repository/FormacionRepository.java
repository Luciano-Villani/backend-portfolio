
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface FormacionRepository  extends JpaRepository <Formacion, Long>{
    
}