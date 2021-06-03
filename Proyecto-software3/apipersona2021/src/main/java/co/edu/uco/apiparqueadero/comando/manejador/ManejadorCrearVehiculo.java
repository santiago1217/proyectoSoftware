package co.edu.uco.apiparqueadero.comando.manejador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uco.apiparqueadero.aplicacion.ComandoRespuesta;
import co.edu.uco.apiparqueadero.aplicacion.manejador.ManejadorComandoRespuesta;
import co.edu.uco.apiparqueadero.comando.converter.VehiculoConverter;
import co.edu.uco.apiparqueadero.comando.dto.vehiculo.VehiculoDTO;
import co.edu.uco.apiparqueadero.servicio.vehiculo.creacion.CreacionVehiculoService;

@Component
public class ManejadorCrearVehiculo implements ManejadorComandoRespuesta<VehiculoDTO, ComandoRespuesta<Integer>>{

	@Autowired
	private CreacionVehiculoService creacionVehiculoService;
	@Autowired
	private VehiculoConverter vehiculoConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(VehiculoDTO vehiculoDto) {
		return new ComandoRespuesta<>(creacionVehiculoService.ejecutar(vehiculoConverter.crear(vehiculoDto)));
	}	
}
