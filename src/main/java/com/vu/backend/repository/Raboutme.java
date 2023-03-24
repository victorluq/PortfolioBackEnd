
package com.vu.backend.repository;

import com.vu.backend.entity.aboutme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Raboutme extends JpaRepository<aboutme, Integer>{
    
}
