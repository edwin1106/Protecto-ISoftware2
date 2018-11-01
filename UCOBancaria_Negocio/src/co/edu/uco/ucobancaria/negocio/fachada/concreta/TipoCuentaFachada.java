package co.edu.uco.ucobancaria.negocio.fachada.concreta;

import java.util.List;


import co.edu.uco.ucobancaria.DTO.TipoCuentaDTO;
import co.edu.uco.ucobancaria.datos.factoria.abstracta.FactoriaDAO;
import co.edu.uco.ucobancaria.negocio.fachada.ITipoCuentaFachada;
import co.edu.uco.ucobase.utilitarios.excepcion.enumeracion.ExcepcionEnum;
import co.edu.uco.ucobase.utilitarios.excepcion.excepcion.AplicacionExcepcion;
import co.edu.uco.ucobase.utilitarios.sql.enumeracion.FuenteInformacionEnum;

public class TipoCuentaFachada implements ITipoCuentaFachada{

	@Override
	public void crear(TipoCuentaDTO tipoCuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void actualizar(final TipoCuentaDTO tipoCuenta) {
		final FactoriaDAO factoria = FactoriaDAO.obtenerFactoria(FuenteInformacionEnum.SQL_SERVER);
		try {
			factoria.iniciarTransaccion();
			
			factoria.iniciarTransaccion();
		}catch (final AplicacionExcepcion excepcion) {
			factoria.cancelarTransaccion();
			throw excepcion;
		}catch (final Exception excepcion) {
			factoria.cancelarTransaccion();
			
			final String mensajeusuario = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo de cuenta";
			final String mensajeTecnico = "Se ha preentado un problema inesperado tratando de crear el nuevo tipo de cuenta";
			
			throw AplicacionExcepcion.CREAR(mensajeTecnico,mensajeusuario,excepcion, ExcepcionEnum.FACHADA);
		}finally {
			factoria.cerrarConexion();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(TipoCuentaDTO tipoCuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TipoCuentaDTO> consultar(TipoCuentaDTO tipoCuenta) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
