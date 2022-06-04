package com.ingjuanfg;

public class Paciente extends Persona {

    private String id;
    private String enfermedad;

    public Paciente(String nombre, String apellido, String id, String enfermedad) {
        super(nombre, apellido);
        this.id = id;
        this.enfermedad = enfermedad;
    }
}
