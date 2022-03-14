package conquista_02;

/* Criar um código que verifica se um valor de uma variável é igual a 100.
Caso verdadeiro, escrever no console: “Verdadeiro” */

import java.util.Scanner;

public class exercicio_01 {
    public static void main (String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = sc1.nextInt();

        if (num1 == 100){
            System.out.println("Verdadeiro");
        }
        sc1.close();
    }
}
