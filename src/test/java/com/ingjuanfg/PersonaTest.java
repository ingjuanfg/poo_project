package com.ingjuanfg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
    @Test
    public void testCalcularImc(){
        Persona atleta  = new Persona("Juan","Londoño",50,176);
        assertEquals(80,atleta.calcularImc(40,2));
    }
}
