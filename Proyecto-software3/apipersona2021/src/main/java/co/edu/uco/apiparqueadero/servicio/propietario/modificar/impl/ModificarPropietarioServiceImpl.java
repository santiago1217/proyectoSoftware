package co.edu.uco.apiparqueadero.servicio.propietario.modificar.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Propietario;
import co.edu.uco.apiparqueadero.repository.PropietarioRepository;
import co.edu.uco.apiparqueadero.servicio.propietario.modificar.ModificarPropietarioService;

@Service
public class ModificarPropietarioServiceImpl implements ModificarPropietarioService{

	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void modificar(Propietario propietario) {
		propietarioRepository.deleteById(propietario.getIdPropietario());
		 propietarioRepository.save(propietario);
	}

}
