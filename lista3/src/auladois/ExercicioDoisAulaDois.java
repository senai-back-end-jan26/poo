package auladois;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioDoisAulaDois {
    public static void main(String[] args) {
        //inicializando uma lista com seus respectivos valores
        List<Integer> lista1 = Arrays.asList(2, 5, 10, 0, 5);
        List<Integer> lista2 = Arrays.asList(0, 4, 1, 110, 0);

        //lista todos os números da lista1 removendo os repetidos
        Set<Integer> repetidos = new HashSet<>(lista1);
        //compara se existem valores repetidos nas listas repetidos e lista2
        repetidos.retainAll(lista2);

        //se a lista de repetidos não estiver vazia
        if (!repetidos.isEmpty()) {
            System.out.println("Números repetidos: " + repetidos);
        } else {
            System.out.println("Não há números repetidos!");
        }
    }
}
