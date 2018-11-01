package co.edu.uco.ucobancaria.DTO;
import static co.edu.uco.ucobase.utilitarios.cadena.UtilTexto.obtenerUtilTexto;

/**
 * Objeto de transferencia de datos que representa a un tipo de cuenta.
 * 
 * @author edwin
 *
 */

public final class TipoCuentaDTO {
	private int codigo;
	private String nombre;

	public TipoCuentaDTO() {
		super();
	}

	public TipoCuentaDTO(final int codigo,final String nombre) {
		super();
		setCodigo(codigo);
		setNombre(nombre);
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

}
