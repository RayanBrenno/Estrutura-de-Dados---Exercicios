package Exercicios.OtimizacaoDeAlgoritmo;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int pico = OtimizarEncontrarPico.encontrarPicoFinal(arr,0,arr.length-1,((arr.length-1)/2));
        if (pico != -1) {
            System.out.println("Pico encontrado: " + pico);
        } else {
            System.out.println("Nenhum pico encontrado.");
        }       

        int[][] matriz = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int valorParaAchar = 10;
        boolean achado = OtimizarBuscarEmMatriz.buscarEmMatrizFinal(matriz,valorParaAchar, matriz.length);
        if (achado){
            System.out.println("O numero:"+valorParaAchar+" foi encontrado na matriz");
        } else{
            System.out.println("O numero:"+valorParaAchar+" nao foi encontrado na matriz");
        }

    }
}
