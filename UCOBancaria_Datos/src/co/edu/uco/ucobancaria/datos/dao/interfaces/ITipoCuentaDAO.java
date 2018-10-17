package co.edu.uco.ucobancaria.datos.dao.interfaces;

import java.util.List;

import co.edu.uco.ucobancaria.dominio.TipoCuentaDominio;;

public interface ITipoCuentaDAO {
	void crear(TipoCuentaDominio TipoCuenta);
	void actualizar(TipoCuentaDominio TipoCuenta);
	void eliminar(TipoCuentaDominio TipoCuenta);
	List<TipoCuentaDominio> consultar(TipoCuentaDominio TipoCuenta);

}
