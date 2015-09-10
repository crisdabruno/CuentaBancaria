package ar.edu.unlam.tallerweb1.cuentabancaria;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta (double saldo){
		
		this.saldo=saldo;
	}
	
	public boolean deposito(double aDepositar)
	{
	
		if (aDepositar>0){
			this.saldo=this.saldo+ aDepositar;
			System.out.println("Deposito exitoso, su saldo a la fecha es " + this.saldo);
			return true;
		}
		else{
			return false;
		}
	}
	
	public double obtenerSaldo(){
		
		System.out.println("Su saldo a la fecha es " + this.saldo);
		return this.saldo;
		
	}
	
	public boolean extrato(double aExtraer)
	{
		if (aExtraer <= this.saldo && aExtraer >0) 
		{
			this.saldo=this.saldo-aExtraer;
			System.out.println("Extrato exitoso, su saldo a la fecha es " + this.saldo);
			return true;
		}
		else
		{
			return false;	
		}	
	}
}
