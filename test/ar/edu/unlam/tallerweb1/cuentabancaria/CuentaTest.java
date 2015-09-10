package ar.edu.unlam.tallerweb1.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void depositoTest() {
		
		Cuenta depositar= new Cuenta(0.0);
		depositar.deposito(40.00);
		
		Assert.assertTrue(40.00 == depositar.obtenerSaldo());
		
		depositar.deposito(-15);
		Assert.assertFalse(-15 == depositar.obtenerSaldo());
	}
}
