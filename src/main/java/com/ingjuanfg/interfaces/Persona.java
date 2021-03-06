package com.ingjuanfg.interfaces;

public abstract class Persona implements Clinica {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(){}

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void solicitarCitaMedica(){
        System.out.println("Solicita Cita Medica CLASE PADRE");
    }

    public void realizarExamen(){
        System.out.println("Realizar examen CLASE PADRE");
    }

    public void conducir(){
        System.out.println("Conducir un vehiculo CLASE PADRE");
    }

    public void ingresoClinica(){
        System.out.println("Solicitud ingreso con Carnet para persona médico");
    }
}
