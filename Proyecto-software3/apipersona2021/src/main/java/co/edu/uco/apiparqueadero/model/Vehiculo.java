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
@Table(name="vehiculo")
@Data
@NoArgsConstructor
public class Vehiculo {
	
	@Id
	@GeneratedValue
	@Column(name="idvehiculo")
	private Integer idVehiculo;	
	@ManyToOne
	@JoinColumn(name = "idtipovehiculo")
	private TipoVehiculo tipoVehiculo;		
	@Column(name="marca")
	private String marca;
	@Column(name="modelo")
	private String modelo;
	@Column(name="placa")
	private String placa;	
	
}

