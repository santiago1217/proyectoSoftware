package co.edu.uco.apiparqueadero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.apiparqueadero.model.Propietario;


@Repository
public interface PropietarioRepository extends CrudRepository<Propietario, Integer>{	

}
