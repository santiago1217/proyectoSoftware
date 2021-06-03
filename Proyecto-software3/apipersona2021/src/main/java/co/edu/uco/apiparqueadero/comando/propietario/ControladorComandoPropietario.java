package co.edu.uco.apiparqueadero.comando.propietario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.model.Propietario;
import co.edu.uco.apiparqueadero.servicio.propietario.creacion.CreacionPropietarioService;



@RestController
@RequestMapping("/v1/propietario")
public class ControladorComandoPropietario{
	
	@Autowired
	private CreacionPropietarioService creacionPropetarioService;
	
	
	@PostMapping
	public void insertar(@RequestBody Propietario propietario){
		creacionPropetarioService.ejecutar(propietario);
	}

}
