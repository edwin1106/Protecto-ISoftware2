package co.edu.uco.ucobase.utilitarios.excepcion.enumeracion;

public enum ExcepcionEnum {
	
	DATOS("DATOS", "eXCEPCION PRESENTADA EN LA CAPA DE DATOS"),
	NEGOCIO("NEGOCIO" , "Excepcion presentada en la capa lógica de negocio"),
	FACHADA("FACHADA", "Excepcion presentada en la capa ed fachada"),
	API("API", "Excepcion presentada en la capa Aapi"),
	DTO("DTO", "Excepcion presentada en la capa de dto"),
	DOMINIO("DOMINIO", "Excepcion presentada en la capa de dominio"),
	GENERAL("GENERAL", "Excepcion presentada a nivel general");
	
	
	private String codigo;
	private String nombre;
	
	
	
	
	private ExcepcionEnum(final String codigo, final String nombre) {
		setCodigo(codigo);
		setNombre(nombre);
	}
	public final String getCodigo() {
		return codigo;
	}
	private final void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public final String getNombre() {
		return nombre;
	}
	
	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
