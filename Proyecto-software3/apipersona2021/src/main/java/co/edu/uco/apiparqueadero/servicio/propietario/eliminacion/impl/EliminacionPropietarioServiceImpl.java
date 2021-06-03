package co.edu.uco.apiparqueadero.servicio.propietario.eliminacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.repository.PropietarioRepository;
import co.edu.uco.apiparqueadero.servicio.propietario.eliminacion.EliminacionPropietarioService;

@Service
public class EliminacionPropietarioServiceImpl implements EliminacionPropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void eliminar(Integer idPropietario) {
		propietarioRepository.deleteById(idPropietario);
		
	}
}
