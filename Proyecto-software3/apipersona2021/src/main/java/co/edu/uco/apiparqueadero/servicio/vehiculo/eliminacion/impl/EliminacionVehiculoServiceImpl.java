package co.edu.uco.apiparqueadero.servicio.vehiculo.eliminacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Vehiculo;
import co.edu.uco.apiparqueadero.repository.VehiculoRepository;
import co.edu.uco.apiparqueadero.servicio.vehiculo.eliminacion.EliminacionVehiculoService;

@Service
public class EliminacionVehiculoServiceImpl implements EliminacionVehiculoService{

	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public Integer ejecutar(Vehiculo vehiculo) {
		vehiculoRepository.deleteById(vehiculo.getIdVehiculo());
		return vehiculo.getIdVehiculo();
		
	}	
}
