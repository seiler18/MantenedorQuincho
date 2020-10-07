package cl.desafiolatam.Certificacion2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.desafiolatam.Certificacion2.model.dto.ArriendoQuinchoFormDto;
import cl.desafiolatam.Certificacion2.service.ArriendoQuinchoService;
import cl.desafiolatam.Certificacion2.service.DepartamentoService;
import cl.desafiolatam.Certificacion2.service.EstadoService;

@Controller

@RequestMapping("/")
public class ArriendoQuinchoController {
	@Autowired
	private ArriendoQuinchoService serviceArriendo;
	@Autowired
	private DepartamentoService serviceDepartamento;
	@Autowired
	private EstadoService serviceEstado;

	@GetMapping
	public String home(ModelMap mapa) {
		mapa.put("arriendos",serviceArriendo.traerTodos());
		mapa.put("estados",serviceEstado.traerTodos());
		mapa.put("departamentos",serviceDepartamento.traerTodos());
		return "home";
		
	}
	
	
	@PostMapping
	public String filtrar(ModelMap mapa,@ModelAttribute ArriendoQuinchoFormDto dto) {
		mapa.put("arriendos",serviceArriendo.filtrar(dto));
		mapa.put("estados",serviceEstado.traerTodos());
		mapa.put("departamentos",serviceDepartamento.traerTodos());
		return "home";
		
	}
}
