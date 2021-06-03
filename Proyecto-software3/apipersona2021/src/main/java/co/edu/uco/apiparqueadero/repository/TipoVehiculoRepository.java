package co.edu.uco.apiparqueadero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.apiparqueadero.model.TipoVehiculo;
@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Integer>{

}
