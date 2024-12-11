package MetodosOrdenacao.QuickSort;

public class QuickSort {
    static int interacoes = 0; // Contador de interações
    static int trocas = 0; // Contador de trocas

    public static int partir(int[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        int pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
            do {
                startIndex++;
                interacoes++; // Contabiliza a interação
            } while (array[startIndex] < pivotValue);

            do {
                endIndex--;
                interacoes++; // Contabiliza a interação
            } while (array[endIndex] > pivotValue);

            if (startIndex >= endIndex) return endIndex;

            // Troca os elementos
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            trocas++; // Contabiliza a troca
        }
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partir(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    public static int getInteracoes() {
        return interacoes;
    }

    public static int getTrocas() {
        return trocas;
    }

    public static void resetCounters() {
        interacoes = 0;
        trocas = 0;
    }
    
}
