package MetodosOrdenacao.InsertSort;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GerarArrays {

    public static int[] GerarArrayOrdenado(int qtdElementos){
        int[] arr = new int[qtdElementos];
        for( int i=0; i<qtdElementos;i++){
            arr[i]=i+1;
        }
        return arr;
    }

    public static int[] GerarArrayOrdenadoInversamente(int qtdElementos){
        int[] arr = new int[qtdElementos];
        for( int i=0; i<qtdElementos;i++){
            arr[i]=qtdElementos-i;
        }
        return arr;
    }

    public static int[] GerarArrayAleatorio(int qtdElementos){
        int[] arr = new int[qtdElementos];
        Set<Integer> numerosUsados = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < qtdElementos; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(qtdElementos) + 1 ;
            } while (numerosUsados.contains(numeroAleatorio));
            
            arr[i] = numeroAleatorio;
            numerosUsados.add(numeroAleatorio);
        }
        return arr;
    }
    
}