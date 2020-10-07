package cl.desafiolatam.Certificacion2.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.Certificacion2.model.entity.Departamento;

public interface DepartamentoDao extends JpaRepository<Departamento, Integer>{

}
