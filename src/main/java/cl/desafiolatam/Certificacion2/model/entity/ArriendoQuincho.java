package cl.desafiolatam.Certificacion2.model.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="arriendo_quincho")
public class ArriendoQuincho {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Date fecha;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="estado_id")
	private Estado estado;
}
