public class GnomeSort {
    
    public static void gnomeSort(int[] ar, int n) {
        int i = 0;
        int trocas = 0;
        int iteracoes = 0;

        while (i < n) {
            iteracoes++;

            if (i == 0 || ar[i - 1] <= ar[i]) {
                i++;
            } else {
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[i - 1] = tmp;
                trocas++;
                i--;
            }
        }

        
        System.out.print("Vetor ordenado: ");
        for (int j = 0; j < n; j++) {
            System.out.print(ar[j] + " ");
        }
        System.out.println();
        System.out.println("Total de trocas: " + trocas);
        System.out.println("Total de iterações: " + iteracoes);
        
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        System.out.println("Vetor 1");
        gnomeSort(vetor1, 20);

        System.out.println("Vetor 2 ");
        gnomeSort(vetor2, 20);

        System.out.println("Vetor 3");
        gnomeSort(vetor3, 20);
    }
}
