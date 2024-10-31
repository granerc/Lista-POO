package hotel.acomodacoes;

import hotel.interfaces.Acomodacao;
import hotel.interfaces.ServicoAdicional;

public class QuartoDuplo implements Acomodacao, ServicoAdicional {
    private static final double DIARIA = 180.0;
    private static final double CAFE_DA_MANHA = 20.0;
    private static final double LIMPEZA_EXTRA = 30.0;

    @Override
    public double calcularDiaria() {
        return DIARIA;
    }

    @Override
    public double calcularServico(int dias, int numPessoas) {
        return (CAFE_DA_MANHA * numPessoas * dias) + (LIMPEZA_EXTRA * dias);
    }

    @Override
    public void exibirDetalhes(int dias, int numPessoas) {
        double custoTotal = (calcularDiaria() * dias) + calcularServico(dias, numPessoas);
        System.out.println("Quarto Duplo:");
        System.out.println("Diária: R$" + DIARIA);
        System.out.println("Custo total para " + dias + " dias com " + numPessoas + " pessoa(s): R$" + custoTotal);
    }
}

