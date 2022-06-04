package com.ingjuanfg;

public class Medico extends Persona{
    private String especialidad;
    private boolean estaDisponible;


    public Medico(String nombre, String apellido, int edad, String especialidad, boolean estaDisponible) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.estaDisponible = estaDisponible;
    }

    public Medico(String nombre, String apellido, int peso, int estatura, int edad, String especialidad, boolean estaDisponible) {
        super(nombre, apellido, peso, estatura, edad);
        this.especialidad = especialidad;
        this.estaDisponible = estaDisponible;
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
