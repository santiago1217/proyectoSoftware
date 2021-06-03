package co.edu.uco.apiparqueadero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.apiparqueadero.model.seguridad.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
	Usuario findByNombreUsuario(String nombreUsuario);
}
