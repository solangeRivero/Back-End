package com.portfolio.rs.Repository;

import com.portfolio.rs.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 @Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
