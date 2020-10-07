package cl.desafiolatam.Certificacion2.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.Certificacion2.model.dto.ArriendoQuinchoFormDto;
import cl.desafiolatam.Certificacion2.model.entity.ArriendoQuincho;
import cl.desafiolatam.Certificacion2.service.ArriendoQuinchoService;


@RestController
@RequestMapping("/api/v1/arriendo-quincho")
public class ArriendoQuinchoApi {
	@Autowired
	private ArriendoQuinchoService serviceArriendo;


	@GetMapping
	public List<ArriendoQuincho> todos(ModelMap mapa) {
	
		return serviceArriendo.traerTodos();
		
	}
	
	
	@PostMapping
	public List<ArriendoQuincho>filtra(ModelMap mapa,@RequestBody ArriendoQuinchoFormDto dto) {

	return serviceArriendo.filtrar(dto);
		
	}
}
