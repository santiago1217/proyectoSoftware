package co.edu.uco.apiparqueadero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="tipovehiculo")
@Data
@NoArgsConstructor
public class TipoVehiculo {
	@Id
	@Column(name = "idtipovehiculo")
	private Integer idTipoVehiculo;
	@Column(name = "nombretipovehiculo")
	private String nombreTipoVehiculo;
	
	
	
}

