package co.edu.uco.apiparqueadero.comando.manejador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uco.apiparqueadero.aplicacion.ComandoRespuesta;
import co.edu.uco.apiparqueadero.aplicacion.manejador.ManejadorComandoRespuesta;
import co.edu.uco.apiparqueadero.comando.converter.VehiculoConverter;
import co.edu.uco.apiparqueadero.servicio.vehiculo.eliminacion.EliminacionVehiculoService;
@Component
public class ManejadorEliminarVehiculo implements ManejadorComandoRespuesta<Integer, ComandoRespuesta<Integer>>{

	@Autowired
	private EliminacionVehiculoService eliminacionVehiculoService;
	@Autowired
	private VehiculoConverter vehiculoConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(Integer idVehiculo) {
		return new ComandoRespuesta<>(eliminacionVehiculoService.ejecutar(vehiculoConverter.eliminar(idVehiculo)));
	}
}
