package Exercicios;
import java.util.*;

public class ConjuntoOperacoes {

    public static List<Integer> uniao(List<Integer> a, List<Integer> b) {
        Set<Integer> conjuntoFinal = new HashSet<>(a);
        conjuntoFinal.addAll(b);
        List<Integer> resultado = new ArrayList<>(conjuntoFinal);
        Collections.sort(resultado);
        return resultado;
    }

    public static List<Integer> intersecacao(List<Integer> a, List<Integer> b) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer x : a) {
            if (b.contains(x) && !resultado.contains(x)) {
                resultado.add(x);
            }
        }
        Collections.sort(resultado);
        return resultado;
    }

    public static List<Integer> diferenca(List<Integer> a, List<Integer> b) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer x : a) {
            if (!b.contains(x) && !resultado.contains(x)) {
                resultado.add(x);
            }
        }
        Collections.sort(resultado);
        return resultado;
    }

    public static List<List<Integer>> conjuntoDasPartes(List<Integer> a) {
        List<List<Integer>> resultado = new ArrayList<>();
        int n = a.size();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subconjunto = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subconjunto.add(a.get(j));
                }
            }
            resultado.add(subconjunto);
        }
        return resultado;
    }

    public static List<List<Integer>> produtoCartesiano(List<Integer> a, List<Integer> b) {
        List<List<Integer>> resultado = new ArrayList<>();
        for (Integer x : a) {
            for (Integer y : b) {
                resultado.add(Arrays.asList(x, y));
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        // Testes para as funções
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 4, 5);

        System.out.println("União: " + uniao(a, b));
        System.out.println("Interseção: " + intersecacao(a, b));
        System.out.println("Diferença: " + diferenca(a, b));
        System.out.println("Conjunto das Partes: " + conjuntoDasPartes(a));
        System.out.println("Produto Cartesiano: " + produtoCartesiano(a, b));
    }
}
