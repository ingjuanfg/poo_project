package com.ingjuanfg;

public class Medico extends Persona {
    private String especialidad;
    private boolean estaDisponible;

    public Medico(String nombre, String apellido, int edad, int peso, int estatura,String especialidad) {
        super(nombre, apellido, edad, peso, estatura);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}
