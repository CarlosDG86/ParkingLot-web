package com.org.parking.web.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RegistroESController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String placa ="";
	private String tipoEstancia="";
	private String pathFoto="";
	private Date dateEntrada; 
	private Boolean cortesia;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipoEstancia() {
		return tipoEstancia;
	}
	public void setTipoEstancia(String tipoEstancia) {
		this.tipoEstancia = tipoEstancia;
	}
	public String getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}
	public Date getDateEntrada() {
		return dateEntrada;
	}
	public void setDateEntrada(Date dateEntrada) {
		this.dateEntrada = dateEntrada;
	}
	
	public Boolean getCortesia() {
		return cortesia;
	}
	public void setCortesia(Boolean cortesia) {
		this.cortesia = cortesia;
	}


	
	

}
