public class CocktailSort {

    static int trocas = 0;
    static int iteracoes = 0;

    static void cocktailsort(int tamanho, int[] vetor) {
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;

        while (trocou) {
            trocou = false;

            
            for (int i = inicio; i < fim; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }

            
            if (!trocou) {
                break;
            }

            
            fim--;

            trocou = false;

            
            for (int i = fim - 1; i >= inicio; i--) {
                iteracoes++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }

            
            inicio++;
        }
    }

    static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    static void testarVetor(String nome, int[] vetor, int tamanho) {
        trocas = 0;
        iteracoes = 0;

        System.out.println(nome);
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor, tamanho);

        cocktailsort(tamanho, vetor);

        System.out.println("Vetor após a ordenação:");
        imprimirVetor(vetor, tamanho);

        System.out.println("Total de iterações: " + iteracoes);
        System.out.println("Total de trocas: " + trocas + "\n");
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        testarVetor("Vetor 1 ", vetor1, 20);
        testarVetor("Vetor 2 ", vetor2, 20);
        testarVetor("Vetor 3 ", vetor3, 20);
    }
}
