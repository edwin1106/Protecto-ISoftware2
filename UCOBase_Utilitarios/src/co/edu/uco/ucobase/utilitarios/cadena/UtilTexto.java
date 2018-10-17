package co.edu.uco.ucobase.utilitarios.cadena;
import static co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto.obtenerUtilObjeto;

import co.edu.uco.ucobase.utilitarios.objeto.UtilObjeto;

public final class UtilTexto {
	private static final UtilTexto INSTANCIA = new UtilTexto();

	private UtilTexto() {
		super();
	}

	public static final UtilTexto obtenerUtilTexto() {
		return INSTANCIA;

	}
	public String aplicarTrim(String cadena) {
		return obtenerUtilObjeto().obtenerValorDefecto(cadena, "").trim();
		
	}

}
