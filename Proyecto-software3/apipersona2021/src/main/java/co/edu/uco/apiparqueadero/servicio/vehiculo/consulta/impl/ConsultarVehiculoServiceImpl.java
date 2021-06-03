package co.edu.uco.apiparqueadero.servicio.vehiculo.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Vehiculo;
import co.edu.uco.apiparqueadero.repository.VehiculoRepository;
import co.edu.uco.apiparqueadero.servicio.vehiculo.consulta.ConsultaVehiculoService;

@Service
public class ConsultarVehiculoServiceImpl implements ConsultaVehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public Iterable<Vehiculo> findAll() {
		return vehiculoRepository.findAll();
	}

	@Override
	public Vehiculo findById(Integer idVehiculo) {
		return vehiculoRepository.findById(idVehiculo).orElse(null);
	}
		
}
