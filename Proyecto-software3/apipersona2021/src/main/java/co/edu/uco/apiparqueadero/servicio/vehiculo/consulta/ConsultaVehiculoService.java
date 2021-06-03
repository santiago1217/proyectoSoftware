package co.edu.uco.apiparqueadero.servicio.vehiculo.consulta;

import co.edu.uco.apiparqueadero.model.Vehiculo;

public interface ConsultaVehiculoService {
	
	Iterable<Vehiculo> findAll();

	Vehiculo findById(Integer idVehiculo);

}
