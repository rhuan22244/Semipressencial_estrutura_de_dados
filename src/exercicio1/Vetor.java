package exercicio1;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adicionar(int posicao, String elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return elementos[posicao];
    }

    public void alterar(int posicao, String elemento) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        elementos[posicao] = elemento;
    }

    private void aumentarCapacidade() {
        String[] novosElementos = new String[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novosElementos[i] = elementos[i];
        }
        elementos = novosElementos;
    }

    public void removerPorIndice(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public void removerPorValor(String valor) {
        int posicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(valor)) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            removerPorIndice(posicao);
        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int tamanhoAtual() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void limpar() {
        elementos = new String[elementos.length];
        tamanho = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementos, tamanho));
    }
}

