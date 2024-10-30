package entidades;

public class Onibus extends Veiculo {
	    private static final double TAXA_IPVA = 0.02;
	    private static final int DESVALORIZACAO_ANUAL = 3000;

	    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
	        super(placa, marca, modelo, anoFabricacao);
	    }

	    public double valorEstimado() {
	        int idade = 2024 - getAnoFabricacao();
	        return Math.max(0, 80000 - (idade * DESVALORIZACAO_ANUAL));
	    }

	    @Override
	    public double calcularIPVA() {
	        return valorEstimado() * TAXA_IPVA;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Ônibus:");
	        System.out.println("Placa: " + getPlaca());
	        System.out.println("Marca: " + getMarca());
	        System.out.println("Modelo: " + getModelo());
	        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
	        System.out.println("Valor Estimado: " + valorEstimado());
	        System.out.println("IPVA: " + calcularIPVA());
	    }
	}
