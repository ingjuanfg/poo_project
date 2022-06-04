package com.ingjuanfg;

public class Persona {



    private String nombre;
    private String apellido;
    private  int peso;
    private int estatura;

    public Persona(String nombre, String apellido, int peso, int estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
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

    public int calcularImc(int peso, int altura){
        return  peso* altura;
    }
}
