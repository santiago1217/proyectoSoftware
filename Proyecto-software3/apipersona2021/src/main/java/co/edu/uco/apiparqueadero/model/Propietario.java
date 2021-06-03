package co.edu.uco.apiparqueadero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="propietario")
@Data
@NoArgsConstructor
public class Propietario {
	
	@Id
	@GeneratedValue
	@Column(name="idpropietario")
	private Integer idPropietario;
	@ManyToOne
	@JoinColumn(name = "idtipodocumento")
	private TipoDocumento tipoDocumento;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;

}
