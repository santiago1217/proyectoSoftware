package co.edu.uco.apiparqueadero.servicio.tipovehiculo.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.TipoVehiculo;
import co.edu.uco.apiparqueadero.repository.TipoVehiculoRepository;
import co.edu.uco.apiparqueadero.servicio.tipovehiculo.consulta.ConsultaTipoVehiculoService;

@Service
public class ConsultaTipoVehiculoServiceImpl implements ConsultaTipoVehiculoService {

	@Autowired
	private TipoVehiculoRepository tipoVehiculoRepository;

	@Override
	public Iterable<TipoVehiculo> findAll() {
		return tipoVehiculoRepository.findAll();
	}

	
}
