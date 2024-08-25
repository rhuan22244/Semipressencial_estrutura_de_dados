package exercicio2;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            throw new IllegalArgumentException("Matriz não pode ser nula ou vazia.");
        }
        this.matriz = matriz;
    }

    public int obterMaiorElemento() {
        int maior = matriz[0][0];
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }
        return maior;
    }

    public int obterMenorElemento() {
        int menor = matriz[0][0];
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }

    public double calcularMedia() {
        int soma = calcularSomaTotal();
        int totalElementos = matriz.length * matriz[0].length;
        return (double) soma / totalElementos;
    }

    public int[] somarPorLinha() {
        int[] somaLinhas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int elemento : matriz[i]) {
                soma += elemento;
            }
            somaLinhas[i] = soma;
        }
        return somaLinhas;
    }

    public int[] somarPorColuna() {
        int colunas = matriz[0].length;
        int[] somaColunas = new int[colunas];
        for (int i = 0; i < colunas; i++) {
            int soma = 0;
            for (int[] linha : matriz) {
                soma += linha[i];
            }
            somaColunas[i] = soma;
        }
        return somaColunas;
    }

    public int calcularSomaTotal() {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        return soma;
    }

    public int contarOcorrencias(int valor) {
        int contador = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento == valor) {
                    contador++;
                }
            }
        }
        return contador;
    }
}

