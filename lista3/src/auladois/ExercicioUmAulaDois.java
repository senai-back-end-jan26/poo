package auladois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUmAulaDois {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(); //instância
        Scanner sc = new Scanner(System.in); //instância
        int qtd, min, max, valor; //declaração de variáveis
        double med, soma = 0.0; //declaração de variáveis

        System.out.print("Quantos números você vai inserir? ");
        qtd = sc.nextInt();

        for(int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            valor = sc.nextInt();
            numeros.add(valor);
        }
        sc.close();
        
        max = Collections.max(numeros);
        min = Collections.min(numeros);
        
        //j recebe cada valor da lista números a cada iteração
        for (Integer j : numeros) {
            soma += j;    
        }
        med = soma / qtd;
        System.out.println("\nValor máximo: " + max
                        + "\nValor mínimo: " + min
                        + "\nMédia: " + med
        );
    }
}
