package aulaum;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //instância
        int num1, num2, soma; //definição de variáveis
        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("\nInforme o segundo número: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.print("\nA soma é " + soma);
        sc.close();
    }
}
