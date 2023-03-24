
package com.vu.backend.repository;

import com.vu.backend.entity.habilidadesFront;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhabilidadesFront extends JpaRepository<habilidadesFront, Integer>{
    
}
