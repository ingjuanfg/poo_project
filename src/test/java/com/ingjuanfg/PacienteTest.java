package com.ingjuanfg;

import com.ingjuanfg.herencia.Paciente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    @Test
    public void testPacienteEstaAfiliado(){
        Paciente paciente = new Paciente("1088","Juan", "Fernandez",29, true);
        assertTrue(paciente.isAfiliado());
    }

    @Test
    public void testPacienteNoEstaAfiliado(){
        Paciente paciente = new Paciente("1088","Juan", "Fernandez",29, false);
        assertFalse(paciente.isAfiliado());
    }

}
