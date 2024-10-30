package principal;

import contas.ContaBancaria;
import contas.ContaEspecial;
import contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;

public class Contas {
	
	private static ArrayList<ContaBancaria> contas = new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Cliente Poupança", 1234, 1000.0, 15);
		ContaEspecial contaEspecial = new ContaEspecial("Cliente Especial", 5678, 500.0, 300.0);
		 	contas.add(contaPoupanca);
	        contas.add(contaEspecial);

	        contaPoupanca.depositar(500);
	        contaEspecial.sacar(700);
	        
	        contaPoupanca.calcularNovoSaldo(1.5);
	        System.out.println(contaPoupanca);
	        System.out.println("\nDados das contas:");
	        for (ContaBancaria conta : contas) {
	            System.out.println(conta);
	        }

	        scanner.close();
	    }
	}

