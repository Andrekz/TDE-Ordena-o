public class BucketSort {

    static int trocas = 0;
    static int iteracoes = 0;

    static void bucketSort(int[] vetor, int tamanho) {
        int i, j, k;
        int maior = vetor[0];
        int menor = vetor[0];
        int qtdBaldes = 5; 

        
        for (i = 1; i < tamanho; i++) {
            iteracoes++;
            if (vetor[i] > maior)
                maior = vetor[i];
            if (vetor[i] < menor)
                menor = vetor[i];
        }

        int intervalo = (maior - menor) / qtdBaldes + 1;

        
        int[][] baldes = new int[qtdBaldes][tamanho];
        int[] contadores = new int[qtdBaldes];

        
        for (i = 0; i < qtdBaldes; i++) {
            contadores[i] = 0;
        }

        
        for (i = 0; i < tamanho; i++) {
            iteracoes++;
            int indice = (vetor[i] - menor) / intervalo;
            if (indice >= qtdBaldes) indice = qtdBaldes - 1;
            baldes[indice][contadores[indice]] = vetor[i];
            contadores[indice]++;
        }

        
        for (i = 0; i < qtdBaldes; i++) {
            for (j = 0; j < contadores[i] - 1; j++) {
                for (k = 0; k < contadores[i] - j - 1; k++) {
                    iteracoes++;
                    if (baldes[i][k] > baldes[i][k + 1]) {
                        int temp = baldes[i][k];
                        baldes[i][k] = baldes[i][k + 1];
                        baldes[i][k + 1] = temp;
                        trocas++;
                    }
                }
            }
        }

        
        int pos = 0;
        for (i = 0; i < qtdBaldes; i++) {
            for (j = 0; j < contadores[i]; j++) {
                vetor[pos] = baldes[i][j];
                pos++;
            }
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

        System.out.println(nome );
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor, tamanho);

        bucketSort(vetor, tamanho);

        System.out.println("Vetor após a ordenação:");
        imprimirVetor(vetor, tamanho);

        System.out.println("Total de iterações: " + iteracoes);
        System.out.println("Total de trocas: " + trocas);
        
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        testarVetor("Vetor 1", vetor1, 20);
        testarVetor("Vetor 2", vetor2, 20);
        testarVetor("Vetor 3", vetor3, 20);
    }
}
