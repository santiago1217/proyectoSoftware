package co.edu.uco.apiparqueadero.servicio.tipodocumento.consulta;

import co.edu.uco.apiparqueadero.model.TipoDocumento;

public interface ConsultaTipoDocumentoService {

	Iterable<TipoDocumento> findAll();

}
