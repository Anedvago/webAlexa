package edu.unimagdalena.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unimagdalena.demo.entities.Mascota;
import edu.unimagdalena.demo.entities.Propietario;
import edu.unimagdalena.demo.repositories.MascotaRepository;
import edu.unimagdalena.demo.repositories.PersonaRepository;

@Service
public class personaServiceImp implements personaService{
	@Autowired
	PersonaRepository personaRepositorio;
	@Autowired
	MascotaRepository mascotaRepositorio;

	@Override
	public Propietario crearPropietario(Propietario dueño) {
		return personaRepositorio.save(dueño);
	}

	@Override
	public Propietario datosPropietario(Long id) {
		Propietario propietario = personaRepositorio.getOne(id);
		return propietario;
	}

	@Override
	public Mascota crearMascota(Mascota mascota, Long id) {
		Propietario  propietario = personaRepositorio.getOne(id);
		if(propietario != null) {
			mascota.setPropietario(propietario);
			mascotaRepositorio.save(mascota);
			return mascota;
		}	
		return  null;
	}

	@Override
	public List<Propietario> listarPropietarios() {
		return personaRepositorio.findAll();
	}

	@Override
	public List<Mascota> listarMascotas(Long id) {
		// TODO Auto-generated method stub
		return mascotaRepositorio.findMascotaByPropietarioId(id);
	}

}
