//
//Encontre o k-ésimo maior elemento de um array desordenado. Por exemplo, dado o array [3, 2, 1, 5, 6, 4] e 𝑘 = 2, retorne 5. Assuma que 𝑘 é sempre um valor válido.
//

package Exercicios;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] array = { 3, 10, 4, 9, -5, 1, 2, -4 };
        int k = 2;
    
        array = ordenarDecrescente(array);
    
        System.out.println(array[k - 1]);
      }
    
      private static int[] ordenarDecrescente(int[] array) {
        for (int j = 0; j < array.length; j++) {
          for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
              int aux = array[i];
              array[i] = array[i + 1];
              array[i + 1] = aux;
            }
          }
        }
        imprimirArray(array);
        return array;
      }
    
      private static void imprimirArray(int[] array) {
        for (int i : array) {
          System.out.print(i);
          System.out.print(" ");
        }
        System.out.println("");
      }
    
}
