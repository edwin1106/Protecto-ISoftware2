package co.edu.uco.ucobancaria.negocio;

import java.util.List;

import co.edu.uco.ucobancaria.DTO.TipoCuentaDTO;

public interface ITipoCuentaNegocio {

	void crear(TipoCuentaDTO tipoCuenta);

	void actualizar(TipoCuentaDTO tipoCuenta);

	void eliminar(TipoCuentaDTO tipoCuenta);

	List<TipoCuentaDTO> consultar(TipoCuentaDTO tipoCuenta);
}