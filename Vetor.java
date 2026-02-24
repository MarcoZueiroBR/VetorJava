package estrutura_de_dados;

public class Vetor {
    private String[] lista;
    private int tamanho;

    // Construtor do vetor; irá definir a quantidade de valores que o vetor terá, e definirá o tamanho como 0.
    public Vetor(int quantidade) {
        this.lista = new String[quantidade];
        this.tamanho = 0;
    }

    // Método para adicionar algo ao vetor.
    public void adicionar(String elemento) {
        this.lista[tamanho] = elemento;
        tamanho++;
    }

    // Esse método irá verificar se o vetor está vazia; retornando true caso esteja.
    public boolean verificarSeVetorVazio() {
        if (tamanho == 0) {
            System.out.println("O Vetor está vazio.");
            return true;
        }
        return false;
    }

    // Método para pegar o ultimo elemento válido, caso esteja vazio; uma exception irá ser lançada.
    public void ultimoElementoValidoLista() {
        if (verificarSeVetorVazio()) {
            throw new IllegalStateException("Elemento não pode ser encontrado");
        } else {
            System.out.println(lista[tamanho - 1]);
        }
    }

    // Método para imprimir toda a lista, usando o for.
    public void ImprimirVetor() {
        for (String s : lista) {
            System.out.println(s);
        }
    }

    // Método para buscar algum elemento no Vetor; dizendo se existe e em qual posição o mesmo está.
    public boolean buscarElemento(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                System.out.println("O Elemento '" + elemento + "' está no Vetor, no Indíce " + i);
                return true;
            }
        }
        System.out.println("O Elemento '" + elemento + "' não está no Vetor");
        return false;
    }

    // Método para limpar o vetor. No caso específico do String, deixando todas as posições com "null".
    public void limparVetor() {
        int quantidade = this.lista.length;
        this.lista = new String[quantidade];
    }

    // Método para contar quantas vezes um elemento aparece na lista; passando por toda lista e contando quantas vezes ele aparece.
    public void contarOcorrencias(String elemento) {
        int vezes = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                vezes++;
            }
        }
        if (vezes == 0) {
            System.out.println("O Elemento '" + elemento + "' não aparece nenhuma vez no Vetor");
        } else {
            System.out.println("O Elemento '" + elemento + "' aparece " + vezes + " vezes no Vetor");
        }
    }

    // Método para substituir um elemento por um novo; passando por toda a lista e substituindo quando encontrar o equivalente ao antigo.
    public void substituir(String elemento_antigo, String elemento_novo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento_antigo) {
                this.lista[i] = elemento_novo;
            }
        }
    }

}