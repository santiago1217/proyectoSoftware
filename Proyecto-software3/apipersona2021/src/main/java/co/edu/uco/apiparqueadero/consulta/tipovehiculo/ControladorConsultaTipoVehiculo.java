package co.edu.uco.apiparqueadero.consulta.tipovehiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.model.TipoVehiculo;
import co.edu.uco.apiparqueadero.servicio.tipovehiculo.consulta.ConsultaTipoVehiculoService;
import io.swagger.annotations.Api;

@Api(tags="Consultar tipo de vehiculos")
@RestController
@RequestMapping("/v1/tipo-vehiculo")

public class ControladorConsultaTipoVehiculo {
	
	@Autowired
	private ConsultaTipoVehiculoService consultaTipoVehiculoService;
	
	@GetMapping
	Iterable<TipoVehiculo> findAll(){
		return consultaTipoVehiculoService.findAll();
	}
	
}


