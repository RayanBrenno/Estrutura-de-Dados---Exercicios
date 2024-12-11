package MetodosOrdenacao.SelectionSort;

public class Main {
    public static void main(String[] args) {

        int i = 1000;
        do {
            // Teste com array ordenado
            int[] arrOrdenado = GerarArrays.GerarArrayOrdenado(i);
            long startTime = System.currentTimeMillis();
            int[] resultadoOrdenado = MetodoSelecao.selecao(arrOrdenado);
            int interacoesOrdenado = resultadoOrdenado[0];
            int trocasOrdenado = resultadoOrdenado[1];
            long endTime = System.currentTimeMillis();
            long tempoOrdenado = endTime - startTime;
            System.out.println("Método: Selection Sort (com Array ordenado) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesOrdenado + "\nTempo em ms: " + tempoOrdenado
                    + "\nQuantidade de trocas: " + trocasOrdenado + "\n");

            // Teste com array inverso
            int[] arrInverso = GerarArrays.GerarArrayOrdenadoInversamente(i);
            startTime = System.currentTimeMillis();
            int[] resultadoInverso = MetodoSelecao.selecao(arrInverso);
            int interacoesInverso = resultadoInverso[0];
            int trocasInverso = resultadoInverso[1];
            endTime = System.currentTimeMillis();
            long tempoInverso = endTime - startTime;
            System.out.println("Método: Selection Sort (com Array Inverso) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesInverso + "\nTempo em ms: " + tempoInverso
                    + "\nQuantidade de trocas: " + trocasInverso + "\n");

            // Teste com array aleatório
            int[] arrAleatorio = GerarArrays.GerarArrayAleatorio(i);
            startTime = System.currentTimeMillis();
            int[] resultadoAleatorio = MetodoSelecao.selecao(arrAleatorio);
            int interacoesAleatorio = resultadoAleatorio[0];
            int trocasAleatorio = resultadoAleatorio[1];
            endTime = System.currentTimeMillis();
            long tempoAleatorio = endTime - startTime;

            System.out.println("Método: Selection Sort (com Array Aleatório) \nQuantidade de elementos no array: " + i
                    + "\nQuantidade de Iterações: " + interacoesAleatorio + "\nTempo em ms: " + tempoAleatorio
                    + "\nQuantidade de trocas: " + trocasAleatorio + "\n");

            System.out.println("------------------------------------");


            if (i == 1000) {
                i += 4000;
            } else {
                i += 5000;
            }
        } while (i <= 50000);

    }

}
