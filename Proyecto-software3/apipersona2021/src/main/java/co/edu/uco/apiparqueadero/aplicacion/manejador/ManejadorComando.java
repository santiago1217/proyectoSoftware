package co.edu.uco.apiparqueadero.aplicacion.manejador;

import org.springframework.transaction.annotation.Transactional;

public interface ManejadorComando<C> {
	
	@Transactional
	void ejecutar(C comando);

}
