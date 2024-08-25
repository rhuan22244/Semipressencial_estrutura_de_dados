package exercicio1;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println(vetor);

        vetor.adicionar(1, "E");
        System.out.println(vetor);

        System.out.println("Elemento na posição 2: " + vetor.obter(2));

        vetor.alterar(2, "F");
        System.out.println(vetor);

        vetor.removerPorIndice(2);
        System.out.println(vetor);

        vetor.removerPorValor("E");
        System.out.println(vetor);

        System.out.println("Contém 'A'? " + vetor.contem("A"));
        System.out.println("Tamanho atual: " + vetor.tamanhoAtual());
        System.out.println("Está vazio? " + vetor.estaVazio());

        vetor.limpar();
        System.out.println("exercicio1.Vetor após limpar: " + vetor);
    }
}
