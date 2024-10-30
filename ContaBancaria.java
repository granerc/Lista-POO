package contas;

public class ContaBancaria {
	
	private String cliente;
	private int numeroConta;
	protected double saldo;
	
	public ContaBancaria (String cliente, int numeroConta, double saldoInicial) {
		this.cliente = cliente;
		this.numeroConta= numeroConta;
		this.saldo = saldoInicial;
		}
		
		public String getCliente(){
			return cliente;
		}
		
		public int getNumeroConta () {
			return numeroConta;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public boolean sacar (double valor) {
			if (valor > 0 && saldo >= valor) {
	            saldo -= valor;
	            return true;
		} else return false;
	}
		public void depositar (double valor) {
			if (valor > 0) {
				saldo += valor;
			}
		}
		
	@Override 
	
	public String toString() {
		return "Cliente:" + cliente + ",Número da Conta: " + numeroConta + ",Saldo: " + saldo;
	}
	
	

}
