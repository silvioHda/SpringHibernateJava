package com.example.SpringHibernateComputadora.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPUTADORAS")
public class Computadora {
	@Id
	@Column(name="ID",columnDefinition="NUMBER")
	private int id;
	
	@Column(name="MODELO",columnDefinition="NVARCHAR2(100)")
	private String modelo;
	
	@Column(name="MARCA",columnDefinition="NVARCHAR2(100)")
	private String marca;
	
	@Column(name="PRECIO",columnDefinition="NUMBER")
	private double precio;
	
	@Column(name="RAM",columnDefinition="NUMBER")
	private int ram;

	@Column(name="HD",columnDefinition="NUMBER")
	private int hd;
	
	@Column(name="PROCESADOR",columnDefinition="NVARCHAR2(100)")
	private String procesador;
	
	
	public Computadora() {
		
	}


	public Computadora(int id) {
		this.id = id;
	}


	public Computadora(int id, String modelo, String marca, double precio, int ram, int hd, String procesador) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.ram = ram;
		this.hd = hd;
		this.procesador = procesador;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getHd() {
		return hd;
	}


	public void setHd(int hd) {
		this.hd = hd;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	@Override
	public String toString() {
		return "Computadora [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", ram="
				+ ram + ", hd=" + hd + ", procesador=" + procesador + "]";
	}
	
	
	
}
