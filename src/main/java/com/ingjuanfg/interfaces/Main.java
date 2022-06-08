package com.ingjuanfg.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    // TODO: 8/06/2022
    /*
    Arraylist para guardar 2 objetos de tipo Persona correspondientes al medico y paciente
    Al recibir como tipo de datos la clase Persona permite recibir objetos de Medico y Paciente
    ya que son clases hijos de Persona por heredar sus atributos y metodo.

    Map: Permite guardar información usando una estructura de CLAVE - VALOR.
    */
    public static ArrayList<Persona> ciudadanos = new ArrayList<>();

    public static void main(String[] args) {
        Map<String, String> datosMedico = new HashMap<>();
        datosMedico.put("cedula", "1088");
        datosMedico.put("nombre", "Juan");
        datosMedico.put("apellido", "Fernandez");
        datosMedico.put("edad", "29");
        datosMedico.put("especialidad", "Pediatra");
        datosMedico.put("turno", "Diurno");

        Map<String, String> datosPaciente = new HashMap<>();
        datosPaciente.put("cedula", "2088");
        datosPaciente.put("nombre", "Pepe");
        datosPaciente.put("apellido", "Perez");
        datosPaciente.put("edad", "12");
        datosPaciente.put("enfermedad", "Anemia");
        datosPaciente.put("isAfiliado", "true");
        datosPaciente.put("eps", "Sura");

        // TODO: 8/06/2022
        //Objetos de cada uno de los actores involucrados en el ejemplo
        //Inicializando el constructor con los Map declarados anteriormente.
        Medico drFernandez = new Medico(datosMedico);
        Paciente ninoPerez = new Paciente(datosPaciente);

        //Se agregan los objetos al Arraylist declarado al inicio
        ciudadanos.add(drFernandez);
        ciudadanos.add(ninoPerez);

        // TODO: 8/06/2022
        /*
        * En este caso ya manejamos 2 interfaces. Cada interfaz tiene unos metodos particuales
        * Una esta siendo manejada desde la clase abstracta (Clinica), la interface Farmacia
        * esta siendo utilizada y sobreescrita directamente sobre la clase Paciente y Medico
        * Esto con el fin de mostrar que se puede Heredar e Implementar clases a la vez sin
        * usar una abstracta como intermediaria. Esto ya es según la estrategia y necesidad.
        * */

        System.out.println("INFORMACION DE LOS CIUDADANOS");
        for(Persona ciudadano : ciudadanos){
            System.out.println(ciudadano.getNombre() + " -- " + ciudadano.getApellido());
            ciudadano.conducir();
            ciudadano.ingresoClinica();
        }

        // TODO: 8/06/2022
        /*Aqui se imprime la información de manera individual por objeto, pero los mismos metodos
        para evaluar el resultado de la sobreescritura realizada por cada clase en particular
        * */

        System.out.println("ACCIONES\n");
        System.out.println("Acciones del médico");
        drFernandez.asignarMedicamentos();
        drFernandez.reclamarMedicamentos();
        drFernandez.conducir();
        drFernandez.solicitarCitaMedica();
        drFernandez.realizarExamen();
        drFernandez.ingresoClinica();

        System.out.println("\n Acciones del paciente");
        ninoPerez.asignarMedicamentos();
        ninoPerez.reclamarMedicamentos();
        ninoPerez.conducir();
        ninoPerez.solicitarCitaMedica();
        ninoPerez.realizarExamen();
        ninoPerez.ingresoClinica();
    }
}
