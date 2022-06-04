package com.ingbrayanh;

public class Medico extends Persona{
    private String especialidad;
    private boolean estaDisponible;

    public Medico(String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    public Medico(String nombre, String apellido, int peso, int estatura, int edad) {
        super(nombre, apellido, peso, estatura, edad);
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
