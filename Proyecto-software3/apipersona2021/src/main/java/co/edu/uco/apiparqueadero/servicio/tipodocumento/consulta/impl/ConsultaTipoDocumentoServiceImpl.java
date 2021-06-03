package co.edu.uco.apiparqueadero.servicio.tipodocumento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.TipoDocumento;
import co.edu.uco.apiparqueadero.repository.TipoDocumentoRepository;
import co.edu.uco.apiparqueadero.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;

@Service
public class ConsultaTipoDocumentoServiceImpl implements ConsultaTipoDocumentoService{
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Iterable<TipoDocumento> findAll() {
		return tipoDocumentoRepository.findAll();
	}

}
