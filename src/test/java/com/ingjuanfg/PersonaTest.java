package com.ingjuanfg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void TestCalcularImc(){
        Persona atleta = new Persona();
        assertEquals(80, atleta.calculoImc(40,40));
    }







}