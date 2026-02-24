package estrutura_de_dados;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("Diogo");
        vetor.adicionar("JoÃ£o");
        vetor.adicionar("Samuel Prata");
        vetor.adicionar("Samuel Prata");

        vetor.verificarSeVetorVazio();
        vetor.ImprimirVetor();
        vetor.ultimoElementoValidoLista();
        vetor.buscarElemento("Samuel Prata");
        vetor.contarOcorrencias("Samuel Prata");
        vetor.substituir("Samuel Prata", "Marco");
        vetor.ImprimirVetor();
        vetor.limparVetor();
        vetor.ImprimirVetor();

    }
}
