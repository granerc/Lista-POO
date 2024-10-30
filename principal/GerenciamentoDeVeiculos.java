package principal;

import entidades.Carro;
import entidades.Caminhao;
import entidades.Onibus;

public class GerenciamentoDeVeiculos {

	public static void main(String[] args) {
		
		        Carro carro = new Carro("ABC1234", "Toyota", "Corolla", 2018);
		        Caminhao caminhao = new Caminhao("XYZ5678", "Volvo", "FH", 2015);
		        Onibus onibus = new Onibus("DEF4321", "Mercedes", "Benz", 2020);

		        carro.exibirDetalhes();
		        System.out.println();
		        
		        caminhao.exibirDetalhes();
		        System.out.println();
		        
		        onibus.exibirDetalhes();
		        System.out.println();
		    }
	}

