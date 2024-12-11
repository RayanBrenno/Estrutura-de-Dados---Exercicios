package MetodosOrdenacao.SelectionSort;

public class MetodoSelecao {

    public static int[] selecao(int[] arr){

        int trocas = 0;
        int iteracoes = 0;
        int aux;

        for(int i = 0; i<arr.length; i++){

            for(int j = i; j<arr.length; j++){
                iteracoes++;
                if(arr[j] < arr[i]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                    trocas++;
                }
            }

        }
        return new int[]{trocas, iteracoes};
    }

}