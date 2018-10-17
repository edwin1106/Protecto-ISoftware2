package co.edu.uco.ucobancaria.DTO;

import java.util.Date;

public final class MovimientoDTO {
	private int codigo;
	private Date fecha;
	private TipoMovimientoDTO tipoMovimiento;
	private CuentaDTO cuenta;
	private double valor;
	private String comentario;
	
	
	public MovimientoDTO() {
		super();
	}
	
	public MovimientoDTO(int codigo, Date fecha, TipoMovimientoDTO tipoMovimiento, CuentaDTO cuenta, double valor,
			String comentario) {
		super();
		setCodigo(codigo);
		setFecha(fecha);
		setTipoMovimiento(tipoMovimiento);
		setCuenta(cuenta);
		setValor(valor);
		setComentario(comentario);
	}

	public final int getCodigo() {
		return codigo;
	}

	public final void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public final Date getFecha() {
		return fecha;
	}

	public final void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public final TipoMovimientoDTO getTipoMovimiento() {
		return tipoMovimiento;
	}

	public final void setTipoMovimiento(TipoMovimientoDTO tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public final CuentaDTO getCuenta() {
		return cuenta;
	}

	public final void setCuenta(CuentaDTO cuenta) {
		this.cuenta = cuenta;
	}

	public final double getValor() {
		return valor;
	}

	public final void setValor(double valor) {
		this.valor = valor;
	}

	public final String getComentario() {
		return comentario;
	}

	public final void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
