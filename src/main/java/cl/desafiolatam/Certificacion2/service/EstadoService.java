package cl.desafiolatam.Certificacion2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.desafiolatam.Certificacion2.model.dao.EstadoDao;
import cl.desafiolatam.Certificacion2.model.entity.Estado;

@Service
public class EstadoService {
	
@Autowired
private EstadoDao dao;

@Transactional(readOnly = true)
public List<Estado> traerTodos(){
	return dao.findAll();
}

}
