package cl.desafiolatam.Certificacion2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Departamento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer numero;
}
