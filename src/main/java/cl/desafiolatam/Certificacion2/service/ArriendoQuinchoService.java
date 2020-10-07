package cl.desafiolatam.Certificacion2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.Certificacion2.model.dao.ArriendoQuinchoDao;
import cl.desafiolatam.Certificacion2.model.dao.DepartamentoDao;
import cl.desafiolatam.Certificacion2.model.dao.EstadoDao;
import cl.desafiolatam.Certificacion2.model.dto.ArriendoQuinchoFormDto;
import cl.desafiolatam.Certificacion2.model.entity.ArriendoQuincho;
import cl.desafiolatam.Certificacion2.model.entity.Departamento;
import cl.desafiolatam.Certificacion2.model.entity.Estado;

@Service
public class ArriendoQuinchoService {

	
	@Autowired
	private ArriendoQuinchoDao daoArriendo;
	@Autowired
	private EstadoDao daoEstado;
	@Autowired
	private DepartamentoDao daoDepartamento;
	
	public List<ArriendoQuincho> traerTodos(){
		return daoArriendo.findAll();
	}
	
	public List<ArriendoQuincho>filtrar(ArriendoQuinchoFormDto dto){
		Estado estado = daoEstado.findById(dto.getEstado_id()).orElse(null);
		Departamento departamento = daoDepartamento.findById(dto.getDepartamento_id()).orElse(null);
	return daoArriendo.findAllByFechaBetweenAndEstadoAndDepartamento(dto.getFecha_desde(), dto.getFecha_hasta(), estado, departamento);
		
	}
}
