
package com.vu.backend.repository;

import com.vu.backend.entity.habilidadesBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhabilidadesBack extends JpaRepository<habilidadesBack, Integer>{
    
}
