package com.ingjuanfg.interfaces;

import java.util.Map;

public class Paciente extends Persona implements Farmacia {
    private String enfermedad;
    private boolean isAfiliado;
    private String eps;

    public Paciente(String cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
    }

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

    public void conducir(){
        System.out.println("Conducir un vehiculo CLASE PACIENTE");
    }

    public void solicitarCitaMedica(){
        System.out.println("Solicita Cita Medica CLASE PACIENTE");
    }

    @Override
    public void asignarMedicamentos() {
        System.out.println("No tiene permisos para asignar medicamentos por tu rol");
    }

    @Override
    public void reclamarMedicamentos() {
        System.out.println("Medicamentos asignados. Estan listos para reclamar");
    }
}
