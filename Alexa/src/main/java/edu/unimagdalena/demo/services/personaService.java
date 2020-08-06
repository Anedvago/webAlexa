package edu.unimagdalena.demo.services;

import java.util.List;
import edu.unimagdalena.demo.entities.Mascota;
import edu.unimagdalena.demo.entities.Propietario;

public interface personaService {
	Propietario crearPropietario(Propietario dueño);
	Propietario datosPropietario(Long id);
	Mascota crearMascota(Mascota mascota, Long id);
	List<Propietario> listarPropietarios();
	List<Mascota> listarMascotas(Long id);
}
