package MetodosOrdenacao.BubbleSort;

public class MetodoBubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int iteracoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                iteracoes++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocas++;
                }
            }
        }
        return new int[] { trocas, iteracoes };
    }

    public static int[] bubbleSortOtimizado(int[] arr) {
        int n = arr.length;
        int interacoes = 0; 
        int trocas = 0;    
        boolean trocou;
    
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                interacoes++; 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocas++;  
                    trocou = true; 
                }
            }
            if (!trocou)
                break;
        }
        return new int[] { trocas, interacoes };
    }
    
}
