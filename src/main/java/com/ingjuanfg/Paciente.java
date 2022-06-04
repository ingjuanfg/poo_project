package com.ingjuanfg;

public class Paciente extends Persona{
    private String enfermedad;
    private int dias_hospitalizado;


    public Paciente(String nombre, String apellido, int edad, String enfermedad, int dias_hospitalizado)  {
        super(nombre, apellido, edad);
        this.enfermedad = enfermedad;
        this.dias_hospitalizado = dias_hospitalizado;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getDias_hospitalizado() {
        return dias_hospitalizado;
    }

    public void setDias_hospitalizado(int dias_hospitalizado) {
        this.dias_hospitalizado = dias_hospitalizado;
    }
}
