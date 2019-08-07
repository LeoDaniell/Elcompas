package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class marca implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -7824475173931363218L;
	
	@Id
	@Column (name="idMarca")
	private int idMarca;
	@Column (length=50, nullable=false)
	private String nombreMarca;
	public marca(int idMarca, String nombreMarca) {
		super();
		this.idMarca = idMarca;
		this.nombreMarca = nombreMarca;
	}
	public marca() {
		super();
		
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombreMarca() {
		return nombreMarca;
	}
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	
}
