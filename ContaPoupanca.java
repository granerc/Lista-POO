package contas;

public class ContaPoupanca extends ContaBancaria {

	private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numeroConta, double saldoInicial, int diaDeRendimento) {
        super(cliente, numeroConta, saldoInicial);
        this.diaDeRendimento = diaDeRendimento;

}
    public void calcularNovoSaldo(double taxaRendimento) {
    	if (taxaRendimento > 0) {
            saldo += saldo * taxaRendimento / 100;
            }
   }
    	
    
    @Override
    
    public String toString() {
    	return super.toString() + ".Dia de Rendimento: " + diaDeRendimento;
    }
}
   
