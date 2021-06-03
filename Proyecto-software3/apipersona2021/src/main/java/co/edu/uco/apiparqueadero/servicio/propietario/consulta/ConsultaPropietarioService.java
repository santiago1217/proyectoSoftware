package co.edu.uco.apiparqueadero.servicio.propietario.consulta;

import co.edu.uco.apiparqueadero.model.Propietario;

public interface ConsultaPropietarioService {

	Iterable<Propietario> findAll();

	Propietario findById(Integer idPropietario);

}
