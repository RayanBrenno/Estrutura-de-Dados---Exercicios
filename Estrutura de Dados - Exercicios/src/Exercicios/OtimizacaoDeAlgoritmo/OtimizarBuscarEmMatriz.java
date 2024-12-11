package Exercicios.OtimizacaoDeAlgoritmo;

public class OtimizarBuscarEmMatriz {

    public static boolean buscarEmMatrizFinal(int[][] matriz, int valor, int qtdeLinhas){
        int linha = 0;
        int coluna = matriz[0].length-1;

        while (linha < qtdeLinhas && coluna >= 0) {
            // System.out.println(matriz[linha][coluna]); //Mostra o caminho
            if (matriz[linha][coluna] == valor) {
                return true;
            } else if (matriz[linha][coluna] > valor) { //ele desce
                coluna--;
            } else { // ele vai pra esquerda na linha
                linha++;
            }
        }
        return false;
    }
    
}