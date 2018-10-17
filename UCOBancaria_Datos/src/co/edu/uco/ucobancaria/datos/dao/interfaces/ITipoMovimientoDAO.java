package co.edu.uco.ucobancaria.datos.dao.interfaces;

import java.util.List;

import co.edu.uco.ucobancaria.dominio.TipoMovimientoDominio;

public interface ITipoMovimientoDAO {
	void crear(TipoMovimientoDominio TipoMovimiento);
	void actualizar(TipoMovimientoDominio TipoMovimiento);
	void eliminar(TipoMovimientoDominio TipoMovimiento);
	List<TipoMovimientoDominio> consultar(TipoMovimientoDominio TipoMovimiento);

}
