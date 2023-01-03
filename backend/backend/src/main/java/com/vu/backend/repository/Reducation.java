
package com.vu.backend.repository;

import com.vu.backend.entity.education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Reducation extends JpaRepository<education, Integer>{
    
}
