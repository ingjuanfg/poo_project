package com.ingjuanfg.herencia;

import java.util.Map;

public class Paciente extends Persona {
    // TODO: 8/06/2022
    /*
    * CONTIENE PRUEBAS UNITARIAS. VER EN MODULO TEST
    * */
    private String enfermedad;
    private boolean isAfiliado;
    private String eps;

    public Paciente(String cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
    }

    public Paciente(String cedula, String nombre, String apellido, int edad, boolean isAfiliado) {
        super(cedula, nombre, apellido, edad);
        this.isAfiliado = isAfiliado;
    }

    //CONSTRUCTOR QUE RECIBE UN MAPA COMO PARAMETRO DE ENTRADA
    public Paciente(Map<String, String> datosPaciente) {
        super(datosPaciente.get("cedula"), datosPaciente.get("nombre"), datosPaciente.get("apellido"), Integer.parseInt(datosPaciente.get("edad")));
        this.enfermedad =datosPaciente.get("enfermedad");
        this.isAfiliado =Boolean.parseBoolean(datosPaciente.get("afiliado"));
        this.eps =datosPaciente.get("eps");
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean isAfiliado() {
        return isAfiliado;
    }

    public void setAfiliado(boolean afiliado) {
        isAfiliado = afiliado;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
}
