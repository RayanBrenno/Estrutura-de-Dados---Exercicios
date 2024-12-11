package Exercicios.OtimizacaoDeAlgoritmo;

public class OtimizarEncontrarPico {

    public static int encontrarPicoFinal(int[] arr, int primeiro, int ultimo, int meio) {
        if (arr[meio] > arr[meio - 1] && arr[meio] > arr[meio + 1]) {
            return arr[meio];
        } else if (arr[meio - 1] > arr[meio]) { // VAI TA PRA ESQUERDA O PICO
            return encontrarPicoFinal(arr, primeiro, meio - 1, (meio-1)/2);
        } else if(arr[meio + 1] > arr[meio]){ // VAI TA PRA DIREITA O PICO
            return encontrarPicoFinal(arr, meio + 1, ultimo, (meio+1+ultimo)/2);
        } else {
            return -1;
        }
    }
    
}
