package ar.edu.unlam.tallerweb1.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void depositoTest() {
		
		Cuenta depositar= new Cuenta(60.00);
		depositar.deposito(40.00);
		
		Assert.assertTrue(100.00 == depositar.obtenerSaldo());
		
		depositar.deposito(-15);
		Assert.assertFalse(-15 == depositar.obtenerSaldo());
	}
	
	@Test
	public void extratoTest(){
		
		Cuenta extraer= new Cuenta(300.00);
		
		Assert.assertTrue(extraer.extrato(20.00)==true);
	}
	
	
	@Test
	public void consultaSaldoTest(){
		
		Cuenta consulta=new Cuenta(0.0);		
		Assert.assertTrue(consulta.obtenerSaldo()==0);
	}
}
