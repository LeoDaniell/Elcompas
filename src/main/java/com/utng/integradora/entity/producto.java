package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class producto implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -6885473441498356593L;
	
	@Id
	@Column (name="idProducto")
	private int idProducto;
	@Column(length=60, nullable=false)
	private String nombreProd;
	@Column(length=100, nullable=false)
	private String imagen;
	@Column (name="stock")
	private int stock;
	@Column(length=11)
	private Double precio;
	@Column(length=500, nullable=false)
	private String descripcion;
	public producto(int idProducto, String nombreProd, String imagen, int stock, Double precio, String descripcion) {
		super();
		this.idProducto = idProducto;
		this.nombreProd = nombreProd;
		this.imagen = imagen;
		this.stock = stock;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	public producto() {
		super();
		
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProd() {
		return nombreProd;
	}
	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
