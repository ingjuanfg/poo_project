package com.ingjuanfg;

public class Paciente extends Persona{

    private boolean esAfiliado;

    public Paciente(String nombre, String apellido, int edad, boolean esAfiliado) {
        super(nombre, apellido, edad);
        this.esAfiliado = esAfiliado;
    }

    public boolean isEsAfiliado() {
        return esAfiliado;
    }

    public void setEsAfiliado(boolean esAfiliado) {
        this.esAfiliado = esAfiliado;
    }

}
