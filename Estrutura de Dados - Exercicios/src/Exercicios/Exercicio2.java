//
// Implemente um algoritmo que rotacione um array de 𝑛 elementos para a direita em 𝑘 passos. Por exemplo, com 𝑛 = 7 e 𝑘 = 3, o array [1, 2, 3, 4, 5, 6, 7] é modificado para [5, 6, 7, 1, 2, 3, 4].
//

package Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] entrada = { 1, 2, 3, 4, 5 };
        int k = 3;
    
        for (int i = 0; i < k; i++) {
          entrada = rotacionar(entrada);
        }
    
        for (int i : entrada) {
          System.out.print(i+" ");
        }
      }
    
      private static int[] rotacionar(int[] array) {
        int aux = array[array.length - 1];
    
        for (int i = array.length - 1; i > 0; i--) {
          array[i] = array[i - 1];
        }
    
        array[0] = aux;
    
        return array;
      }
    
}
