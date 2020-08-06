package edu.unimagdalena.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.unimagdalena.demo.entities.Propietario;
import edu.unimagdalena.demo.services.personaService;

@Controller
public class IndexController {
	
	@Autowired
	private personaService servicioPersona;
	
	@GetMapping("/")
	public String index(Model modelo) {
		return "index";
	}
	
	@GetMapping("/et")
	public String index2(Model modelo) {
		return "et";
	}
	@GetMapping("/li")
	public String index3(Model modelo) {
		return "li";
	}
	@GetMapping("doc")
	public String index4(Model modelo) {
		return "/doc";
	}
}
