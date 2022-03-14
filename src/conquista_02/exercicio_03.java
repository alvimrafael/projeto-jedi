package conquista_02;

/* Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE */

public class exercicio_03 {
    public static void main (String[] args){

        int n1 = 100;

        if (n1 == 90){
            System.out.println("True");
        } else if (n1 == 110){
            System.out.println("True");
        } else if (n1 >= 80){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
