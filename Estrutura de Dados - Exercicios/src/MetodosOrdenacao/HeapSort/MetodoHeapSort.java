package MetodosOrdenacao.HeapSort;

public class MetodoHeapSort {

    static int comparacoes = 0;
    static int trocas = 0;

    public static int[] heapSort(int[] array) {
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            trocas++; // Contar a troca realizada

            heapify(array, i, 0);
        }
        return array;
    }

    static void heapify(int[] array, int size, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Se o filho esquerdo for maior que a raiz
        if (left < size) {
            comparacoes++; // Contar a comparação
            if (array[left] > array[max]) {
                max = left;
            }
        }

        // Se o filho direito for maior que o maior valor atual
        if (right < size) {
            comparacoes++; // Contar a comparação
            if (array[right] > array[max]) {
                max = right;
            }
        }

        if (max != i) {
            // Trocar a raiz com o maior valor
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            trocas++; // Contar a troca realizada

            heapify(array, size, max);
        }
    }
}
