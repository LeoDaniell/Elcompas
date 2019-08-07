package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class venta implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 8660716673497731436L;
	
	@Id
	@Column
	private int idVenta;

	public venta(int idVenta) {
		super();
		this.idVenta = idVenta;
	}

	public venta() {
		super();
		
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	
}
