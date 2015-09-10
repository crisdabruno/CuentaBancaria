package ar.edu.unlam.tallerweb1.cuentabancaria;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta (double saldo){
		
		this.saldo=saldo;
	}
	
	public boolean deposito(double aDepositar){
	
		if (aDepositar>0){
			this.saldo=this.saldo+ aDepositar;
			return true;
		}
		else{
			return false;
		}
	}
	
	public double obtenerSaldo(){
		
		return this.saldo=saldo;
	}
}
