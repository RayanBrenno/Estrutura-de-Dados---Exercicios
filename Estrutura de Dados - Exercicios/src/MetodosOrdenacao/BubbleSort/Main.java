package MetodosOrdenacao.BubbleSort;
public class Main {
    public static void main(String[] args) {
        int i = 1000;
        do{
            // Teste com array ordenado
            int[] arrOrdenado = GerarArrays.GerarArrayOrdenado(i);
            long startTime = System.currentTimeMillis();
            int[] resultadoOrdenado = MetodoBubbleSort.bubbleSort(arrOrdenado);
            int trocasOrdenado = resultadoOrdenado[0];
            int interacoesOrdenado = resultadoOrdenado[1];
            long endTime = System.currentTimeMillis();
            long tempoOrdenado = endTime - startTime;
            System.out.println("Método: Bubble Sort (com Array ordenado) \nQuatidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesOrdenado + "\nTempo em ms: " + tempoOrdenado
                    + "\nQuantidade de trocas: " + trocasOrdenado + "\n");

            // Teste com array ordenado inversamente
            int[] arrOrdenadoInverso = GerarArrays.GerarArrayOrdenadoInversamente(i);
            startTime = System.currentTimeMillis();
            int[] resultadoOrdenadoInversamente = MetodoBubbleSort.bubbleSort(arrOrdenadoInverso);
            int trocasOrdenadoInverso = resultadoOrdenadoInversamente[0];
            int interacoesOrdenadoInverso = resultadoOrdenadoInversamente[1];
            endTime = System.currentTimeMillis();
            long tempoOrdenadoInverso = endTime - startTime;
            System.out.println("Método: Bubble Sort (com Array Inverso) \nQuatidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesOrdenadoInverso + "\nTempo em ms: "
                    + tempoOrdenadoInverso + "\nQuantidade de trocas: " + trocasOrdenadoInverso + "\n");

            // Teste com array aleatório
            int[] arrAleatorio = GerarArrays.GerarArrayAleatorio(i);
            startTime = System.currentTimeMillis();
            int[] resultadoAleatorio = MetodoBubbleSort.bubbleSort(arrAleatorio);
            int trocasAleatorio = resultadoAleatorio[0];
            int interacoesAleatorio = resultadoAleatorio[1];
            endTime = System.currentTimeMillis();
            long tempoAleatorio = endTime - startTime;
            System.out.println("Método: Bubble Sort (com Array Aleatório) \nQuatidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesAleatorio + "\nTempo em ms: " + tempoAleatorio
                    + "\nQuantidade de trocas: " + trocasAleatorio + "\n");
            System.out.println("------------------------------------");

            if (i == 1000) {
                i += 4000;
            } else {
                i += 5000;
            }
        } while (i <= 50000);

        i = 1000;
        do{
            int[] arrOrdenado = GerarArrays.GerarArrayOrdenado(i);
            long startTime = System.currentTimeMillis();
            int[] resultadoOrdenado = MetodoBubbleSort.bubbleSortOtimizado(arrOrdenado);
            int trocasOtimizadoOrdenado = resultadoOrdenado[0];
            int interacoesOrdenado = resultadoOrdenado[1];
            long endTime = System.currentTimeMillis();
            long tempoOrdenado = endTime - startTime;
            System.out.println("Método: Bubble Sort Otimizado (com Array ordenado) \nQuantidade de elementos no array: "
                    + i + "\nQuantidade de Iterações: " + interacoesOrdenado + "\nTempo em ms: " + tempoOrdenado
                    + "\nQuantidade de trocas: " + trocasOtimizadoOrdenado + "\n");
        
            int[] arrOrdenadoInverso = GerarArrays.GerarArrayOrdenadoInversamente(i);
            startTime = System.currentTimeMillis();
            int[] resultadoInverso = MetodoBubbleSort.bubbleSortOtimizado(arrOrdenadoInverso);
            int trocasOtimizadoInverso = resultadoInverso[0];
            int interacoesOrdenadoInverso = resultadoInverso[1];
            endTime = System.currentTimeMillis();
            long tempoOrdenadoInverso = endTime - startTime;
            System.out.println("Método: Bubble Sort Otimizado (com Array Inverso) \nQuantidade de elementos no array: "
                    + i + "\nQuantidade de Iterações: " + interacoesOrdenadoInverso + "\nTempo em ms: "
                    + tempoOrdenadoInverso + "\nQuantidade de trocas: " + trocasOtimizadoInverso + "\n");
        
            int[] arrAleatorio = GerarArrays.GerarArrayAleatorio(i);
            startTime = System.currentTimeMillis();
            int[] resultadoAleatorio = MetodoBubbleSort.bubbleSortOtimizado(arrAleatorio);         
            int trocasOtimizadoAleatorio = resultadoAleatorio[0];
            int interacoesOrdenadoAleatorio = resultadoAleatorio[1];
            endTime = System.currentTimeMillis();
            long tempoAleatorio = endTime - startTime;
            System.out.println("Método: Bubble Sort Otimizado (com Array Aleatório) \nQuantidade de elementos no array: "
                    + i + "\nQuantidade de Iterações: " + interacoesOrdenadoAleatorio + "\nTempo em ms: "
                    + tempoAleatorio + "\nQuantidade de trocas: " + trocasOtimizadoAleatorio + "\n");
        
            System.out.println("-----------------------------------");

            if (i == 1000) {
                i += 4000;
            } else {
                i += 5000;
            }
        } while (i <= 50000);
        
    }
}
