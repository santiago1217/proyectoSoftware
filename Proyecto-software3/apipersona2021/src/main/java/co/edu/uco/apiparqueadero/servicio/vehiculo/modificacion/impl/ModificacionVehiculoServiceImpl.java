package co.edu.uco.apiparqueadero.servicio.vehiculo.modificacion.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.apiparqueadero.model.Vehiculo;
import co.edu.uco.apiparqueadero.repository.VehiculoRepository;
import co.edu.uco.apiparqueadero.servicio.vehiculo.modificacion.ModificacionVehiculoService;

@Service
public class ModificacionVehiculoServiceImpl implements ModificacionVehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public Integer ejecutar(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
		return vehiculo.getIdVehiculo();
	}
	
	
}
