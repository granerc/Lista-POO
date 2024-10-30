package contas;

public class ContaEspecial extends ContaBancaria {
	private double limite;
	public ContaEspecial(String cliente, int numeroConta, double saldoInicial, double limite) {
        
		   
		super(cliente, numeroConta, saldoInicial);
		        this.limite = limite;
		    }
	
	@Override 
	 public boolean sacar(double valor) {
      
		if (valor > 0 && saldo + limite >= valor) {
		    saldo -= valor;
		    return true; 
		}else 
			return false; 
	}
	
	@Override
    
	   
	public String toString() {
	        
	     

	   
	return super.toString() + ", Limite: " + limite;
	    }
}
