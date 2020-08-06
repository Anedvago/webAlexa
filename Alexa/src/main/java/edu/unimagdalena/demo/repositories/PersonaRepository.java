package edu.unimagdalena.demo.repositories;

import java.awt.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unimagdalena.demo.entities.Propietario;
@Repository
public interface PersonaRepository  extends JpaRepository<Propietario, Long>{
	
}
