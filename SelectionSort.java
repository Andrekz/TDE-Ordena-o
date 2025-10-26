public class SelectionSort {

    static int trocas = 0;
    static int iteracoes = 0;

    static void selectionsort(int tamanho, int[] vetor) {
        int i, j, minIndex, temp;

        for (i = 0; i < tamanho - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < tamanho; j++) {
                iteracoes++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }

            
            if (minIndex != i) {
                temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocas++;
            }
        }
    }

    static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int tamanho = 20;

        
        System.out.println("Vetor 1  antes da ordenação:");
        imprimirVetor(vetor1, tamanho);
        trocas = 0; iteracoes = 0;
        selectionsort(tamanho, vetor1);
        System.out.println("Vetor 1  após a ordenação:");
        imprimirVetor(vetor1, tamanho);
        System.out.println("Total de iterações: " + iteracoes);
        System.out.println("Total de trocas: " + trocas + "\n");

       
        System.out.println("Vetor 2  antes da ordenação:");
        imprimirVetor(vetor2, tamanho);
        trocas = 0; iteracoes = 0;
        selectionsort(tamanho, vetor2);
        System.out.println("Vetor 2  após a ordenação:");
        imprimirVetor(vetor2, tamanho);
        System.out.println("Total de iterações: " + iteracoes);
        System.out.println("Total de trocas: " + trocas + "\n");

        
        System.out.println("Vetor 3  antes da ordenação:");
        imprimirVetor(vetor3, tamanho);
        trocas = 0; iteracoes = 0;
        selectionsort(tamanho, vetor3);
        System.out.println("Vetor 3  após a ordenação:");
        imprimirVetor(vetor3, tamanho);
        System.out.println("Total de iterações: " + iteracoes);
        System.out.println("Total de trocas: " + trocas + "\n");
    }
}
