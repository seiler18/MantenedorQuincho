package cl.desafiolatam.Certificacion2.model.dto;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class ArriendoQuinchoFormDto {
	
	private Date fecha_desde;
	private Date fecha_hasta;
	private Integer departamento_id;
	private Integer estado_id;
}
