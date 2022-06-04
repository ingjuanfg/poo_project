package com.ingjuanfg;

import java.util.Date;

public class Paciente extends Persona {
	
	private String direccion;
	private String correo;
	private Date fechaAfiliacion;
	
	public Paciente(String nombre, String apellido, int edad, String direccion, String correo, Date fechaAfiliacion) {
		super(nombre, apellido, edad);
		this.direccion = direccion;
		this.correo = correo;
		this.fechaAfiliacion = fechaAfiliacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaAfiliacion() {
		return fechaAfiliacion;
	}

	public void setFechaAfiliacion(Date fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}

	

}
