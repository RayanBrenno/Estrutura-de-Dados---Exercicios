package MetodosOrdenacao.InsertSort;

public class MetodoInsertSort {

    public static int[] insertSort(int[] array) {
        int contador = 0; // Contador de interações
        int trocas = 0;   // Contador de trocas
    
        for (int i = 1; i < array.length; i++) {
            int indiceAtual = i;
            contador++; 
            while (indiceAtual > 0 && array[indiceAtual - 1] > array[indiceAtual]) {
                int temp = array[indiceAtual];
                array[indiceAtual] = array[indiceAtual - 1];
                array[indiceAtual - 1] = temp;
                indiceAtual--;
                contador++; 
                trocas++; 
            }
        }
        return new int[]{contador, trocas}; 
    }
}
