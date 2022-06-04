package com.ingjuanfg;

public class Persona {
    private String nombre;
    private String apellido;
    private int peso;
    private int estatura;
    private int edad;

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int peso, int estatura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int calculoImc(int peso, int altura){
        return peso + altura;
    }
}