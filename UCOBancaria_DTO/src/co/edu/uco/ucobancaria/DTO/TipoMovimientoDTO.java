package co.edu.uco.ucobancaria.DTO;

import static co.edu.uco.ucobase.utilitarios.cadena.UtilTexto.obtenerUtilTexto;


/**
 * Objeto de transferencia de datos que representa a un Tipo de Movimiento o de
 * transacción realizada sobre una Cuenta.
 * 
 * @author edwin
 *
 */

public final class TipoMovimientoDTO {
	private int codigo;
	private String nombre;
	private String signo;

	public TipoMovimientoDTO() {
		super();
	}

	public TipoMovimientoDTO(final int codigo,final String nombre,final String signo) {
		super();
		setCodigo(codigo);
		setNombre(nombre);
		setSigno(signo);
	}

	public final int getCodigo() {
		return codigo;
	}

	public final void setCodigo(final int codigo) {
		this.codigo = codigo;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(final String nombre) {
		this.nombre = obtenerUtilTexto().aplicarTrim(nombre);
	}

	public final String getSigno() {
		return signo;
	}

	public final void setSigno(final String signo) {
		this.signo = obtenerUtilTexto().aplicarTrim(signo);
	}

}
