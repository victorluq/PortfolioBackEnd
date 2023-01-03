
package com.vu.backend.repository;

import com.vu.backend.entity.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Rproyectos extends JpaRepository<proyectos, Integer> {
    
}
