package co.edu.uco.apiparqueadero.consulta.propietario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.model.Propietario;
import co.edu.uco.apiparqueadero.servicio.propietario.consulta.ConsultaPropietarioService;

@RestController
@RequestMapping("/v1/propietario")

public class ControladorConsultaPropietario{
	
	@Autowired
	private ConsultaPropietarioService propietarioService;
	
	@GetMapping
	Iterable<Propietario> findAll(){
		return propietarioService.findAll();
	}
	
	@GetMapping("/{idPersona}")
	Propietario findById(@PathVariable("idPersona") Integer idPropietario){
		return propietarioService.findById(idPropietario);
	}

}


