package co.edu.uco.apiparqueadero.consulta.tipodocumento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.apiparqueadero.model.TipoDocumento;
import co.edu.uco.apiparqueadero.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;


@RestController
@RequestMapping("/v1/tipo-documento")
public class ControladorTipoDocumento {
	
	@Autowired
	private ConsultaTipoDocumentoService consultaTipoDocumentoService;
	
	@GetMapping
	Iterable<TipoDocumento> findAll(){
		return consultaTipoDocumentoService.findAll();
	}
}
