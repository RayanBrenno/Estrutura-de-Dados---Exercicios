package MetodosOrdenacao.InsertSort;

public class Main {
    public static void main(String[] args) {
        int inicio = 1000;
        do {
            int[] arrayOrdenado = GerarArrays.GerarArrayOrdenado(inicio);
            long tempoInicial = System.currentTimeMillis();
            int[] resultadoOrdenado = MetodoInsertSort.insertSort(arrayOrdenado);
            int trocas = resultadoOrdenado[1];
            int interacoesArrayOrdenado = resultadoOrdenado[0];
            long tempoFinal = System.currentTimeMillis();
            System.out.println("Método: Insert Sort (com Array ordenado) \nQuantidade de elementos no array: " + inicio
                    + "\nQuantidade de Iterações: " + interacoesArrayOrdenado + "\nTempo em ms: "
                    + (tempoFinal - tempoInicial) + "\nQuantidade de trocas: " + trocas + "\n");

            int[] arrayOrdenadoInversamente = GerarArrays.GerarArrayOrdenadoInversamente(inicio);
            long tempoInicialArrInverso = System.currentTimeMillis();
            int[] resultadoInverso = MetodoInsertSort.insertSort(arrayOrdenadoInversamente);
            int trocasInverso = resultadoInverso[1];
            int interacoesArrayinverso = resultadoInverso[0];
            long tempoFinalArrInverso = System.currentTimeMillis();
            System.out.println("Método: Insert Sort (com Array Inverso) \nQuantidade de elementos no array: " + inicio
                    + "\nQuantidade de Iterações: " + interacoesArrayinverso + "\nTempo em ms: "
                    + (tempoFinalArrInverso - tempoInicialArrInverso) + "\nQuantidade de trocas: " + trocasInverso + "\n");

            int[] arrayOrdenadoAleatorio = GerarArrays.GerarArrayAleatorio(inicio);
            long tempoInicialArrAleatorio = System.currentTimeMillis();
            int[] resultadoAleatorio = MetodoInsertSort.insertSort(arrayOrdenadoAleatorio);
            int trocasAleatorio = resultadoAleatorio[1];
            int interacoesArrayAleatorio = resultadoAleatorio[0];
            long tempoFinalArrAleatorio = System.currentTimeMillis();
            System.out.println("Método: Insert Sort (com Array Aleatório) \nQuantidade de elementos no array: " + inicio
                    + "\nQuantidade de Iterações: " + interacoesArrayAleatorio + "\nTempo em ms: "
                    + (tempoFinalArrAleatorio - tempoInicialArrAleatorio) + "\nQuantidade de trocas: " + trocasAleatorio + "\n");

            System.out.println("------------------------------------");

            if (inicio == 1000) {
                inicio += 4000;
            } else {
                inicio += 5000;
            }
        } while (inicio <= 50000);
    }
}
