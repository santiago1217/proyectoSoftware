package co.edu.uco.apiparqueadero.servicio.propietario.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Propietario;
import co.edu.uco.apiparqueadero.repository.PropietarioRepository;
import co.edu.uco.apiparqueadero.servicio.propietario.creacion.CreacionPropietarioService;


@Service
public class CreacionPropietarioServiceImpl implements CreacionPropietarioService {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void ejecutar(Propietario propietario) {
		propietarioRepository.save(propietario);
	}

}
