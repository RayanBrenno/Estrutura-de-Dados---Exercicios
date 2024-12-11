package MetodosOrdenacao.MergeSort;

public class Main {

    public static void main(String[] args) {

        int i = 1000;
        do {

            // Teste com array ordenado
            int[] arrOrdenado = GerarArrays.GerarArrayOrdenado(i);
            long startTime = System.currentTimeMillis();
            int[] MMS = MetodoMergeSort.metodoMerge(arrOrdenado);

            int trocas = MMS[0];
            int iteracoes = MMS[1];
            long endTime = System.currentTimeMillis();
            long tempo = endTime - startTime;

            System.out.println("Método: Merge Sort (com Array Ordenado)"
                    + "\nQuantidade de elementos no array: " + i
                    + "\nQuantidade de iterações: " + iteracoes
                    + "\nQuantidade de trocas: " + trocas
                    + "\nTempo em ms: " + tempo + "\n");

            MetodoMergeSort.resetCounters();

            // Teste com array inverso
            int[] arrInverso = GerarArrays.GerarArrayOrdenadoInversamente(i);
            startTime = System.currentTimeMillis();
            MMS = MetodoMergeSort.metodoMerge(arrInverso);

            trocas = MMS[0];
            iteracoes = MMS[1];
            endTime = System.currentTimeMillis();
            tempo = endTime - startTime;

            System.out.println("Método: Merge Sort (com Array Inversamente Ordenado)"
                    + "\nQuantidade de elementos no array: " + i
                    + "\nQuantidade de iterações: " + iteracoes
                    + "\nQuantidade de trocas: " + trocas
                    + "\nTempo em ms: " + tempo + "\n");

            MetodoMergeSort.resetCounters();

            // Teste com array aleatório
            int[] arrAleatorio = GerarArrays.GerarArrayAleatorio(i);
            startTime = System.currentTimeMillis();
            MMS = MetodoMergeSort.metodoMerge(arrAleatorio);

            trocas = MMS[0];
            iteracoes = MMS[1];
            endTime = System.currentTimeMillis();
            tempo = endTime - startTime;

            System.out.println("Método: Merge Sort (com Array Aleatorio)"
                    + "\nQuantidade de elementos no array: " + i
                    + "\nQuantidade de iterações: " + iteracoes
                    + "\nQuantidade de trocas: " + trocas
                    + "\nTempo em ms: " + tempo + "\n");
            System.out.println("------------------------------------");

            MetodoMergeSort.resetCounters();

            if (i == 1000) {
                i += 4000;
            } else {
                i += 5000;
            }
        } while (i <= 50000);

    }

}