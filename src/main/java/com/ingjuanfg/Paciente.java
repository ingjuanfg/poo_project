package com.ingjuanfg;

public class Paciente extends Persona{
    private int habitacion;
    private String enfermedad;

    public Paciente(String nombre, String apellido, int peso, int estatura, int edad, int habitacion, String enfermedad) {
        super(nombre, apellido, peso, estatura, edad);
        this.habitacion = habitacion;
        this.enfermedad = enfermedad;
    }
}
