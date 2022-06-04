package com.ingjuanfg;

public class Paciente extends Persona{

    private String enfermedad;

    public Paciente(String nombre, String apellido, int edad,  String enfermedad) {
        super(nombre, apellido, edad);
        this.enfermedad=enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
}
