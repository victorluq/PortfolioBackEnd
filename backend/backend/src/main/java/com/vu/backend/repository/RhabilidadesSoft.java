
package com.vu.backend.repository;

import com.vu.backend.entity.habilidadesSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RhabilidadesSoft extends JpaRepository<habilidadesSoft, Integer>{
   
    
}
