package hotel.principal;

import hotel.acomodacoes.QuartoSimples;
import hotel.acomodacoes.QuartoDuplo;
import hotel.acomodacoes.Suite;

import java.util.Scanner;

public class GerenciamentoHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias da hospedagem: ");
        int dias = scanner.nextInt();

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        QuartoSimples quartoSimples = new QuartoSimples();
        QuartoDuplo quartoDuplo = new QuartoDuplo();
        Suite suite = new Suite();

        System.out.println("\n--- Detalhes das Acomodações ---");
        
        quartoSimples.exibirDetalhes(dias, numPessoas);
        System.out.println();
        
        quartoDuplo.exibirDetalhes(dias, numPessoas);
        System.out.println();
        
        suite.exibirDetalhes(dias, numPessoas);

        scanner.close();
    }
}
