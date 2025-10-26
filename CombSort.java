public class CombSort {

    static int trocas = 0;
    static int iteracoes = 0;

    static void combSort(int[] vetor, int tamanho) {
        int gap = tamanho;          
        float shrink = 1.3f;        
        boolean sorted = false;

        while (!sorted) {
            gap = (int)(gap / shrink);
            if (gap <= 1) {
                gap = 1;
                sorted = true;  
            }

            for (int i = 0; i + gap < tamanho; i++) {
                iteracoes++;  
                if (vetor[i] > vetor[i + gap]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocas++;
                    sorted = false; 
                }
            }
        }
    }

    static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[][] vetores = {vetor1, vetor2, vetor3};

        for (int v = 0; v < vetores.length; v++) {
            trocas = 0;
            iteracoes = 0;
            System.out.println("Vetor " + (v+1) + " antes da ordenação:");
            imprimirVetor(vetores[v]);

            combSort(vetores[v], vetores[v].length);

            System.out.println("Vetor " + (v+1) + " após a ordenação:");
            imprimirVetor(vetores[v]);
            System.out.println("Total de iterações: " + iteracoes);
            System.out.println("Total de trocas: " + trocas);
            
        }
    }
}
