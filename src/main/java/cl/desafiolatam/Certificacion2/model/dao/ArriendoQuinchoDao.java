package cl.desafiolatam.Certificacion2.model.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.desafiolatam.Certificacion2.model.entity.ArriendoQuincho;
import cl.desafiolatam.Certificacion2.model.entity.Departamento;
import cl.desafiolatam.Certificacion2.model.entity.Estado;

public interface ArriendoQuinchoDao extends JpaRepository<ArriendoQuincho, Integer> {
    List<ArriendoQuincho> findAllByFechaBetweenAndEstadoAndDepartamento(
            Date desde, 
            Date hasta, 
            Estado estado,
            Departamento departamento
        );
}
