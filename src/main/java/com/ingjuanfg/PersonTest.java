package com.ingjuanfg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class PersonTest {

	@Test
	public void testCalcularImc() {
		Persona atleta = new Persona();
		assertEquals(80, atleta.calculoImc(40, 40));
		
	}
	

}
