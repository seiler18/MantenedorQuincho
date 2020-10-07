package cl.desafiolatam.Certificacion2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.Certificacion2.model.dao.DepartamentoDao;
import cl.desafiolatam.Certificacion2.model.entity.Departamento;

@Service
public class DepartamentoService {

	
	@Autowired
	private DepartamentoDao dao;
	@Transactional(readOnly = true)
	public List<Departamento> traerTodos(){
		return dao.findAll();
	}
}
