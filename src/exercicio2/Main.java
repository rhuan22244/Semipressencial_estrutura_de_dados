package exercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] dados = {
                {3, 5, 1},
                {7, 2, 8},
                {4, 6, 9}
        };

        Matriz matriz = new Matriz(dados);

        System.out.println("Maior elemento: " + matriz.obterMaiorElemento());
        System.out.println("Menor elemento: " + matriz.obterMenorElemento());
        System.out.println("Média dos elementos: " + matriz.calcularMedia());
        System.out.println("Soma por linha: " + Arrays.toString(matriz.somarPorLinha()));
        System.out.println("Soma por coluna: " + Arrays.toString(matriz.somarPorColuna()));
        System.out.println("Soma total: " + matriz.calcularSomaTotal());
        System.out.println("Ocorrências do valor 2: " + matriz.contarOcorrencias(2));
    }
}
