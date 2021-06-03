package co.edu.uco.apiparqueadero.consulta.vehiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.model.Vehiculo;
import co.edu.uco.apiparqueadero.servicio.vehiculo.consulta.ConsultaVehiculoService;
import io.swagger.annotations.Api;


@Api(tags="Consulta vehiculos")
@RestController
@RequestMapping("/v1/vehiculo")
public class ControladorConsultaVehiculo {
	@Autowired
	private ConsultaVehiculoService vehiculoService;
	
	@Secured({"ROLE_ADMIN","ROLE_CONSULTA"})
	@GetMapping
	Iterable<Vehiculo> findAll(){
		return vehiculoService.findAll();
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/{idVehiculo}")
	Vehiculo findById(@PathVariable("idVehiculo") Integer idVehiculo){
		return vehiculoService.findById(idVehiculo);
	}
}


