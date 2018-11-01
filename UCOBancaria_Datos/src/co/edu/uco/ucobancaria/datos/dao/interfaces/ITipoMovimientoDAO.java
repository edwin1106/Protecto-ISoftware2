package co.edu.uco.ucobancaria.datos.dao.interfaces;

import java.util.List;


import co.edu.uco.ucobancaria.dominio.TipoCuentaDominio;

public interface ITipoMovimientoDAO {
	void crear(TipoCuentaDominio TipoMovimiento);
	void actualizar(TipoCuentaDominio TipoMovimiento);
	void eliminar(TipoCuentaDominio TipoMovimiento);
	List<TipoCuentaDominio> consultar(TipoCuentaDominio TipoMovimiento);

}
