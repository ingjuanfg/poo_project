package com.ingjuanfg;

import com.ingjuanfg.herencia.Medico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {

    @Test
    public void testMedicoTieneTurnoDiurno(){
        Medico medico = new Medico("1088","Juan", "Fernandez",29, "Diurno");
        assertEquals("Diurno", medico.getTurno());
    }
}
