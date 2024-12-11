package MetodosOrdenacao.HeapSort;

public class Main {
    public static void main(String[] args) {
        int inicio = 1000;
        do {
            //Array Ordenado
            int[] arrayOrdenado = GerarArrays.GerarArrayOrdenado(inicio);
            MetodoHeapSort.trocas = 0;
            MetodoHeapSort.comparacoes = 0;
            long tempoInicial = System.currentTimeMillis();
            MetodoHeapSort.heapSort(arrayOrdenado);
            long tempoFinal = System.currentTimeMillis();
            int trocas = MetodoHeapSort.trocas;
            int comparacoes = MetodoHeapSort.comparacoes;
            System.out.println("Método: Heap Sort (com Array ordenado) \nQuantidade de elementos no array: " + inicio
                    + "\nQuantidade de Comparações: " + comparacoes
                    + "\nTempo em ms: " + (tempoFinal - tempoInicial)
                    + "\nQuantidade de Trocas: " + trocas + "\n");

            //Array Ordenado Inversamente
            int[] arrayOrdenadoInversamente = GerarArrays.GerarArrayOrdenadoInversamente(inicio);
            MetodoHeapSort.trocas = 0;
            MetodoHeapSort.comparacoes = 0;
            long tempoInicialArrInverso = System.currentTimeMillis();
            MetodoHeapSort.heapSort(arrayOrdenadoInversamente);
            long tempoFinalInverso = System.currentTimeMillis();
            int trocasInverso = MetodoHeapSort.trocas;
            int comparacoesInverso = MetodoHeapSort.comparacoes;
            System.out.println(
                    "Método: Heap Sort (com Array Ordenado Inversamente) \nQuantidade de elementos no array: " + inicio
                            + "\nQuantidade de Comparações: " + comparacoesInverso
                            + "\nTempo em ms: " + (tempoFinalInverso - tempoInicialArrInverso)
                            + "\nQuantidade de Trocas: " + trocasInverso + "\n");

            //Array Aleatório              
            int[] arrayOrdenadoAleatorio = GerarArrays.GerarArrayAleatorio(inicio);
            MetodoHeapSort.trocas = 0;
            MetodoHeapSort.comparacoes = 0;
            long tempoInicialArrAleatorio = System.currentTimeMillis();
            MetodoHeapSort.heapSort(arrayOrdenadoAleatorio);
            long tempoFinalAleatorio = System.currentTimeMillis();
            int trocasAleatorio = MetodoHeapSort.trocas;
            int comparacoesAleatorio = MetodoHeapSort.comparacoes;
            System.out.println(
                    "Método: Heap Sort (com Array Aleatório) \nQuantidade de elementos no array: " + inicio
                            + "\nQuantidade de Comparações: " + comparacoesAleatorio
                            + "\nTempo em ms: " + (tempoFinalAleatorio - tempoInicialArrAleatorio)
                            + "\nQuantidade de Trocas: " + trocasAleatorio + "\n");

            System.out.println("------------------------------------");

            if (inicio == 1000) {
                inicio += 4000;
            } else {
                inicio += 5000;
            }
        } while (inicio <= 50000);
    }
    
}
