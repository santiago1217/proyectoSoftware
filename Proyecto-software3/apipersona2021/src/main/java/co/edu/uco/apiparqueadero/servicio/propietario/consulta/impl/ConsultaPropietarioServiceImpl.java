package co.edu.uco.apiparqueadero.servicio.propietario.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Propietario;
import co.edu.uco.apiparqueadero.repository.PropietarioRepository;
import co.edu.uco.apiparqueadero.servicio.propietario.consulta.ConsultaPropietarioService;

@Service
public class ConsultaPropietarioServiceImpl implements ConsultaPropietarioService {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public Iterable<Propietario> findAll() {
		return propietarioRepository.findAll();
	}

	@Override
	public Propietario findById(Integer idPropietario) {
		return propietarioRepository.findById(idPropietario).orElse(null);
	}

}
