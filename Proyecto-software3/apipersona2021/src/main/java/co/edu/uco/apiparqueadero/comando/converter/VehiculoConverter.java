package co.edu.uco.apiparqueadero.comando.converter;

import org.springframework.stereotype.Component;

import co.edu.uco.apiparqueadero.comando.dto.vehiculo.VehiculoDTO;
import co.edu.uco.apiparqueadero.dominio.ValidadorArgumento;
import co.edu.uco.apiparqueadero.model.TipoVehiculo;
import co.edu.uco.apiparqueadero.model.Vehiculo;

@Component
public class VehiculoConverter {

	private static final String PLACA_VEHICULO_ES_OBLIGATORIO = "No fue ingresada la información de la placa del vehículo, y es obligatoria";
	private static final String MARCA_VEHICULO_ES_OBLIGATORIO = "No fue ingresada la información de la marca del vehículo, y es obligatoria";
	private static final String MODELO_VEHICULO_ES_OBLIGATORIO = "No fue ingresada la información del modelo del vehículo, y es obligatoria";
	private static final String TIPO_VEHICULO_ES_OBLIGATORIO = "No fue ingresada la información del tipo del vehículo, y es obligatoria";
	private static final String PLACA_VEHICULO_ESTA_VACIA = "No fue ingresada la información de la placa del vehículo, el campo no puede quedar vacio.";
	private static final String MARCA_VEHICULO_ESTA_VACIA = "No fue ingresada la información de la marca del vehículo, el campo no puede quedar vacio.";
	private static final String MODELO_VEHICULO_ESTA_VACIA = "No fue ingresada la información del modelo del vehículo, el campo no puede quedar vacio.";
	private static final String TIPO_VEHICULO_ESTA_VACIA = "No fue ingresada la información del tipo del vehículo, el campo no puede quedar vacio.";
	private static final String ID_VEHICULO_ES_OBLIGATORIO = "El id del vehiculo es obligatorio, el campo no puede quedar vacio.";



	public Vehiculo crear(VehiculoDTO vehiculoDTO) {
		Vehiculo vehiculo = new Vehiculo();
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getPlaca(), PLACA_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getIdTipoVehiculo(), TIPO_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getModelo(), MODELO_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getMarca(), MARCA_VEHICULO_ES_OBLIGATORIO);
		
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getPlaca(), PLACA_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getIdTipoVehiculo(), TIPO_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getModelo(), MODELO_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getMarca(), MARCA_VEHICULO_ESTA_VACIA);		
	
		tipoVehiculo.setIdTipoVehiculo(vehiculoDTO.getIdTipoVehiculo());
		vehiculo.setIdVehiculo(vehiculoDTO.getIdVehiculo());
		vehiculo.setTipoVehiculo(tipoVehiculo);
		vehiculo.setPlaca(vehiculoDTO.getPlaca());
		vehiculo.setModelo(vehiculoDTO.getModelo());
		vehiculo.setMarca(vehiculoDTO.getMarca());	
		
		return vehiculo;
	}

	public Vehiculo eliminar(Integer idVehiculo) {

		Vehiculo vehiculo = new Vehiculo();
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		vehiculo.setIdVehiculo(idVehiculo);		
		vehiculo.setTipoVehiculo(tipoVehiculo);
		return vehiculo;

	}

	public Vehiculo modificar(VehiculoDTO vehiculoDTO) {

		Vehiculo vehiculo = new Vehiculo();
		TipoVehiculo tipoVehiculo = new TipoVehiculo();
		
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getIdVehiculo(), ID_VEHICULO_ES_OBLIGATORIO);

	
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getPlaca(), PLACA_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getIdTipoVehiculo(), TIPO_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getModelo(), MODELO_VEHICULO_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(vehiculoDTO.getMarca(), MARCA_VEHICULO_ES_OBLIGATORIO);
	
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getPlaca(), PLACA_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getIdTipoVehiculo(), TIPO_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getModelo(), MODELO_VEHICULO_ESTA_VACIA);
		ValidadorArgumento.validarNoVacio(vehiculoDTO.getMarca(), MARCA_VEHICULO_ESTA_VACIA);
		
		vehiculo.setIdVehiculo(vehiculoDTO.getIdVehiculo());
		vehiculo.setPlaca(vehiculoDTO.getPlaca());
		vehiculo.setModelo(vehiculoDTO.getModelo());
		vehiculo.setMarca(vehiculoDTO.getMarca());
		
		tipoVehiculo.setIdTipoVehiculo(vehiculoDTO.getIdTipoVehiculo());
		vehiculo.setTipoVehiculo(tipoVehiculo);
		return vehiculo;

	}

}
