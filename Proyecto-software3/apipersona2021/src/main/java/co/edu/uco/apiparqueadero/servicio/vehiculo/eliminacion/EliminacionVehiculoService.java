package co.edu.uco.apiparqueadero.servicio.vehiculo.eliminacion;

import co.edu.uco.apiparqueadero.model.Vehiculo;

public interface EliminacionVehiculoService {
	
	Integer ejecutar(Vehiculo vehiculo);
}
