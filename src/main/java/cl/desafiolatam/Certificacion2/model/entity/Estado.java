package cl.desafiolatam.Certificacion2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="sq_estado", initialValue=1, allocationSize=1,sequenceName = "sq_estado")
public class Estado {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq_estado")
	private Integer id;
	private String descripcion;
}
