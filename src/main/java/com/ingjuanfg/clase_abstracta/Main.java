package com.ingjuanfg.clase_abstracta;

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
    public static ArrayList<Persona> ciudadanos = new ArrayList<Persona>();

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
        * Al utilizar clases abstractas los metodos han sido sobrescritos en donde se considera
        * revisar clase Paciente y Medico cuales se han sobreescrito.
        * Los que no, se ejecutan según lo planteado en la clase PERSONA ahora convertida en
        * clase abstracta.
        */

        System.out.println("INFORMACION DE LOS CIUDADANOS");
        for(Persona ciudadano : ciudadanos){
            System.out.println("\n" + ciudadano.getNombre() + " -- " + ciudadano.getApellido());
            ciudadano.realizarExamen();
            ciudadano.conducir();
            ciudadano.solicitarCitaMedica();
        }
    }
}
