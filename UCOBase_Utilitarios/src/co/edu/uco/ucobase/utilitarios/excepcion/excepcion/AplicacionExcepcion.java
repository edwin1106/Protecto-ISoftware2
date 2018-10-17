package co.edu.uco.ucobase.utilitarios.excepcion.excepcion;

import co.edu.uco.ucobase.utilitarios.excepcion.enumeracion.ExcepcionEnum;

import static co.edu.uco.ucobase.utilitarios.cadena.UtilTexto.obtenerUtilTexto;
import static co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

public final class AplicacionExcepcion extends RuntimeException {
	
	/**
	*serial version por defecto de la clase
	**/
	
	
	private static final long serialversionUID = 1L;
  	private String mensajeTecnico;
  	private String mensajeUsuario;
  	private Exception excepcionRaiz;
  	private boolean existeExcepcionRaiz;
  	private ExcepcionEnum lugarExcepcion;
  	
  	private AplicacionExcepcion (final String mensajeTecnico,final  String mensajeUsuario, final Exception excepcionRaiz, final ExcepcionEnum lugarExcepcion) {
		super();
		setMensajeTecnico(mensajeTecnico);
		setMensajeUsuario(mensajeUsuario);
		setExcepcionRaiz(excepcionRaiz);
		setLugarExcepcion(lugarExcepcion);
  	}
  	public static AplicacionExcepcion CREAR(final String mensajeTecnico,final  String mensajeUsuario, final Exception excepcionRaiz, final ExcepcionEnum lugarExcepcion) {
  		
  		return new AplicacionExcepcion(mensajeTecnico, mensajeUsuario, excepcionRaiz,lugarExcepcion);
  	}
  	
  	public static AplicacionExcepcion CREAR(final String mensajeUsuario,final Exception excepcionRaiz, final ExcepcionEnum lugarExcepcion) {
  		return new AplicacionExcepcion(mensajeUsuario, mensajeUsuario, excepcionRaiz, lugarExcepcion);
  	}
  	
  	public static AplicacionExcepcion CREAR(final String mensajeUsuario,final ExcepcionEnum lugarExcepcion) {
  		return new AplicacionExcepcion(mensajeUsuario, mensajeUsuario, null, lugarExcepcion);
  	}
  	public static AplicacionExcepcion CREAR(final String mensajeUsuario) {
  		return new AplicacionExcepcion(mensajeUsuario, mensajeUsuario, null, null);
  	}
  	
  	
  	
  	private final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = obtenerUtilTexto().aplicarTrim(mensajeTecnico);
	}
  	
	private final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = obtenerUtilTexto().aplicarTrim(mensajeUsuario);
	}
	
	private final void setExcepcionRaiz(final Exception excepcionRaiz) {
		setExisteExcepcionRaiz(!obtenerUtilObjeto().objetoEsNulo(excepcionRaiz));
		this.excepcionRaiz = obtenerUtilObjeto().obtenerValorDefecto(excepcionRaiz, new Exception());
	}
	private final void setExisteExcepcionRaiz(final boolean existeExcepcion) {
		this.existeExcepcionRaiz = existeExcepcion;
	}
	private final void setLugarExcepcion(final ExcepcionEnum lugarExcepcion) {
		this.lugarExcepcion = obtenerUtilObjeto().obtenerValorDefecto(lugarExcepcion, ExcepcionEnum.GENERAL);
		
		
	}
	public final String getMensajeTecnico() {
		return mensajeTecnico;
	}
	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}
	public final Exception getExcepcionRaiz() {
		return excepcionRaiz;
	}
	public final boolean isExisteExcepcionRaiz() {
		return existeExcepcionRaiz;
	}
	public final ExcepcionEnum getLugarExcepcion() {
		return lugarExcepcion;
	}
}
