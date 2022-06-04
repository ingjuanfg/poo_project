package com.ingjuanfg;

public class Persona {
    //atributos que puede tener la persona
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    private int estatura;
    //modificadores de acceso
    //depende el nivel de acceso que queremos garantizar
    //default po defecto
    //protected
    //private solo se accede desde la clase
    //public desde cualquier parte se puede usar

    //get -setmetodos atraves de los que accedo a mi informacion
    //obtener el nombre get
    //set ya no se retorna se envia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int calculoImc(int peso, int persona) {
        return peso + persona;
    }

    public Persona(String nombre, String apellido, int edad, int peso, int estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
}