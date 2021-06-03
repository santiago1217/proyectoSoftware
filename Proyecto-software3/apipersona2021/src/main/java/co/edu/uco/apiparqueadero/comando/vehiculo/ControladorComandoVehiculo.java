package co.edu.uco.apiparqueadero.comando.vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.aplicacion.ComandoRespuesta;
import co.edu.uco.apiparqueadero.comando.dto.vehiculo.VehiculoDTO;
import co.edu.uco.apiparqueadero.comando.manejador.ManejadorCrearVehiculo;
import co.edu.uco.apiparqueadero.comando.manejador.ManejadorEliminarVehiculo;
import co.edu.uco.apiparqueadero.comando.manejador.ManejadorModificarVehiculo;
import io.swagger.annotations.Api;


@Api(tags="Controlador Vehiculo")
@RestController
@RequestMapping("/v1/vehiculo")
public class ControladorComandoVehiculo {
	
	@Autowired
	private ManejadorCrearVehiculo manejadorCrearVehiculo;
	@Autowired
	private ManejadorModificarVehiculo manejadorModificacionVehiculo;
	@Autowired
	private ManejadorEliminarVehiculo manejadorEliminacionVehiculo;
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping
	public void insertar(@RequestBody VehiculoDTO vehiculoDto) {
		manejadorCrearVehiculo.ejecutar(vehiculoDto);
	}
	
	@Secured({"ROLE_ADMIN"})
	@PutMapping("/{idVehiculo}")
	public void modificar(@RequestBody VehiculoDTO vehiculoDto,@PathVariable Integer idVehiculo){
		vehiculoDto.setIdVehiculo(idVehiculo);
		manejadorModificacionVehiculo.ejecutar(vehiculoDto);
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/{idVehiculo}")
	public ComandoRespuesta<Integer> eliminar(@PathVariable Integer idVehiculo){		
		return manejadorEliminacionVehiculo.ejecutar(idVehiculo);
	}

}

