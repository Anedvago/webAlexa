package edu.unimagdalena.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.unimagdalena.demo.entities.Mascota;
import edu.unimagdalena.demo.entities.Propietario;
import edu.unimagdalena.demo.services.personaService;

@RestController
public class PropietarioController {
	@Autowired
	personaService servicioPersona;
	
	@PostMapping("/crear-propietario")
	public Propietario crear(@RequestBody Propietario dueño) {
		return servicioPersona.crearPropietario(dueño);
	}
	@GetMapping("/datos-propietario/{id}")
	public Propietario getEstudiante(@PathVariable Long id) {
		Propietario propietario = servicioPersona.datosPropietario(id);
		return propietario;
	}
	
	@PostMapping("/crear-mascota/{id}")
	public Mascota crearMascota(@RequestBody Mascota mascota, @PathVariable Long id) {
		System.out.print(mascota);
		return servicioPersona.crearMascota(mascota, id);
		
	}
	
	@GetMapping("/listar-mascotas-propietario/{id}")
	public List<Mascota> mascotasPorId(@PathVariable Long id) {
		List<Mascota> mascotas = servicioPersona.listarMascotas(id);
		return mascotas;
	}
}
