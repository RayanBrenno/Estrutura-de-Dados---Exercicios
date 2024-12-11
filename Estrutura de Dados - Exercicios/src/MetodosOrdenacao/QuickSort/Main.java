package MetodosOrdenacao.QuickSort;

public class Main {
    public static void main(String[] args) {
        int i = 1000;
        do {
            // Teste com array ordenado
            int[] arrOrdenado = GerarArrays.GerarArrayOrdenado(i);
            long startTime = System.currentTimeMillis();
            QuickSort.quickSort(arrOrdenado, 0, arrOrdenado.length - 1);
            long endTime = System.currentTimeMillis();
            long tempoOrdenado = endTime - startTime;
            System.out.println("Método: Quick Sort (com Array ordenado) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + QuickSort.getInteracoes() 
                    + "\nQuantidade de trocas: " + QuickSort.getTrocas() 
                    + "\nTempo em ms: " + tempoOrdenado + "\n");

            QuickSort.resetCounters();

            // Teste com array ordenado inversamente
            int[] arrOrdenadoInverso = GerarArrays.GerarArrayOrdenadoInversamente(i);
            startTime = System.currentTimeMillis();
            QuickSort.quickSort(arrOrdenadoInverso, 0, arrOrdenadoInverso.length - 1);
            endTime = System.currentTimeMillis();
            long tempoOrdenadoInverso = endTime - startTime;
            System.out.println("Método: Quick Sort (com Array Inverso) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + QuickSort.getInteracoes() 
                    + "\nQuantidade de trocas: " + QuickSort.getTrocas() 
                    + "\nTempo em ms: " + tempoOrdenadoInverso + "\n");

            QuickSort.resetCounters();

            // Teste com array aleatório
            int[] arrAleatorio = GerarArrays.GerarArrayAleatorio(i);
            startTime = System.currentTimeMillis();
            QuickSort.quickSort(arrAleatorio, 0, arrAleatorio.length - 1);
            endTime = System.currentTimeMillis();
            long tempoAleatorio = endTime - startTime;
            System.out.println("Método: Quick Sort (com Array Aleatório) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + QuickSort.getInteracoes() 
                    + "\nQuantidade de trocas: " + QuickSort.getTrocas() 
                    + "\nTempo em ms: " + tempoAleatorio + "\n");
            System.out.println("------------------------------------");

            if (i == 1000) {
                i += 4000;
            } else {
                i += 5000;
            }
        } while (i <= 50000);
    }
}
