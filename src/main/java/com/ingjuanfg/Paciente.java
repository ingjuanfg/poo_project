package com.ingjuanfg;

public class Paciente extends Persona{
    private boolean tieneDiagnostico;
    private int identificacion;

    public Paciente(String nombre, String apellido, int peso, int estatura, int edad, boolean tieneDiagnostico, int identificacion) {
        super(nombre, apellido, peso, estatura, edad);
        this.tieneDiagnostico = tieneDiagnostico;
        this.identificacion = identificacion;
    }

    public boolean isTieneDiagnostico() {
        return tieneDiagnostico;
    }

    public void setTieneDiagnostico(boolean tieneDiagnostico) {
        this.tieneDiagnostico = tieneDiagnostico;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
}
