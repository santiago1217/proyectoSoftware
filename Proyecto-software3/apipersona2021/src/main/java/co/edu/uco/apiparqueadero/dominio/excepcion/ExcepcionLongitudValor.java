package co.edu.uco.apiparqueadero.dominio.excepcion;

public class ExcepcionLongitudValor extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionLongitudValor(String message) {
        super(message);
    }
}