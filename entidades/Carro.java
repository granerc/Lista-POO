package entidades;

public class Carro extends Veiculo {
	    private static final double TAXA_IPVA = 0.04;
	    private static final int DESVALORIZACAO_ANUAL = 2000;

	    public Carro(String placa, String marca, String modelo, int anoFabricacao) {
	        super(placa, marca, modelo, anoFabricacao);
	    }

	    public double valorEstimado() {
	        int idade = 2024 - getAnoFabricacao();
	        return Math.max(0, 50000 - (idade * DESVALORIZACAO_ANUAL));
	    }

	    @Override
	    public double calcularIPVA() {
	        return valorEstimado() * TAXA_IPVA;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Carro:");
	        System.out.println("Placa: " + getPlaca());
	        System.out.println("Marca: " + getMarca());
	        System.out.println("Modelo: " + getModelo());
	        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
	        System.out.println("Valor Estimado: " + valorEstimado());
	        System.out.println("IPVA: " + calcularIPVA());
	    }
	}

