//
// Implemente um algoritmo que verifique parênteses, colchetes e chaves correspondentes. Esse algoritmo deve receber um valor String de entrada e retornar um Boolean.
//

package Exercicios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {
        public static void main(String[] args) {
            String[] array = {  "1 + 3 / (3 + 5)",
                                "(1 + 3) / [(3 + 5) * 5]",
                                "1 + [3 / (3] + 5)",
                                "{1 + [3} / (3 + 5)"};
            for (String entrada : array){
                System.out.println(verificarParentesesChavesEColchetes(entrada));
            }
    } 

    private static boolean verificarParentesesChavesEColchetes(String entrada){
        Map <String,String> dicionario = new HashMap<>();
        dicionario.put("(",")");
        dicionario.put("[","]");
        dicionario.put("{","}");
        List <String> arrayAbrir = new ArrayList<>();
        List <String> arrayFechar = new ArrayList<>();

        for (char bla : entrada.toCharArray()){
            String algorismo = String.valueOf(bla);
            if (dicionario.containsKey(algorismo)){
                arrayAbrir.add(algorismo);
            }
            else if (dicionario.containsValue(algorismo) ){
                arrayFechar.add(algorismo);
                if (!arrayAbrir.isEmpty() && dicionario.get(arrayAbrir.get(arrayAbrir.size() - 1)).equals(algorismo)) {
                    arrayAbrir.remove(arrayAbrir.size() - 1);
                    arrayFechar.remove(arrayFechar.size() - 1);
                }
            }
        };
        if (arrayAbrir.isEmpty() && arrayFechar.isEmpty() ) {return true;}
        else {return false;}
    }
}
