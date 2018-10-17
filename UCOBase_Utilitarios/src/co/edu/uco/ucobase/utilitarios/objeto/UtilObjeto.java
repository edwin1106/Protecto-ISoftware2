package co.edu.uco.ucobase.utilitarios.objeto;

/**
 * Objeto utilitario que expone servicios que pueden ser utilizados de forma
 * generica por algun objeto que lo requiera
 *
 * @author edwin
 *
 */
public final class UtilObjeto {
	private static final UtilObjeto INSTANCIA = new UtilObjeto();

	private UtilObjeto() {
		super();
	}

	public static final UtilObjeto obtenerUtilObjeto() {
		return INSTANCIA;

	}

	public <T> T obtenerValorDefecto(T objeto, T valorDefecto) {

		T retorno = objeto;

		if (objetoEsNulo(objeto)) {
			retorno = valorDefecto;
		}

		return objeto;
	}
	
	public <T> boolean objetoEsNulo(T objeto) {
		return (objeto == null);
	}

}
