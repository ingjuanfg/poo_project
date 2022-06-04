package com.ingjuanfg;

import java.util.Date;

public class Paciente extends Persona{

    private String diagnostico;
    private Date fechaIngreso;
    private boolean activo;

    public Paciente(String nombre, String apellido, int edad, String diagnostico, Date fechaIngreso, boolean activo) {
        super(nombre, apellido, edad);
        this.diagnostico = diagnostico;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
