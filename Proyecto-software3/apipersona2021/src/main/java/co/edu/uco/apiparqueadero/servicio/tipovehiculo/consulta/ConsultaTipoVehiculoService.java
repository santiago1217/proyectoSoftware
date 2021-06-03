package co.edu.uco.apiparqueadero.servicio.tipovehiculo.consulta;

import co.edu.uco.apiparqueadero.model.TipoVehiculo;

public interface ConsultaTipoVehiculoService {
	
	Iterable<TipoVehiculo> findAll();
	

}
