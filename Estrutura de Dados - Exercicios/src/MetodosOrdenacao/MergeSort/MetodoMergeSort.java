package MetodosOrdenacao.MergeSort;

public class MetodoMergeSort {

    static int trocas = 0, iteracoes = 0;

    public static int[] metodoMerge(int[] arr){

        mergeSort(arr, 0, arr.length - 1);
        return new int[] {trocas, iteracoes};

    }

    public static void mergeSort(int[] arr, int m1, int m2) {
        if (m1 < m2) {

            int divisao = (m1 + m2) / 2;

            mergeSort(arr, m1, divisao); iteracoes++;
            mergeSort(arr, divisao + 1, m2); iteracoes++;

            merge(arr, m1, divisao, m2);
        }
    }

    private static void merge(int[] arr, int m1, int divisao, int m2) {

        int tamanho1 = divisao - m1 + 1;
        int tamanho2 = m2 - divisao;

        int[] arrayM1 = new int[tamanho1];
        int[] arrayM2 = new int[tamanho2];

        for (int i = 0; i < tamanho1; i++) {
            arrayM1[i] = arr[m1 + i];
            iteracoes++;
        }
        for (int i = 0; i < tamanho2; i++) {
            arrayM2[i] = arr[divisao + i + 1];
            iteracoes++;
        }

        int i = 0, j = 0;
        int k = m1;

        while (i < tamanho1 && j < tamanho2) {
            if (arrayM1[i] <= arrayM2[j]) {
                arr[k] = arrayM1[i];
                i++;
                iteracoes++;
            } else {
                arr[k] = arrayM2[j];
                j++;
                iteracoes++;
            }
            trocas++;
            k++;
        }

        while (i < tamanho1) {
            arr[k] = arrayM1[i];
            i++; k++;
            iteracoes++;
        }
        while (j < tamanho2) {
            arr[k] = arrayM2[j];
            j++; k++;
            iteracoes++;
        }
    }

    public static void resetCounters(){
        trocas = 0; iteracoes = 0;
    }

}