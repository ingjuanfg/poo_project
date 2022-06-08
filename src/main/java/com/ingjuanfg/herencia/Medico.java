package com.ingjuanfg.herencia;

import java.util.Map;

public class Medico extends Persona {
    // TODO: 8/06/2022
    /*
     * CONTIENE PRUEBAS UNITARIAS. VER EN MODULO TEST
     * */
    private String especialidad;
    private String turno;

    public Medico(String cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
    }

    public Medico(String cedula, String nombre, String apellido, int edad, String turno) {
        super(cedula, nombre, apellido, edad);
        this.turno = turno;
    }

    //CONSTRUCTOR QUE RECIBE UN MAPA COMO PARAMETRO DE ENTRADA
    public Medico(Map<String,String> datosMedico) {
        super(datosMedico.get("cedula"),datosMedico.get("nombre"),datosMedico.get("apellido"),Integer.parseInt(datosMedico.get("edad")));
        this.especialidad = datosMedico.get("especialidad");
        this.turno = datosMedico.get("turno");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
