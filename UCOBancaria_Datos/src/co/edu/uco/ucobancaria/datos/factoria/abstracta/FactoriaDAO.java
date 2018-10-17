package co.edu.uco.ucobancaria.datos.factoria.abstracta;

import co.edu.uco.ucobancaria.datos.dao.interfaces.IClienteDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ICuentaDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.IMovimientoDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ITipoCuentaDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ITipoMovimientoDAO;

public abstract class FactoriaDAO {
	
	protected abstract void abrirConexion();
	protected abstract void iniciarTransaccion();
	protected abstract void confirmarTransaccion();
	protected abstract void cancelarTrasaccion();
	protected abstract void cerrarConexion();
	
	public abstract IClienteDAO obtenerClienteDao();
	public abstract ICuentaDAO obtenerCuentaDAO();
	public abstract IMovimientoDAO obtenerMovimientoDAO();
	public abstract ITipoCuentaDAO obtenerTipoCuentaDAO();
	public abstract ITipoMovimientoDAO obtenerTipoMovimientoDAO();

}
