package com.ingjuanfg;

public class Main {
    public static void main(String[] args) {
        // Persona persona = new Persona("Juan", "Fernandez", 29);
        // Persona personaDos = new Persona("Juan", "Fernandez", 29);
        Medico medico = new Medico("Juan", "Fernandez", 29, "Cardiologo");
        Paciente paciente = new Paciente("Ana", "Gonzalez", 45, 155, 14, 701, "Apendicitis");

        System.out.println("MEDICO");
        medico.asignacionSalaCita();
        medico.realizarExamenMedico();
        medico.solicitarCitaMedica();

        System.out.println("PACIENTE");
        paciente.asignacionSalaCita();
        paciente.realizarExamenMedico();
        paciente.solicitarCitaMedica();
    }
}