package conquista_02;

/* Criar um código que verifica se um valor de uma variável é igual a 100.
Caso verdadeiro, escrever no console: “Verdadeiro”.
Caso falso, escrever no console: “Falso” */

import java.util.Scanner;

public class exercicio_02 {
    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n1 = sc1.nextInt();

        if (n1 == 100) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
