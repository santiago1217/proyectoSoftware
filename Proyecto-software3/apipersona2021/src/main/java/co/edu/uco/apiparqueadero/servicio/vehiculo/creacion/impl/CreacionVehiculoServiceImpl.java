package co.edu.uco.apiparqueadero.servicio.vehiculo.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Vehiculo;
import co.edu.uco.apiparqueadero.repository.VehiculoRepository;
import co.edu.uco.apiparqueadero.servicio.vehiculo.creacion.CreacionVehiculoService;

@Service
public class CreacionVehiculoServiceImpl implements CreacionVehiculoService{

	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public Integer ejecutar(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
		return vehiculo.getIdVehiculo();
	}
}
