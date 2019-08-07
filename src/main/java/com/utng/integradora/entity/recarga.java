package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class recarga implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -356731927815074357L;

	@Id
	@Column (name="idRecarga")
	private int idRecarga;
	@Column (name="telefono")
	private long telefono;
	@Column(length=100, nullable=false)
	private String compania;
	@Column(length=100, nullable=false)
	private String tipo;
	@Column (name="monto")
	private int monto;
	public recarga(int idRecarga, long telefono, String compania, String tipo, int monto) {
		super();
		this.idRecarga = idRecarga;
		this.telefono = telefono;
		this.compania = compania;
		this.tipo = tipo;
		this.monto = monto;
	}
	public recarga() {
		super();
		
	}
	public int getIdRecarga() {
		return idRecarga;
	}
	public void setIdRecarga(int idRecarga) {
		this.idRecarga = idRecarga;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

}
