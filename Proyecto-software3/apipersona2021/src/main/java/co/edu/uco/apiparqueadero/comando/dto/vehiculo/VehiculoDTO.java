package co.edu.uco.apiparqueadero.comando.dto.vehiculo;

import lombok.Data;

@Data
public class VehiculoDTO {
	
	private Integer idVehiculo;
	private Integer	idTipoVehiculo;	
	private String placa;
	private String modelo;  
	private String marca;
	
	

}
